package org.sinlapis;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.sinlapis.gen.MiniLanguageBaseVisitor;
import org.sinlapis.gen.MiniLanguageParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SinLapis
 */
public class TestVisitor extends MiniLanguageBaseVisitor<Integer> {
    private List<Word> words = new ArrayList<Word>();
    private List<String> symbols = new ArrayList<String>();
    private List<Integer> constants = new ArrayList<Integer>();
    private int symbolNum = 0;
    private int constantNum = 0;
    @Override
    public Integer visitStmt_sequence(MiniLanguageParser.Stmt_sequenceContext ctx) {
        return null;
    }

    @Override
    public Integer visitStatement(MiniLanguageParser.StatementContext ctx) {
        return null;
    }

    @Override
    public Integer visitIf_stmt(MiniLanguageParser.If_stmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitRepeat_stmt(MiniLanguageParser.Repeat_stmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitAssign_stmt(MiniLanguageParser.Assign_stmtContext ctx) {

        words.add(new Word(CodingDefination.ASSIGN, -1));
        visit(ctx.exp());

        return null;
    }

    @Override
    public Integer visitRead_stmt(MiniLanguageParser.Read_stmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitWrite_stmt(MiniLanguageParser.Write_stmtContext ctx) {
        return null;
    }

    @Override
    public Integer visitExp(MiniLanguageParser.ExpContext ctx) {
        return null;
    }

    @Override
    public Integer visitSimple_exp(MiniLanguageParser.Simple_expContext ctx) {
        return null;
    }

    @Override
    public Integer visitTerm(MiniLanguageParser.TermContext ctx) {
        return null;
    }

    @Override
    public Integer visitFactor(MiniLanguageParser.FactorContext ctx) {
        return null;
    }

    @Override
    public Integer visitProgarm(MiniLanguageParser.ProgarmContext ctx) {
        return null;
    }

    @Override
    public Integer visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
