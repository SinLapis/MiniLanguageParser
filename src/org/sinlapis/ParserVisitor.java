package org.sinlapis;

import org.sinlapis.gen.MiniLanguageBaseVisitor;
import org.sinlapis.gen.MiniLanguageParser;

/**
 * Created by SinLapis
 */
public class ParserVisitor extends MiniLanguageBaseVisitor<Integer> {
    @Override
    public Integer visitStmt_sequence(MiniLanguageParser.Stmt_sequenceContext ctx) {
        return super.visitStmt_sequence(ctx);
    }

    @Override
    public Integer visitStatement(MiniLanguageParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Integer visitIf_stmt(MiniLanguageParser.If_stmtContext ctx) {
        return super.visitIf_stmt(ctx);
    }

    @Override
    public Integer visitRepeat_stmt(MiniLanguageParser.Repeat_stmtContext ctx) {
        return super.visitRepeat_stmt(ctx);
    }

    @Override
    public Integer visitAssign_stmt(MiniLanguageParser.Assign_stmtContext ctx) {
        return super.visitAssign_stmt(ctx);
    }

    @Override
    public Integer visitRead_stmt(MiniLanguageParser.Read_stmtContext ctx) {
        return super.visitRead_stmt(ctx);
    }

    @Override
    public Integer visitWrite_stmt(MiniLanguageParser.Write_stmtContext ctx) {
        return super.visitWrite_stmt(ctx);
    }

    @Override
    public Integer visitExp(MiniLanguageParser.ExpContext ctx) {
        return super.visitExp(ctx);
    }

    @Override
    public Integer visitSimple_exp(MiniLanguageParser.Simple_expContext ctx) {
        return super.visitSimple_exp(ctx);
    }

    @Override
    public Integer visitTerm(MiniLanguageParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public Integer visitFactor(MiniLanguageParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }

    @Override
    public Integer visitProgarm(MiniLanguageParser.ProgarmContext ctx) {
        return super.visitProgarm(ctx);
    }
}
