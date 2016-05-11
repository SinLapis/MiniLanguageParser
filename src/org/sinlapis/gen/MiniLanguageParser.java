// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\MiniLanguage.g4 by ANTLR 4.5.1
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
		RULE_stmt_sequence = 0, RULE_statement = 1, RULE_if_stmt = 2, RULE_repeat_stmt = 3, 
		RULE_assign_stmt = 4, RULE_read_stmt = 5, RULE_write_stmt = 6, RULE_exp = 7, 
		RULE_simple_exp = 8, RULE_term = 9, RULE_factor = 10, RULE_progarm = 11;
	public static final String[] ruleNames = {
		"stmt_sequence", "statement", "if_stmt", "repeat_stmt", "assign_stmt", 
		"read_stmt", "write_stmt", "exp", "simple_exp", "term", "factor", "progarm"
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
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_stmt_sequence, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Stmt_sequenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_stmt_sequence);
					setState(27);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(28);
					statement();
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(39);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				if_stmt();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				repeat_stmt();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				assign_stmt();
				}
				break;
			case Read:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				read_stmt();
				}
				break;
			case Write:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
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
		public TerminalNode Else() { return getToken(MiniLanguageParser.Else, 0); }
		public TerminalNode EOF() { return getToken(MiniLanguageParser.EOF, 0); }
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
		enterRule(_localctx, 4, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(If);
			setState(42);
			exp();
			setState(43);
			match(Then);
			setState(44);
			stmt_sequence(0);
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(45);
				match(Else);
				setState(46);
				stmt_sequence(0);
				}
				break;
			}
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(49);
				match(EOF);
				}
				break;
			}
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
		enterRule(_localctx, 6, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Repeat);
			setState(53);
			stmt_sequence(0);
			setState(54);
			match(Until);
			setState(55);
			exp();
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
		enterRule(_localctx, 8, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Identifier);
			setState(58);
			match(Assign);
			setState(59);
			exp();
			setState(60);
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
		enterRule(_localctx, 10, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Read);
			setState(63);
			match(Identifier);
			setState(64);
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
		enterRule(_localctx, 12, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Write);
			setState(67);
			exp();
			setState(68);
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
		enterRule(_localctx, 14, RULE_exp);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				simple_exp(0);
				setState(71);
				match(Equal);
				setState(72);
				simple_exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				simple_exp(0);
				setState(75);
				match(Less);
				setState(76);
				simple_exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_simple_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Simple_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_exp);
						setState(84);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(85);
						match(Plus);
						setState(86);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new Simple_expContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simple_exp);
						setState(87);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(88);
						match(Minus);
						setState(89);
						term(0);
						}
						break;
					}
					} 
				}
				setState(94);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(104);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(98);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(99);
						match(Multi);
						setState(100);
						factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(Div);
						setState(103);
						factor();
						}
						break;
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(LeftParen);
				setState(110);
				exp();
				setState(111);
				match(RightParen);
				}
				break;
			case DecimalConstant:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(DecimalConstant);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
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
		enterRule(_localctx, 22, RULE_progarm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Read) | (1L << Write) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				setState(117);
				stmt_sequence(0);
				}
			}

			setState(120);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return stmt_sequence_sempred((Stmt_sequenceContext)_localctx, predIndex);
		case 8:
			return simple_exp_sempred((Simple_expContext)_localctx, predIndex);
		case 9:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stmt_sequence_sempred(Stmt_sequenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simple_exp_sempred(Simple_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\5\4\65\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fv\n"+
		"\f\3\r\5\ry\n\r\3\r\3\r\3\r\2\5\2\22\24\16\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\2\2\u0080\2\32\3\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b\66\3\2\2\2\n;\3\2\2"+
		"\2\f@\3\2\2\2\16D\3\2\2\2\20Q\3\2\2\2\22S\3\2\2\2\24a\3\2\2\2\26u\3\2"+
		"\2\2\30x\3\2\2\2\32\33\b\2\1\2\33\34\5\4\3\2\34!\3\2\2\2\35\36\f\4\2\2"+
		"\36 \5\4\3\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2"+
		"\2#!\3\2\2\2$*\5\6\4\2%*\5\b\5\2&*\5\n\6\2\'*\5\f\7\2(*\5\16\b\2)$\3\2"+
		"\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\3\2\2,-\5"+
		"\20\t\2-.\7\4\2\2.\61\5\2\2\2/\60\7\6\2\2\60\62\5\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\64\3\2\2\2\63\65\7\2\2\3\64\63\3\2\2\2\64\65\3\2\2\2\65"+
		"\7\3\2\2\2\66\67\7\n\2\2\678\5\2\2\289\7\t\2\29:\5\20\t\2:\t\3\2\2\2;"+
		"<\7\25\2\2<=\7\r\2\2=>\5\20\t\2>?\7\13\2\2?\13\3\2\2\2@A\7\7\2\2AB\7\25"+
		"\2\2BC\7\13\2\2C\r\3\2\2\2DE\7\b\2\2EF\5\20\t\2FG\7\13\2\2G\17\3\2\2\2"+
		"HI\5\22\n\2IJ\7\f\2\2JK\5\22\n\2KR\3\2\2\2LM\5\22\n\2MN\7\16\2\2NO\5\22"+
		"\n\2OR\3\2\2\2PR\5\22\n\2QH\3\2\2\2QL\3\2\2\2QP\3\2\2\2R\21\3\2\2\2ST"+
		"\b\n\1\2TU\5\24\13\2U^\3\2\2\2VW\f\5\2\2WX\7\17\2\2X]\5\24\13\2YZ\f\4"+
		"\2\2Z[\7\20\2\2[]\5\24\13\2\\V\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_\23\3\2\2\2`^\3\2\2\2ab\b\13\1\2bc\5\26\f\2cl\3\2\2\2de\f\5"+
		"\2\2ef\7\21\2\2fk\5\26\f\2gh\f\4\2\2hi\7\22\2\2ik\5\26\f\2jd\3\2\2\2j"+
		"g\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\25\3\2\2\2nl\3\2\2\2op\7\23\2"+
		"\2pq\5\20\t\2qr\7\24\2\2rv\3\2\2\2sv\7\26\2\2tv\7\25\2\2uo\3\2\2\2us\3"+
		"\2\2\2ut\3\2\2\2v\27\3\2\2\2wy\5\2\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z"+
		"{\7\2\2\3{\31\3\2\2\2\r!)\61\64Q\\^jlux";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}