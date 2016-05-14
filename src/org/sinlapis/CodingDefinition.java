package org.sinlapis;

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SinLapis
 */
class CodingDefinition {
    static final int SYMBOL = 1;
    static final int CONSTANT = 2;
    // Keyword
    static final int IF = 3;
    static final int ELSE = 4;
    static final int READ = 5;
    static final int WRITE = 6;
    static final int REPEAT = 7;
    static final int UNTIL = 8;
    // Operator
    static final int PLUS = 9;
    static final int MINUS = 10;
    static final int MULTI = 11;
    static final int DIV = 12;
    static final int LESS = 13;
    static final int EQUAL = 14;
    static final int ASSIGN = 15;
    // Separator
    static final int SEMI = 16;
    static final int LEFT_PAREN = 17;
    static final int RIGHT_PAREN = 18;

    static final Map<String, String> key = new HashMap<String, String>(){
        {
            put("if", "Keyword");
            put("else", "Keyword");
            put("read", "Keyword");
            put("write", "Keyword");
            put("until", "Keyword");
            put("repeat", "Keyword");

            put(";", "Semi");
            put("=", "Equal");
            put(":=", "Assign");
            put("<", "Less");
            put("+", "Plus");
            put("-", "Minus");
            put("*", "Multi");
            put("/", "Div");
            put("(", "LeftParen");
            put(")", "RightParen");

            put("<EOF>", "EOF");
        }
    };

}
