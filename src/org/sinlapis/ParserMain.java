package org.sinlapis;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.sinlapis.gen.MiniLanguageLexer;
import org.sinlapis.gen.MiniLanguageParser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by SinLapis
 */
public class ParserMain {

    private static void createXMLTreeNode(ParseTree parseTree, Element fatherNode){
        int childrenCount = parseTree.getChildCount();
        String elementName = parseTree.getClass()
                .getSimpleName().replaceAll("Context", "");

        if(childrenCount == 0){
            String context = parseTree.getText();
            String name;
            if(CodingDefinition.key.containsKey(context)){
                name = CodingDefinition.key.get(context);
                Element element = fatherNode.addElement(name);
                element.setText(context);
            } else {
                try {
                    int value = Integer.parseInt(context);
                    name = "DecimalDigit";
                    Element element = fatherNode.addElement(name);
                    element.addAttribute("value", String.valueOf(value));
                } catch (NumberFormatException e) {
                    name = "Symbol";
                    Element element = fatherNode.addElement(name);
                    element.addAttribute("name", context);
                }
            }
        }
        for(int i = 0; i < childrenCount; i++){
            Element element = fatherNode.addElement(elementName);
            createXMLTreeNode(parseTree.getChild(i), element);
        }
    }
    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = br.readLine();
            InputStream is = new FileInputStream(fileName);
            ANTLRInputStream input = new ANTLRInputStream(is);
            MiniLanguageLexer miniLanguageLexer = new MiniLanguageLexer(input);
            CommonTokenStream commonTokenStream =
                    new CommonTokenStream(miniLanguageLexer);
            MiniLanguageParser miniLanguageParser =
                    new MiniLanguageParser(commonTokenStream);
            ParseTree parseTree = miniLanguageParser.progarm();

            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("Root");
            createXMLTreeNode(parseTree, root);

            XMLWriter writer = new XMLWriter(new FileWriter("ParserOut.xml"));
            writer.write(document);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
