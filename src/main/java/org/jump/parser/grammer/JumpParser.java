// Generated from ./src/main/antlr/Jump.g4 by ANTLR 4.5.1
package org.jump.parser.grammer;
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
		T__0=1, ESC=2, STRING=3, WORD=4, EQ=5, OPENPAREN=6, CLOSEPAREN=7;
	public static final int
		RULE_input = 0, RULE_field_config = 1, RULE_param_list = 2, RULE_item = 3;
	public static final String[] ruleNames = {
		"input", "field_config", "param_list", "item"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", null, null, null, "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ESC", "STRING", "WORD", "EQ", "OPENPAREN", "CLOSEPAREN"
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
			setState(8);
			field_config();
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(9);
				match(T__0);
				setState(10);
				field_config();
				}
				}
				setState(15);
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
		public List<TerminalNode> WORD() { return getTokens(JumpParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JumpParser.WORD, i);
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
	public static class EmptyFieldConfigContext extends Field_configContext {
		public List<TerminalNode> WORD() { return getTokens(JumpParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JumpParser.WORD, i);
		}
		public TerminalNode EQ() { return getToken(JumpParser.EQ, 0); }
		public TerminalNode OPENPAREN() { return getToken(JumpParser.OPENPAREN, 0); }
		public TerminalNode CLOSEPAREN() { return getToken(JumpParser.CLOSEPAREN, 0); }
		public EmptyFieldConfigContext(Field_configContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitEmptyFieldConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_configContext field_config() throws RecognitionException {
		Field_configContext _localctx = new Field_configContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_config);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FieldConfigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(WORD);
				setState(17);
				match(EQ);
				setState(18);
				match(WORD);
				setState(19);
				match(OPENPAREN);
				setState(20);
				param_list();
				setState(21);
				match(CLOSEPAREN);
				}
				break;
			case 2:
				_localctx = new EmptyFieldConfigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(WORD);
				setState(24);
				match(EQ);
				setState(25);
				match(WORD);
				setState(26);
				match(OPENPAREN);
				setState(27);
				match(CLOSEPAREN);
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
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
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
			setState(30);
			item();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(31);
				match(T__0);
				setState(32);
				item();
				}
				}
				setState(37);
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

	public static class ItemContext extends ParserRuleContext {
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
	 
		public ItemContext() { }
		public void copyFrom(ItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamItemContext extends ItemContext {
		public TerminalNode STRING() { return getToken(JumpParser.STRING, 0); }
		public TerminalNode WORD() { return getToken(JumpParser.WORD, 0); }
		public ParamItemContext(ItemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitParamItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_item);
		int _la;
		try {
			_localctx = new ParamItemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==WORD) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\7\4$\n\4\f"+
		"\4\16\4\'\13\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\5\6)\2\n\3\2\2\2\4\36"+
		"\3\2\2\2\6 \3\2\2\2\b(\3\2\2\2\n\17\5\4\3\2\13\f\7\3\2\2\f\16\5\4\3\2"+
		"\r\13\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21"+
		"\17\3\2\2\2\22\23\7\6\2\2\23\24\7\7\2\2\24\25\7\6\2\2\25\26\7\b\2\2\26"+
		"\27\5\6\4\2\27\30\7\t\2\2\30\37\3\2\2\2\31\32\7\6\2\2\32\33\7\7\2\2\33"+
		"\34\7\6\2\2\34\35\7\b\2\2\35\37\7\t\2\2\36\22\3\2\2\2\36\31\3\2\2\2\37"+
		"\5\3\2\2\2 %\5\b\5\2!\"\7\3\2\2\"$\5\b\5\2#!\3\2\2\2$\'\3\2\2\2%#\3\2"+
		"\2\2%&\3\2\2\2&\7\3\2\2\2\'%\3\2\2\2()\t\2\2\2)\t\3\2\2\2\5\17\36%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}