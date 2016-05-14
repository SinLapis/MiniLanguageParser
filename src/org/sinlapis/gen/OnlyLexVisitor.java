// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\OnlyLex.g4 by ANTLR 4.5.1
package org.sinlapis.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OnlyLexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OnlyLexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OnlyLexParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OnlyLexParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(OnlyLexParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(OnlyLexParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(OnlyLexParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(OnlyLexParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code until}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil(OnlyLexParser.UntilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(OnlyLexParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code semi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(OnlyLexParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(OnlyLexParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(OnlyLexParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code less}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(OnlyLexParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(OnlyLexParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(OnlyLexParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti(OnlyLexParser.MultiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(OnlyLexParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftParen(OnlyLexParser.LeftParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightParen(OnlyLexParser.RightParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OnlyLexParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalConstant(OnlyLexParser.DecimalConstantContext ctx);
}