package org.sinlapis;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.XMLWriter;
import org.sinlapis.gen.OnlyLexLexer;
import org.sinlapis.gen.OnlyLexParser;

import java.io.*;
import java.util.List;

/**
 * Created by SinLapis
 */
public class LexMain {

    public static void printWordList(List<Word> words){
        for (Word word : words) {
            System.out.print(word.getCategory() + "," +
                    word.getValue() + "\n");
        }
    }
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = br.readLine();
            InputStream is = new FileInputStream(fileName);
            ANTLRInputStream input = new ANTLRInputStream(is);
            OnlyLexLexer onlyLexLexer = new OnlyLexLexer(input);
            CommonTokenStream commonTokenStream = new CommonTokenStream(onlyLexLexer);
            OnlyLexParser onlyLexParser = new OnlyLexParser(commonTokenStream);
            ParseTree parseTree = onlyLexParser.program();

            LexVisitor lexVisitor = new LexVisitor();
            lexVisitor.visit(parseTree);

            Document document = DocumentHelper.createDocument();
            Element root = document.addElement("Root");

            Element wordTable = root.addElement("WordTable");
            List<Word> words = lexVisitor.getWords();
            for (Word word1 : words) {
                Element word = wordTable.addElement("Word");
                Element category = word.addElement("Category");
                category.setText(String.valueOf(word1.getCategory()));
                Element value = word.addElement("Value");
                value.setText(String.valueOf(word1.getValue()));
            }

            Element symbolTable = root.addElement("SymbolTable");
            List<String> symbols = lexVisitor.getSymbols();
            for(int i = 0; i < symbols.size(); i++){
                Element symbol = symbolTable.addElement("Symbol");
                Element orderNumber = symbol.addElement("OrderNumber");
                orderNumber.setText(String.valueOf(i));
                Element name = symbol.addElement("Name");
                name.setText(symbols.get(i));
            }

            Element constantTable = root.addElement("ConstantTable");
            List<Integer> constants = lexVisitor.getConstants();
            for(int i = 0; i < constants.size(); i++){
                Element constant = constantTable.addElement("Constant");
                Element orderNumber = constant.addElement("OrderNumber");
                orderNumber.setText(String.valueOf(i));
                Element value = constant.addElement("Value");
                value.setText(String.valueOf(constants.get(i)));
            }

            XMLWriter writer = new XMLWriter(new FileWriter("LexOut.xml"));
            writer.write(document);
            writer.close();

//            printWordList(lexVisitor.getWords());
//            System.out.print(lexVisitor.getConstants() + "\n");
//            System.out.print(lexVisitor.getSymbols() + "\n");
//            System.out.print(lexVisitor.getErrorWords() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
