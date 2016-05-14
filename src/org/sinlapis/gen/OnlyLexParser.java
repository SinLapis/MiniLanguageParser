// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\OnlyLex.g4 by ANTLR 4.5.1
package org.sinlapis.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OnlyLexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, Read=3, Write=4, Until=5, Repeat=6, Semi=7, Equal=8, Assign=9, 
		Less=10, Plus=11, Minus=12, Multi=13, Div=14, LeftParen=15, RightParen=16, 
		Identifier=17, DecimalConstant=18, Whitespace=19, Newline=20, BlockComment=21, 
		LineComment=22;
	public static final int
		RULE_program = 0, RULE_symbol = 1;
	public static final String[] ruleNames = {
		"program", "symbol"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'read'", "'write'", "'until'", "'repeat'", "';'", 
		"'='", "':='", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Else", "Read", "Write", "Until", "Repeat", "Semi", "Equal", 
		"Assign", "Less", "Plus", "Minus", "Multi", "Div", "LeftParen", "RightParen", 
		"Identifier", "DecimalConstant", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OnlyLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OnlyLexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				symbol();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Else) | (1L << Read) | (1L << Write) | (1L << Until) | (1L << Repeat) | (1L << Semi) | (1L << Equal) | (1L << Assign) | (1L << Less) | (1L << Plus) | (1L << Minus) | (1L << Multi) | (1L << Div) | (1L << LeftParen) | (1L << RightParen) | (1L << Identifier) | (1L << DecimalConstant))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	 
		public SymbolContext() { }
		public void copyFrom(SymbolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RightParenContext extends SymbolContext {
		public TerminalNode RightParen() { return getToken(OnlyLexParser.RightParen, 0); }
		public RightParenContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterRightParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitRightParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitRightParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends SymbolContext {
		public TerminalNode Minus() { return getToken(OnlyLexParser.Minus, 0); }
		public MinusContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends SymbolContext {
		public TerminalNode Identifier() { return getToken(OnlyLexParser.Identifier, 0); }
		public IdentifierContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends SymbolContext {
		public TerminalNode Read() { return getToken(OnlyLexParser.Read, 0); }
		public ReadContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalConstantContext extends SymbolContext {
		public TerminalNode DecimalConstant() { return getToken(OnlyLexParser.DecimalConstant, 0); }
		public DecimalConstantContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterDecimalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitDecimalConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitDecimalConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends SymbolContext {
		public TerminalNode Less() { return getToken(OnlyLexParser.Less, 0); }
		public LessContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends SymbolContext {
		public TerminalNode Plus() { return getToken(OnlyLexParser.Plus, 0); }
		public PlusContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiContext extends SymbolContext {
		public TerminalNode Multi() { return getToken(OnlyLexParser.Multi, 0); }
		public MultiContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterMulti(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitMulti(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitMulti(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends SymbolContext {
		public TerminalNode Equal() { return getToken(OnlyLexParser.Equal, 0); }
		public EqualContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends SymbolContext {
		public TerminalNode Div() { return getToken(OnlyLexParser.Div, 0); }
		public DivContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseContext extends SymbolContext {
		public TerminalNode Else() { return getToken(OnlyLexParser.Else, 0); }
		public ElseContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends SymbolContext {
		public TerminalNode Repeat() { return getToken(OnlyLexParser.Repeat, 0); }
		public RepeatContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UntilContext extends SymbolContext {
		public TerminalNode Until() { return getToken(OnlyLexParser.Until, 0); }
		public UntilContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitUntil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitUntil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemiContext extends SymbolContext {
		public TerminalNode Semi() { return getToken(OnlyLexParser.Semi, 0); }
		public SemiContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LeftParenContext extends SymbolContext {
		public TerminalNode LeftParen() { return getToken(OnlyLexParser.LeftParen, 0); }
		public LeftParenContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitLeftParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitLeftParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends SymbolContext {
		public TerminalNode If() { return getToken(OnlyLexParser.If, 0); }
		public IfContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends SymbolContext {
		public TerminalNode Write() { return getToken(OnlyLexParser.Write, 0); }
		public WriteContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends SymbolContext {
		public TerminalNode Assign() { return getToken(OnlyLexParser.Assign, 0); }
		public AssignContext(SymbolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OnlyLexListener ) ((OnlyLexListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OnlyLexVisitor ) return ((OnlyLexVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_symbol);
		try {
			setState(27);
			switch (_input.LA(1)) {
			case If:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(If);
				}
				break;
			case Else:
				_localctx = new ElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				match(Else);
				}
				break;
			case Read:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				match(Read);
				}
				break;
			case Write:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(12);
				match(Write);
				}
				break;
			case Until:
				_localctx = new UntilContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(13);
				match(Until);
				}
				break;
			case Repeat:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(14);
				match(Repeat);
				}
				break;
			case Semi:
				_localctx = new SemiContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(15);
				match(Semi);
				}
				break;
			case Equal:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(16);
				match(Equal);
				}
				break;
			case Assign:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(17);
				match(Assign);
				}
				break;
			case Less:
				_localctx = new LessContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(18);
				match(Less);
				}
				break;
			case Plus:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(19);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(20);
				match(Minus);
				}
				break;
			case Multi:
				_localctx = new MultiContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(21);
				match(Multi);
				}
				break;
			case Div:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(22);
				match(Div);
				}
				break;
			case LeftParen:
				_localctx = new LeftParenContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(23);
				match(LeftParen);
				}
				break;
			case RightParen:
				_localctx = new RightParenContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(24);
				match(RightParen);
				}
				break;
			case Identifier:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(25);
				match(Identifier);
				}
				break;
			case DecimalConstant:
				_localctx = new DecimalConstantContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(26);
				match(DecimalConstant);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30 \4\2\t\2\4\3\t"+
		"\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\2\2\4\2\4\2\2/\2\7\3\2\2"+
		"\2\4\35\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3"+
		"\2\2\2\n\3\3\2\2\2\13\36\7\3\2\2\f\36\7\4\2\2\r\36\7\5\2\2\16\36\7\6\2"+
		"\2\17\36\7\7\2\2\20\36\7\b\2\2\21\36\7\t\2\2\22\36\7\n\2\2\23\36\7\13"+
		"\2\2\24\36\7\f\2\2\25\36\7\r\2\2\26\36\7\16\2\2\27\36\7\17\2\2\30\36\7"+
		"\20\2\2\31\36\7\21\2\2\32\36\7\22\2\2\33\36\7\23\2\2\34\36\7\24\2\2\35"+
		"\13\3\2\2\2\35\f\3\2\2\2\35\r\3\2\2\2\35\16\3\2\2\2\35\17\3\2\2\2\35\20"+
		"\3\2\2\2\35\21\3\2\2\2\35\22\3\2\2\2\35\23\3\2\2\2\35\24\3\2\2\2\35\25"+
		"\3\2\2\2\35\26\3\2\2\2\35\27\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\35\32"+
		"\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\4\t\35";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}