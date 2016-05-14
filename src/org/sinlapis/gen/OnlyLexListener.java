// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\OnlyLex.g4 by ANTLR 4.5.1
package org.sinlapis.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OnlyLexParser}.
 */
public interface OnlyLexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OnlyLexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OnlyLexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OnlyLexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OnlyLexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterIf(OnlyLexParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitIf(OnlyLexParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterElse(OnlyLexParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitElse(OnlyLexParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterRead(OnlyLexParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitRead(OnlyLexParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterWrite(OnlyLexParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitWrite(OnlyLexParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code until}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterUntil(OnlyLexParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code until}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitUntil(OnlyLexParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(OnlyLexParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(OnlyLexParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSemi(OnlyLexParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSemi(OnlyLexParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterEqual(OnlyLexParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitEqual(OnlyLexParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterAssign(OnlyLexParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitAssign(OnlyLexParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code less}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterLess(OnlyLexParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code less}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitLess(OnlyLexParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterPlus(OnlyLexParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitPlus(OnlyLexParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterMinus(OnlyLexParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitMinus(OnlyLexParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterMulti(OnlyLexParser.MultiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitMulti(OnlyLexParser.MultiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterDiv(OnlyLexParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitDiv(OnlyLexParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterLeftParen(OnlyLexParser.LeftParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitLeftParen(OnlyLexParser.LeftParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterRightParen(OnlyLexParser.RightParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightParen}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitRightParen(OnlyLexParser.RightParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OnlyLexParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OnlyLexParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterDecimalConstant(OnlyLexParser.DecimalConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalConstant}
	 * labeled alternative in {@link OnlyLexParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitDecimalConstant(OnlyLexParser.DecimalConstantContext ctx);
}