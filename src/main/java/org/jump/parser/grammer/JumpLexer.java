// Generated from ./src/main/antlr/Jump.g4 by ANTLR 4.5.1
package org.jump.parser.grammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JumpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ESC=7, STRING=8, WORD=9, 
		EQ=10, OPENPAREN=11, CLOSEPAREN=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "ESC", "STRING", "WORD", 
		"EQ", "OPENPAREN", "CLOSEPAREN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'sql'", "'{'", "','", "'}'", "'insert'", "'rollback'", null, null, 
		null, "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "ESC", "STRING", "WORD", "EQ", 
		"OPENPAREN", "CLOSEPAREN"
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


	public JumpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jump.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b\67\n\b"+
		"\r\b\16\b8\3\b\3\b\3\t\3\t\3\t\3\t\7\tA\n\t\f\t\16\tD\13\t\3\t\3\t\3\n"+
		"\6\nI\n\n\r\n\16\nJ\3\13\3\13\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\5\5\2\13\f\17\17\"\"\4\2$$"+
		"^^\t\2\13\f\17\17\"\"$$*,..??U\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\37\3\2\2\2\7"+
		"!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r,\3\2\2\2\17\66\3\2\2\2\21<\3\2\2\2"+
		"\23H\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33\34\7u\2\2\34\35\7"+
		"s\2\2\35\36\7n\2\2\36\4\3\2\2\2\37 \7}\2\2 \6\3\2\2\2!\"\7.\2\2\"\b\3"+
		"\2\2\2#$\7\177\2\2$\n\3\2\2\2%&\7k\2\2&\'\7p\2\2\'(\7u\2\2()\7g\2\2)*"+
		"\7t\2\2*+\7v\2\2+\f\3\2\2\2,-\7t\2\2-.\7q\2\2./\7n\2\2/\60\7n\2\2\60\61"+
		"\7d\2\2\61\62\7c\2\2\62\63\7e\2\2\63\64\7m\2\2\64\16\3\2\2\2\65\67\t\2"+
		"\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\b\2"+
		"\2;\20\3\2\2\2<B\7$\2\2=A\n\3\2\2>?\7^\2\2?A\t\3\2\2@=\3\2\2\2@>\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7$\2\2F\22\3\2"+
		"\2\2GI\n\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\24\3\2\2\2LM\7"+
		"?\2\2M\26\3\2\2\2NO\7*\2\2O\30\3\2\2\2PQ\7+\2\2Q\32\3\2\2\2\7\28@BJ\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}