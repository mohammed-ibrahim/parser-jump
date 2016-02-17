// Generated from ./src/main/antlr/Jump.g4 by ANTLR 4.5.1
package org.jump.grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JumpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ESC=2, STRING=3, EQ=4, OPENPAREN=5, CLOSEPAREN=6, ALNUMTEXT=7;
	public static final int
		RULE_input = 0, RULE_field_config = 1, RULE_param_list = 2;
	public static final String[] ruleNames = {
		"input", "field_config", "param_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ESC", "STRING", "EQ", "OPENPAREN", "CLOSEPAREN", "ALNUMTEXT"
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
	public String getGrammarFileName() { return "Jump.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JumpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldConfigListContext extends InputContext {
		public List<Field_configContext> field_config() {
			return getRuleContexts(Field_configContext.class);
		}
		public Field_configContext field_config(int i) {
			return getRuleContext(Field_configContext.class,i);
		}
		public FieldConfigListContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitFieldConfigList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			_localctx = new FieldConfigListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			field_config();
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(7);
				match(T__0);
				setState(8);
				field_config();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Field_configContext extends ParserRuleContext {
		public Field_configContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_config; }
	 
		public Field_configContext() { }
		public void copyFrom(Field_configContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldConfigContext extends Field_configContext {
		public List<TerminalNode> STRING() { return getTokens(JumpParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JumpParser.STRING, i);
		}
		public TerminalNode EQ() { return getToken(JumpParser.EQ, 0); }
		public TerminalNode OPENPAREN() { return getToken(JumpParser.OPENPAREN, 0); }
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(JumpParser.CLOSEPAREN, 0); }
		public FieldConfigContext(Field_configContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitFieldConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_configContext field_config() throws RecognitionException {
		Field_configContext _localctx = new Field_configContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_config);
		try {
			_localctx = new FieldConfigContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(STRING);
			setState(15);
			match(EQ);
			setState(16);
			match(STRING);
			setState(17);
			match(OPENPAREN);
			setState(18);
			param_list();
			setState(19);
			match(CLOSEPAREN);
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

	public static class Param_listContext extends ParserRuleContext {
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	 
		public Param_listContext() { }
		public void copyFrom(Param_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamListContext extends Param_listContext {
		public List<TerminalNode> STRING() { return getTokens(JumpParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JumpParser.STRING, i);
		}
		public ParamListContext(Param_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param_list);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(STRING);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				match(T__0);
				setState(23);
				match(STRING);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\2\2\5\2\4\6\2\2\36"+
		"\2\b\3\2\2\2\4\20\3\2\2\2\6\27\3\2\2\2\b\r\5\4\3\2\t\n\7\3\2\2\n\f\5\4"+
		"\3\2\13\t\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2"+
		"\17\r\3\2\2\2\20\21\7\5\2\2\21\22\7\6\2\2\22\23\7\5\2\2\23\24\7\7\2\2"+
		"\24\25\5\6\4\2\25\26\7\b\2\2\26\5\3\2\2\2\27\34\7\5\2\2\30\31\7\3\2\2"+
		"\31\33\7\5\2\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\7\3\2\2\2\36\34\3\2\2\2\4\r\34";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}