// Generated from C:/Users/SinLa_000/Desktop/Start/Project/MiniLanguageParser/src\MiniLanguage.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniLanguageParser}.
 */
public interface MiniLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MiniLanguageParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MiniLanguageParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_stmt(MiniLanguageParser.Repeat_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#repeat_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_stmt(MiniLanguageParser.Repeat_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(MiniLanguageParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(MiniLanguageParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(MiniLanguageParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(MiniLanguageParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(MiniLanguageParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(MiniLanguageParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MiniLanguageParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MiniLanguageParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void enterSimple_exp(MiniLanguageParser.Simple_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#simple_exp}.
	 * @param ctx the parse tree
	 */
	void exitSimple_exp(MiniLanguageParser.Simple_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniLanguageParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniLanguageParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniLanguageParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniLanguageParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#progarm}.
	 * @param ctx the parse tree
	 */
	void enterProgarm(MiniLanguageParser.ProgarmContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#progarm}.
	 * @param ctx the parse tree
	 */
	void exitProgarm(MiniLanguageParser.ProgarmContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniLanguageParser#stmt_sequence}.
	 * @param ctx the parse tree
	 */
	void enterStmt_sequence(MiniLanguageParser.Stmt_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniLanguageParser#stmt_sequence}.
	 * @param ctx the parse tree
	 */
	void exitStmt_sequence(MiniLanguageParser.Stmt_sequenceContext ctx);
}