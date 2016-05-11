// Generated from C:/Users/SinLa_000/Desktop/Start/Project/MiniLanguageParser/src\MiniLanguage.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Then=2, End=3, Else=4, Read=5, Write=6, Until=7, Repeat=8, Semi=9, 
		Equal=10, Assign=11, Less=12, Plus=13, Minus=14, Multi=15, Div=16, LeftParen=17, 
		RightParen=18, Identifier=19, DecimalConstant=20, Whitespace=21, Newline=22, 
		BlockComment=23, LineComment=24;
	public static final int
		RULE_statement = 0, RULE_if_stmt = 1, RULE_repeat_stmt = 2, RULE_assign_stmt = 3, 
		RULE_read_stmt = 4, RULE_write_stmt = 5, RULE_exp = 6, RULE_simple_exp = 7, 
		RULE_term = 8, RULE_factor = 9, RULE_progarm = 10, RULE_stmt_sequence = 11;
	public static final String[] ruleNames = {
		"statement", "if_stmt", "repeat_stmt", "assign_stmt", "read_stmt", "write_stmt", 
		"exp", "simple_exp", "term", "factor", "progarm", "stmt_sequence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'then'", "' end'", "'else'", "'read'", "'write'", "'until'", 
		"'repeat'", "';'", "'='", "':='", "'<'", "'+'", "'-'", "'*'", "'/'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Then", "End", "Else", "Read", "Write", "Until", "Repeat", 
		"Semi", "Equal", "Assign", "Less", "Plus", "Minus", "Multi", "Div", "LeftParen", 
		"RightParen", "Identifier", "DecimalConstant", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "MiniLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				if_stmt();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				repeat_stmt();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				assign_stmt();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				read_stmt();
				}
				break;
			case Write:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				write_stmt();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(MiniLanguageParser.If, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Then() { return getToken(MiniLanguageParser.Then, 0); }
		public List<Stmt_sequenceContext> stmt_sequence() {
			return getRuleContexts(Stmt_sequenceContext.class);
		}
		public Stmt_sequenceContext stmt_sequence(int i) {
			return getRuleContext(Stmt_sequenceContext.class,i);
		}
		public TerminalNode End() { return getToken(MiniLanguageParser.End, 0); }
		public TerminalNode Semi() { return getToken(MiniLanguageParser.Semi, 0); }
		public TerminalNode Else() { return getToken(MiniLanguageParser.Else, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_if_stmt);
		try {
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(If);
				setState(32);
				exp();
				setState(33);
				match(Then);
				setState(34);
				stmt_sequence(0);
				setState(35);
				match(End);
				setState(36);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(If);
				setState(39);
				exp();
				setState(40);
				match(Then);
				setState(41);
				stmt_sequence(0);
				setState(42);
				match(Else);
				setState(43);
				stmt_sequence(0);
				setState(44);
				match(End);
				setState(45);
				match(Semi);
				}
				break;
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

	public static class Repeat_stmtContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(MiniLanguageParser.Repeat, 0); }
		public Stmt_sequenceContext stmt_sequence() {
			return getRuleContext(Stmt_sequenceContext.class,0);
		}
		public TerminalNode Until() { return getToken(MiniLanguageParser.Until, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MiniLanguageParser.Semi, 0); }
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterRepeat_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitRepeat_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitRepeat_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Repeat);
			setState(50);
			stmt_sequence(0);
			setState(51);
			match(Until);
			setState(52);
			exp();
			setState(53);
			match(Semi);
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniLanguageParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(MiniLanguageParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MiniLanguageParser.Semi, 0); }
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Identifier);
			setState(56);
			match(Assign);
			setState(57);
			exp();
			setState(58);
			match(Semi);
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

	public static class Read_stmtContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(MiniLanguageParser.Read, 0); }
		public TerminalNode Identifier() { return getToken(MiniLanguageParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(MiniLanguageParser.Semi, 0); }
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitRead_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(Read);
			setState(61);
			match(Identifier);
			setState(62);
			match(Semi);
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

	public static class Write_stmtContext extends ParserRuleContext {
		public TerminalNode Write() { return getToken(MiniLanguageParser.Write, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MiniLanguageParser.Semi, 0); }
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitWrite_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(Write);
			setState(65);
			exp();
			setState(66);
			match(Semi);
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

	public static class ExpContext extends ParserRuleContext {
		public List<Simple_expContext> simple_exp() {
			return getRuleContexts(Simple_expContext.class);
		}
		public Simple_expContext simple_exp(int i) {
			return getRuleContext(Simple_expContext.class,i);
		}
		public TerminalNode Equal() { return getToken(MiniLanguageParser.Equal, 0); }
		public TerminalNode Less() { return getToken(MiniLanguageParser.Less, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exp);
		try {
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				simple_exp(0);
				setState(69);
				match(Equal);
				setState(70);
				simple_exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				simple_exp(0);
				setState(73);
				match(Less);
				setState(74);
				simple_exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				simple_exp(0);
				}
				break;
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

	public static class Simple_expContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Simple_expContext simple_exp() {
			return getRuleContext(Simple_expContext.class,0);
		}
		public TerminalNode Plus() { return getToken(MiniLanguageParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MiniLanguageParser.Minus, 0); }
		public Simple_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterSimple_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitSimple_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitSimple_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_expContext simple_exp() throws RecognitionException {
		return simple_exp(0);
	}

	private Simple_expContext simple_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_expContext _localctx = new Simple_expContext(_ctx, _parentState);
		Simple_expContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_simple_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Simple_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_exp);
						setState(82);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(83);
						match(Plus);
						setState(84);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new Simple_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_exp);
						setState(85);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(86);
						match(Minus);
						setState(87);
						term(0);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Multi() { return getToken(MiniLanguageParser.Multi, 0); }
		public TerminalNode Div() { return getToken(MiniLanguageParser.Div, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(94);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(Multi);
						setState(98);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(99);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(100);
						match(Div);
						setState(101);
						factor();
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MiniLanguageParser.LeftParen, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MiniLanguageParser.RightParen, 0); }
		public TerminalNode DecimalConstant() { return getToken(MiniLanguageParser.DecimalConstant, 0); }
		public TerminalNode Identifier() { return getToken(MiniLanguageParser.Identifier, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(LeftParen);
				setState(108);
				exp();
				setState(109);
				match(RightParen);
				}
				break;
			case DecimalConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(DecimalConstant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(Identifier);
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

	public static class ProgarmContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiniLanguageParser.EOF, 0); }
		public Stmt_sequenceContext stmt_sequence() {
			return getRuleContext(Stmt_sequenceContext.class,0);
		}
		public ProgarmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progarm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterProgarm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitProgarm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitProgarm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgarmContext progarm() throws RecognitionException {
		ProgarmContext _localctx = new ProgarmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_progarm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Read) | (1L << Write) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				setState(115);
				stmt_sequence(0);
				}
			}

			setState(118);
			match(EOF);
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

	public static class Stmt_sequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Stmt_sequenceContext stmt_sequence() {
			return getRuleContext(Stmt_sequenceContext.class,0);
		}
		public Stmt_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).enterStmt_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniLanguageListener ) ((MiniLanguageListener)listener).exitStmt_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniLanguageVisitor ) return ((MiniLanguageVisitor<? extends T>)visitor).visitStmt_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_sequenceContext stmt_sequence() throws RecognitionException {
		return stmt_sequence(0);
	}

	private Stmt_sequenceContext stmt_sequence(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Stmt_sequenceContext _localctx = new Stmt_sequenceContext(_ctx, _parentState);
		Stmt_sequenceContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_stmt_sequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Stmt_sequenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt_sequence);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					statement();
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return simple_exp_sempred((Simple_expContext)_localctx, predIndex);
		case 8:
			return term_sempred((TermContext)_localctx, predIndex);
		case 11:
			return stmt_sequence_sempred((Stmt_sequenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simple_exp_sempred(Simple_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmt_sequence_sempred(Stmt_sequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t[\n\t\f\t\16\t^\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ni"+
		"\n\n\f\n\16\nl\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n\13\3\f\5\fw"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\7\r\u0080\n\r\f\r\16\r\u0083\13\r\3\r"+
		"\2\5\20\22\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u0087\2\37\3\2\2\2"+
		"\4\61\3\2\2\2\6\63\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fB\3\2\2\2\16O\3\2\2"+
		"\2\20Q\3\2\2\2\22_\3\2\2\2\24s\3\2\2\2\26v\3\2\2\2\30z\3\2\2\2\32 \5\4"+
		"\3\2\33 \5\6\4\2\34 \5\b\5\2\35 \5\n\6\2\36 \5\f\7\2\37\32\3\2\2\2\37"+
		"\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \3\3\2\2\2!\"\7"+
		"\3\2\2\"#\5\16\b\2#$\7\4\2\2$%\5\30\r\2%&\7\5\2\2&\'\7\13\2\2\'\62\3\2"+
		"\2\2()\7\3\2\2)*\5\16\b\2*+\7\4\2\2+,\5\30\r\2,-\7\6\2\2-.\5\30\r\2./"+
		"\7\5\2\2/\60\7\13\2\2\60\62\3\2\2\2\61!\3\2\2\2\61(\3\2\2\2\62\5\3\2\2"+
		"\2\63\64\7\n\2\2\64\65\5\30\r\2\65\66\7\t\2\2\66\67\5\16\b\2\678\7\13"+
		"\2\28\7\3\2\2\29:\7\25\2\2:;\7\r\2\2;<\5\16\b\2<=\7\13\2\2=\t\3\2\2\2"+
		">?\7\7\2\2?@\7\25\2\2@A\7\13\2\2A\13\3\2\2\2BC\7\b\2\2CD\5\16\b\2DE\7"+
		"\13\2\2E\r\3\2\2\2FG\5\20\t\2GH\7\f\2\2HI\5\20\t\2IP\3\2\2\2JK\5\20\t"+
		"\2KL\7\16\2\2LM\5\20\t\2MP\3\2\2\2NP\5\20\t\2OF\3\2\2\2OJ\3\2\2\2ON\3"+
		"\2\2\2P\17\3\2\2\2QR\b\t\1\2RS\5\22\n\2S\\\3\2\2\2TU\f\5\2\2UV\7\17\2"+
		"\2V[\5\22\n\2WX\f\4\2\2XY\7\20\2\2Y[\5\22\n\2ZT\3\2\2\2ZW\3\2\2\2[^\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\21\3\2\2\2^\\\3\2\2\2_`\b\n\1\2`a\5\24\13"+
		"\2aj\3\2\2\2bc\f\5\2\2cd\7\21\2\2di\5\24\13\2ef\f\4\2\2fg\7\22\2\2gi\5"+
		"\24\13\2hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\23\3\2\2\2"+
		"lj\3\2\2\2mn\7\23\2\2no\5\16\b\2op\7\24\2\2pt\3\2\2\2qt\7\26\2\2rt\7\25"+
		"\2\2sm\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uw\5\30\r\2vu\3\2\2\2vw"+
		"\3\2\2\2wx\3\2\2\2xy\7\2\2\3y\27\3\2\2\2z{\b\r\1\2{|\5\2\2\2|\u0081\3"+
		"\2\2\2}~\f\4\2\2~\u0080\5\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\31\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\f\37\61OZ\\hjsv\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}