package org.sinlapis;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sinlapis.gen.MiniLanguageLexer;
import org.sinlapis.gen.MiniLanguageParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream =
                    new FileInputStream("test.txt");
            ANTLRInputStream antlrInputStream = new ANTLRInputStream(inputStream);
            MiniLanguageLexer miniLanguageLexer =
                    new MiniLanguageLexer(antlrInputStream);
            CommonTokenStream commonTokenStream =
                    new CommonTokenStream(miniLanguageLexer);
            System.out.print("" + commonTokenStream.getTokens());
            MiniLanguageParser miniLanguageParser =
                    new MiniLanguageParser(commonTokenStream);
            ParseTree parseTree = miniLanguageParser.progarm();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
