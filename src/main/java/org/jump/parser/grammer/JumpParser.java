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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ESC=6, STRING=7, WORD=8, EQ=9, 
		OPENPAREN=10, CLOSEPAREN=11;
	public static final int
		RULE_statement = 0, RULE_command = 1, RULE_input = 2, RULE_field_config = 3, 
		RULE_param_list = 4, RULE_item = 5;
	public static final String[] ruleNames = {
		"statement", "command", "input", "field_config", "param_list", "item"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'sql:'", "','", "'insert'", "':'", null, null, null, "'='", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "ESC", "STRING", "WORD", "EQ", "OPENPAREN", 
		"CLOSEPAREN"
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryStatementContext extends StatementContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public PrimaryStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitPrimaryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			_localctx = new PrimaryStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			command();
			setState(13);
			match(T__0);
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__3) {
				{
				{
				setState(14);
				command();
				setState(15);
				match(T__0);
				}
				}
				setState(21);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SqlStatementContext extends CommandContext {
		public List<TerminalNode> STRING() { return getTokens(JumpParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JumpParser.STRING, i);
		}
		public SqlStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertStatementContext extends CommandContext {
		public TerminalNode OPENPAREN() { return getToken(JumpParser.OPENPAREN, 0); }
		public List<TerminalNode> WORD() { return getTokens(JumpParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(JumpParser.WORD, i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(JumpParser.CLOSEPAREN, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public InsertStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JumpVisitor ) return ((JumpVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			setState(39);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new SqlStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__1);
				setState(23);
				match(STRING);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(24);
					match(T__2);
					setState(25);
					match(STRING);
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				_localctx = new InsertStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__3);
				setState(32);
				match(OPENPAREN);
				setState(33);
				match(WORD);
				setState(34);
				match(T__2);
				setState(35);
				match(WORD);
				setState(36);
				match(CLOSEPAREN);
				setState(37);
				match(T__4);
				setState(38);
				input();
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
		enterRule(_localctx, 4, RULE_input);
		int _la;
		try {
			_localctx = new FieldConfigListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			field_config();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(42);
				match(T__2);
				setState(43);
				field_config();
				}
				}
				setState(48);
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
		enterRule(_localctx, 6, RULE_field_config);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new FieldConfigContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(WORD);
				setState(50);
				match(EQ);
				setState(51);
				match(WORD);
				setState(52);
				match(OPENPAREN);
				setState(53);
				param_list();
				setState(54);
				match(CLOSEPAREN);
				}
				break;
			case 2:
				_localctx = new EmptyFieldConfigContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(WORD);
				setState(57);
				match(EQ);
				setState(58);
				match(WORD);
				setState(59);
				match(OPENPAREN);
				setState(60);
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
		enterRule(_localctx, 8, RULE_param_list);
		int _la;
		try {
			_localctx = new ParamListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			item();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(64);
				match(T__2);
				setState(65);
				item();
				}
				}
				setState(70);
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
		enterRule(_localctx, 10, RULE_item);
		int _la;
		try {
			_localctx = new ParamItemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rL\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\7\2\24\n\2\f\2"+
		"\16\2\27\13\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\7\6"+
		"E\n\6\f\6\16\6H\13\6\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\t\nK\2\16\3"+
		"\2\2\2\4)\3\2\2\2\6+\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fI\3\2\2\2\16\17\5"+
		"\4\3\2\17\25\7\3\2\2\20\21\5\4\3\2\21\22\7\3\2\2\22\24\3\2\2\2\23\20\3"+
		"\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\25\3"+
		"\2\2\2\30\31\7\4\2\2\31\36\7\t\2\2\32\33\7\5\2\2\33\35\7\t\2\2\34\32\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37*\3\2\2\2 \36\3\2\2\2"+
		"!\"\7\6\2\2\"#\7\f\2\2#$\7\n\2\2$%\7\5\2\2%&\7\n\2\2&\'\7\r\2\2\'(\7\7"+
		"\2\2(*\5\6\4\2)\30\3\2\2\2)!\3\2\2\2*\5\3\2\2\2+\60\5\b\5\2,-\7\5\2\2"+
		"-/\5\b\5\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\7\3\2\2"+
		"\2\62\60\3\2\2\2\63\64\7\n\2\2\64\65\7\13\2\2\65\66\7\n\2\2\66\67\7\f"+
		"\2\2\678\5\n\6\289\7\r\2\29@\3\2\2\2:;\7\n\2\2;<\7\13\2\2<=\7\n\2\2=>"+
		"\7\f\2\2>@\7\r\2\2?\63\3\2\2\2?:\3\2\2\2@\t\3\2\2\2AF\5\f\7\2BC\7\5\2"+
		"\2CE\5\f\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2"+
		"\2\2IJ\t\2\2\2J\r\3\2\2\2\b\25\36)\60?F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}