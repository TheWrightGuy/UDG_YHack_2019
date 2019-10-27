// Generated from UDG.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UDGLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMCODE=1, PARAM=2, NAME=3, AUTHOR=4, RET=5, ID=6, WS=7, NL=8, LCOMM=9, 
		RCOMM=10, JUNK=11, INJUNK=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMCODE", "PARAM", "NAME", "AUTHOR", "RET", "ID", "WS", "NL", "LCOMM", 
			"RCOMM", "JUNK", "INJUNK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\t@'", "'param'", "'name'", "'author'", "'returns'", null, null, 
			"'\n'", "'/*'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMCODE", "PARAM", "NAME", "AUTHOR", "RET", "ID", "WS", "NL", 
			"LCOMM", "RCOMM", "JUNK", "INJUNK"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public UDGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UDG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\6\bA\n\b\r\b\16\bB\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\f\f\17\17\"\"\3\2\"\u0080\2S\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3\2\2\2"+
		"\7$\3\2\2\2\t)\3\2\2\2\13\60\3\2\2\2\r8\3\2\2\2\17@\3\2\2\2\21F\3\2\2"+
		"\2\23H\3\2\2\2\25K\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33\34\7\13\2\2\34\35"+
		"\7B\2\2\35\4\3\2\2\2\36\37\7r\2\2\37 \7c\2\2 !\7t\2\2!\"\7c\2\2\"#\7o"+
		"\2\2#\6\3\2\2\2$%\7p\2\2%&\7c\2\2&\'\7o\2\2\'(\7g\2\2(\b\3\2\2\2)*\7c"+
		"\2\2*+\7w\2\2+,\7v\2\2,-\7j\2\2-.\7q\2\2./\7t\2\2/\n\3\2\2\2\60\61\7t"+
		"\2\2\61\62\7g\2\2\62\63\7v\2\2\63\64\7w\2\2\64\65\7t\2\2\65\66\7p\2\2"+
		"\66\67\7u\2\2\67\f\3\2\2\28<\t\2\2\29;\t\3\2\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=\16\3\2\2\2><\3\2\2\2?A\t\4\2\2@?\3\2\2\2AB\3\2\2\2B"+
		"@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\b\2\2E\20\3\2\2\2FG\7\f\2\2G\22\3\2"+
		"\2\2HI\7\61\2\2IJ\7,\2\2J\24\3\2\2\2KL\7,\2\2LM\7\61\2\2M\26\3\2\2\2N"+
		"O\13\2\2\2O\30\3\2\2\2PQ\t\5\2\2Q\32\3\2\2\2\5\2<B\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}