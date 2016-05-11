// Generated from C:/Users/SinLa/Desktop/Start/Project/MiniLanguageParser/src\MiniLanguage.g4 by ANTLR 4.5.1
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
public class MiniLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Then=2, End=3, Else=4, Read=5, Write=6, Until=7, Repeat=8, Semi=9, 
		Equal=10, Assign=11, Less=12, Plus=13, Minus=14, Multi=15, Div=16, LeftParen=17, 
		RightParen=18, Identifier=19, DecimalConstant=20, Whitespace=21, Newline=22, 
		BlockComment=23, LineComment=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"If", "Then", "End", "Else", "Read", "Write", "Until", "Repeat", "Semi", 
		"Equal", "Assign", "Less", "Plus", "Minus", "Multi", "Div", "LeftParen", 
		"RightParen", "Identifier", "DecimalConstant", "Digit", "NonzeroDigit", 
		"Nondigit", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public MiniLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00b8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24|\n\24\f\24\16\24\177\13\24"+
		"\3\25\3\25\6\25\u0083\n\25\r\25\16\25\u0084\3\25\5\25\u0088\n\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u0091\n\31\r\31\16\31\u0092\3\31\3"+
		"\31\3\32\3\32\5\32\u0099\n\32\3\32\5\32\u009c\n\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\7\33\u00a4\n\33\f\33\16\33\u00a7\13\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\7\34\u00b2\n\34\f\34\16\34\u00b5\13\34\3\34"+
		"\3\34\3\u00a5\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\27\63\30\65"+
		"\31\67\32\3\2\7\3\2\62;\3\2\63;\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\17\17"+
		"\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7A\3\2\2\2\tF\3\2\2"+
		"\2\13K\3\2\2\2\rP\3\2\2\2\17V\3\2\2\2\21\\\3\2\2\2\23c\3\2\2\2\25e\3\2"+
		"\2\2\27g\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!r\3\2"+
		"\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b"+
		"\3\2\2\2/\u008d\3\2\2\2\61\u0090\3\2\2\2\63\u009b\3\2\2\2\65\u009f\3\2"+
		"\2\2\67\u00ad\3\2\2\29:\7k\2\2:;\7h\2\2;\4\3\2\2\2<=\7v\2\2=>\7j\2\2>"+
		"?\7g\2\2?@\7p\2\2@\6\3\2\2\2AB\7\"\2\2BC\7g\2\2CD\7p\2\2DE\7f\2\2E\b\3"+
		"\2\2\2FG\7g\2\2GH\7n\2\2HI\7u\2\2IJ\7g\2\2J\n\3\2\2\2KL\7t\2\2LM\7g\2"+
		"\2MN\7c\2\2NO\7f\2\2O\f\3\2\2\2PQ\7y\2\2QR\7t\2\2RS\7k\2\2ST\7v\2\2TU"+
		"\7g\2\2U\16\3\2\2\2VW\7w\2\2WX\7p\2\2XY\7v\2\2YZ\7k\2\2Z[\7n\2\2[\20\3"+
		"\2\2\2\\]\7t\2\2]^\7g\2\2^_\7r\2\2_`\7g\2\2`a\7c\2\2ab\7v\2\2b\22\3\2"+
		"\2\2cd\7=\2\2d\24\3\2\2\2ef\7?\2\2f\26\3\2\2\2gh\7<\2\2hi\7?\2\2i\30\3"+
		"\2\2\2jk\7>\2\2k\32\3\2\2\2lm\7-\2\2m\34\3\2\2\2no\7/\2\2o\36\3\2\2\2"+
		"pq\7,\2\2q \3\2\2\2rs\7\61\2\2s\"\3\2\2\2tu\7*\2\2u$\3\2\2\2vw\7+\2\2"+
		"w&\3\2\2\2x}\5/\30\2y|\5/\30\2z|\5+\26\2{y\3\2\2\2{z\3\2\2\2|\177\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~(\3\2\2\2\177}\3\2\2\2\u0080\u0082\5-\27\2\u0081"+
		"\u0083\5+\26\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0088\5+\26\2\u0087"+
		"\u0080\3\2\2\2\u0087\u0086\3\2\2\2\u0088*\3\2\2\2\u0089\u008a\t\2\2\2"+
		"\u008a,\3\2\2\2\u008b\u008c\t\3\2\2\u008c.\3\2\2\2\u008d\u008e\t\4\2\2"+
		"\u008e\60\3\2\2\2\u008f\u0091\t\5\2\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\b\31\2\2\u0095\62\3\2\2\2\u0096\u0098\7\17\2\2\u0097\u0099\7\f"+
		"\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u009c\7\f\2\2\u009b\u0096\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009e\b\32\2\2\u009e\64\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\u00a1\7,\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7\61"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\33\2\2\u00ac\66\3\2\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2\n\6\2\2"+
		"\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\34\2\2"+
		"\u00b78\3\2\2\2\f\2{}\u0084\u0087\u0092\u0098\u009b\u00a5\u00b3\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}