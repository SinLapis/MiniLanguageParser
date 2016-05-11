// Generated from C:/Users/SinLa_000/Desktop/Start/Project/MiniLanguageParser/src\MiniLanguage.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniLanguageParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(MiniLanguageParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#repeat_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stmt(MiniLanguageParser.Repeat_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(MiniLanguageParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#read_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stmt(MiniLanguageParser.Read_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#write_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stmt(MiniLanguageParser.Write_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(MiniLanguageParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#simple_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_exp(MiniLanguageParser.Simple_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiniLanguageParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MiniLanguageParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#progarm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgarm(MiniLanguageParser.ProgarmContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniLanguageParser#stmt_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_sequence(MiniLanguageParser.Stmt_sequenceContext ctx);
}