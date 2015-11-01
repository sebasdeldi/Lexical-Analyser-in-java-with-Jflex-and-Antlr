// Generated from cincoporfaAntlrLexer.g4 by ANTLR 4.5.1

package co.edu.eafit.dis.st0270.p2015cincoporfa.lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cincoporfaAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, BOOLEANO=2, ID=3, INT=4, OPERADOR=5, SEPARADOR=6, REAL=7, 
		WS=8, ERROR=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KEYWORDS", "BOOLEANO", "ID", "INT", "OPERADOR", "SEPARADOR", "REAL", 
		"WS", "ERROR"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYWORDS", "BOOLEANO", "ID", "INT", "OPERADOR", "SEPARADOR", "REAL", 
		"WS", "ERROR"
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


	public cincoporfaAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cincoporfaAntlrLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\65\n\3\3\4\3"+
		"\4\7\49\n\4\f\4\16\4<\13\4\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3\5\6\5F\n\5"+
		"\r\5\16\5G\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\6\5Q\n\5\r\5\16\5R\5\5U\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6g\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\6\bt\n\b\r\b\16\bu\3\b"+
		"\3\b\6\bz\n\b\r\b\16\b{\3\t\3\t\3\t\3\t\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\3\2\b\4\2C\\c|\6\2\62;C\\aac|\5\2\629CHch\4"+
		"\2>>@@\b\2\'\',-//\61\61??~~\5\2\13\f\16\17\"\"\u009d\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\3)\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\tT\3\2"+
		"\2\2\13f\3\2\2\2\rp\3\2\2\2\17s\3\2\2\2\21}\3\2\2\2\23\u0081\3\2\2\2\25"+
		"\26\7h\2\2\26*\7p\2\2\27\30\7h\2\2\30\31\7w\2\2\31*\7p\2\2\32\33\7k\2"+
		"\2\33*\7h\2\2\34\35\7v\2\2\35\36\7j\2\2\36\37\7g\2\2\37*\7p\2\2 !\7g\2"+
		"\2!\"\7n\2\2\"#\7u\2\2#*\7g\2\2$%\7n\2\2%&\7g\2\2&*\7v\2\2\'(\7k\2\2("+
		"*\7p\2\2)\25\3\2\2\2)\27\3\2\2\2)\32\3\2\2\2)\34\3\2\2\2) \3\2\2\2)$\3"+
		"\2\2\2)\'\3\2\2\2*\4\3\2\2\2+,\7V\2\2,-\7t\2\2-.\7w\2\2.\65\7g\2\2/\60"+
		"\7H\2\2\60\61\7c\2\2\61\62\7n\2\2\62\63\7u\2\2\63\65\7g\2\2\64+\3\2\2"+
		"\2\64/\3\2\2\2\65\6\3\2\2\2\66:\t\2\2\2\679\t\3\2\28\67\3\2\2\29<\3\2"+
		"\2\2:8\3\2\2\2:;\3\2\2\2;\b\3\2\2\2<:\3\2\2\2=?\4\62;\2>=\3\2\2\2?@\3"+
		"\2\2\2@>\3\2\2\2@A\3\2\2\2AU\3\2\2\2BC\7\62\2\2CE\4\639\2DF\4\629\2ED"+
		"\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HU\3\2\2\2IJ\7\62\2\2JN\7z\2\2K"+
		"L\7\62\2\2LN\7Z\2\2MI\3\2\2\2MK\3\2\2\2NP\3\2\2\2OQ\t\4\2\2PO\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2T>\3\2\2\2TB\3\2\2\2TM\3\2\2\2"+
		"U\n\3\2\2\2Vg\t\5\2\2WX\7?\2\2Xg\7?\2\2YZ\7#\2\2Zg\7?\2\2[\\\7>\2\2\\"+
		"g\7?\2\2]^\7@\2\2^g\7?\2\2_g\t\6\2\2`a\7~\2\2ag\7~\2\2bg\7(\2\2cd\7(\2"+
		"\2dg\7(\2\2eg\7`\2\2fV\3\2\2\2fW\3\2\2\2fY\3\2\2\2f[\3\2\2\2f]\3\2\2\2"+
		"f_\3\2\2\2f`\3\2\2\2fb\3\2\2\2fc\3\2\2\2fe\3\2\2\2g\f\3\2\2\2hq\4*+\2"+
		"ij\7?\2\2jq\7@\2\2kl\7>\2\2lm\7g\2\2mn\7q\2\2no\7h\2\2oq\7@\2\2ph\3\2"+
		"\2\2pi\3\2\2\2pk\3\2\2\2q\16\3\2\2\2rt\4\62;\2sr\3\2\2\2tu\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2vw\3\2\2\2wy\7\60\2\2xz\4\62;\2yx\3\2\2\2z{\3\2\2\2{y"+
		"\3\2\2\2{|\3\2\2\2|\20\3\2\2\2}~\t\7\2\2~\177\3\2\2\2\177\u0080\b\t\2"+
		"\2\u0080\22\3\2\2\2\u0081\u0082\13\2\2\2\u0082\24\3\2\2\2\17\2)\64:@G"+
		"MRTfpu{\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}