// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\OnlyLex.g4 by ANTLR 4.5.1
package org.sinlapis.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OnlyLexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, Read=3, Write=4, Until=5, Repeat=6, Semi=7, Equal=8, Assign=9, 
		Less=10, Plus=11, Minus=12, Multi=13, Div=14, LeftParen=15, RightParen=16, 
		Identifier=17, DecimalConstant=18, Whitespace=19, Newline=20, BlockComment=21, 
		LineComment=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"If", "Else", "Read", "Write", "Until", "Repeat", "Semi", "Equal", "Assign", 
		"Less", "Plus", "Minus", "Multi", "Div", "LeftParen", "RightParen", "Identifier", 
		"DecimalConstant", "Digit", "NonzeroDigit", "Nondigit", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
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


	public OnlyLexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OnlyLex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\7\22n\n\22\f\22\16\22q\13"+
		"\22\3\23\3\23\6\23u\n\23\r\23\16\23v\3\23\5\23z\n\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\6\27\u0083\n\27\r\27\16\27\u0084\3\27\3\27\3\30\3\30"+
		"\5\30\u008b\n\30\3\30\5\30\u008e\n\30\3\30\3\30\3\31\3\31\3\31\3\31\7"+
		"\31\u0096\n\31\f\31\16\31\u0099\13\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\7\32\u00a4\n\32\f\32\16\32\u00a7\13\32\3\32\3\32\3\u0097"+
		"\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\2)\2+\2-\25/\26\61\27\63\30\3\2\7\3\2\62;\3\2"+
		"\63;\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17\u00af\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\58\3\2\2\2\7=\3"+
		"\2\2\2\tB\3\2\2\2\13H\3\2\2\2\rN\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3"+
		"\2\2\2\25\\\3\2\2\2\27^\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37"+
		"f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2"+
		"\2\2-\u0082\3\2\2\2/\u008d\3\2\2\2\61\u0091\3\2\2\2\63\u009f\3\2\2\2\65"+
		"\66\7k\2\2\66\67\7h\2\2\67\4\3\2\2\289\7g\2\29:\7n\2\2:;\7u\2\2;<\7g\2"+
		"\2<\6\3\2\2\2=>\7t\2\2>?\7g\2\2?@\7c\2\2@A\7f\2\2A\b\3\2\2\2BC\7y\2\2"+
		"CD\7t\2\2DE\7k\2\2EF\7v\2\2FG\7g\2\2G\n\3\2\2\2HI\7w\2\2IJ\7p\2\2JK\7"+
		"v\2\2KL\7k\2\2LM\7n\2\2M\f\3\2\2\2NO\7t\2\2OP\7g\2\2PQ\7r\2\2QR\7g\2\2"+
		"RS\7c\2\2ST\7v\2\2T\16\3\2\2\2UV\7=\2\2V\20\3\2\2\2WX\7?\2\2X\22\3\2\2"+
		"\2YZ\7<\2\2Z[\7?\2\2[\24\3\2\2\2\\]\7>\2\2]\26\3\2\2\2^_\7-\2\2_\30\3"+
		"\2\2\2`a\7/\2\2a\32\3\2\2\2bc\7,\2\2c\34\3\2\2\2de\7\61\2\2e\36\3\2\2"+
		"\2fg\7*\2\2g \3\2\2\2hi\7+\2\2i\"\3\2\2\2jo\5+\26\2kn\5+\26\2ln\5\'\24"+
		"\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p$\3\2\2\2qo\3\2\2"+
		"\2rt\5)\25\2su\5\'\24\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2"+
		"\2\2xz\5\'\24\2yr\3\2\2\2yx\3\2\2\2z&\3\2\2\2{|\t\2\2\2|(\3\2\2\2}~\t"+
		"\3\2\2~*\3\2\2\2\177\u0080\t\4\2\2\u0080,\3\2\2\2\u0081\u0083\t\5\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\27\2\2\u0087.\3\2\2\2\u0088"+
		"\u008a\7\17\2\2\u0089\u008b\7\f\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008e\7\f\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\30\2\2\u0090\60\3\2\2"+
		"\2\u0091\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0097\3\2\2\2\u0094\u0096"+
		"\13\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b"+
		"\7,\2\2\u009b\u009c\7\61\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\31\2\2"+
		"\u009e\62\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\7\61\2\2\u00a1\u00a5"+
		"\3\2\2\2\u00a2\u00a4\n\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\b\32\2\2\u00a9\64\3\2\2\2\f\2movy\u0084\u008a\u008d\u0097"+
		"\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}