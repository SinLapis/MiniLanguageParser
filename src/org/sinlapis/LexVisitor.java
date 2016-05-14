package org.sinlapis;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.sinlapis.gen.OnlyLexBaseVisitor;
import org.sinlapis.gen.OnlyLexParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SinLapis
 */
class LexVisitor extends OnlyLexBaseVisitor<Integer> {
    private List<Word> words = new ArrayList<Word>();
    private List<String> symbols = new ArrayList<String>();
    private List<Integer> constants = new ArrayList<Integer>();
    private int symbolNum = 0;
    private int constantNum = 0;
    @Override
    public Integer visitIf(OnlyLexParser.IfContext ctx) {
        words.add(new Word(CodingDefination.IF, -1));
        return super.visitIf(ctx);
    }

    @Override
    public Integer visitElse(OnlyLexParser.ElseContext ctx) {
        words.add(new Word(CodingDefination.ELSE, -1));
        return super.visitElse(ctx);
    }

    @Override
    public Integer visitRead(OnlyLexParser.ReadContext ctx) {
        words.add(new Word(CodingDefination.READ, -1));
        return super.visitRead(ctx);
    }

    @Override
    public Integer visitWrite(OnlyLexParser.WriteContext ctx) {
        words.add(new Word(CodingDefination.WRITE, -1));
        return super.visitWrite(ctx);
    }

    @Override
    public Integer visitUntil(OnlyLexParser.UntilContext ctx) {
        words.add(new Word(CodingDefination.UNTIL, -1));
        return super.visitUntil(ctx);
    }

    @Override
    public Integer visitRepeat(OnlyLexParser.RepeatContext ctx) {
        words.add(new Word(CodingDefination.REPEAT, -1));
        return super.visitRepeat(ctx);
    }

    @Override
    public Integer visitSemi(OnlyLexParser.SemiContext ctx) {
        words.add(new Word(CodingDefination.SEMI, -1));
        return super.visitSemi(ctx);
    }

    @Override
    public Integer visitEqual(OnlyLexParser.EqualContext ctx) {
        words.add(new Word(CodingDefination.EQUAL, -1));
        return super.visitEqual(ctx);
    }

    @Override
    public Integer visitAssign(OnlyLexParser.AssignContext ctx) {
        words.add(new Word(CodingDefination.ASSIGN, -1));
        return super.visitAssign(ctx);
    }

    @Override
    public Integer visitLess(OnlyLexParser.LessContext ctx) {
        words.add(new Word(CodingDefination.LESS, -1));
        return super.visitLess(ctx);
    }

    @Override
    public Integer visitPlus(OnlyLexParser.PlusContext ctx) {
        words.add(new Word(CodingDefination.PLUS, -1));
        return super.visitPlus(ctx);
    }

    @Override
    public Integer visitMinus(OnlyLexParser.MinusContext ctx) {
        words.add(new Word(CodingDefination.MINUS, -1));
        return super.visitMinus(ctx);
    }

    @Override
    public Integer visitMulti(OnlyLexParser.MultiContext ctx) {
        words.add(new Word(CodingDefination.MULTI, -1));
        return super.visitMulti(ctx);
    }

    @Override
    public Integer visitDiv(OnlyLexParser.DivContext ctx) {
        words.add(new Word(CodingDefination.DIV, -1));
        return super.visitDiv(ctx);
    }

    @Override
    public Integer visitLeftParen(OnlyLexParser.LeftParenContext ctx) {
        words.add(new Word(CodingDefination.LEFT_PAREN, -1));
        return super.visitLeftParen(ctx);
    }

    @Override
    public Integer visitRightParen(OnlyLexParser.RightParenContext ctx) {
        words.add(new Word(CodingDefination.RIGHT_PAREN, -1));
        return super.visitRightParen(ctx);
    }

    @Override
    public Integer visitIdentifier(OnlyLexParser.IdentifierContext ctx) {
        String symbol = ctx.Identifier().getText();
        int symbolIndex = symbols.indexOf(symbol);
        if(symbolIndex >= 0){
            words.add(new Word(CodingDefination.SYMBOL, symbolIndex));
        } else {
            symbols.add(symbol);
            words.add(new Word(CodingDefination.SYMBOL, symbolNum));
            symbolNum++;
        }
        return super.visitIdentifier(ctx);
    }

    @Override
    public Integer visitDecimalConstant(OnlyLexParser.DecimalConstantContext ctx) {
        int decimalConstant = Integer.parseInt(ctx.getText());
        int constantIndex = constants.indexOf(decimalConstant);
        if(constantIndex >= 0){
            words.add(new Word(CodingDefination.CONSTANT, constantIndex));
        } else {
            constants.add(decimalConstant);
            words.add(new Word(CodingDefination.CONSTANT, constantNum));
            constantNum++;
        }
        return super.visitDecimalConstant(ctx);
    }

    List<Word> getWords() {
        return words;
    }

    List<String> getSymbols() {
        return symbols;
    }

    List<Integer> getConstants() {
        return constants;
    }

}
