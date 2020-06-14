// Generated from LinguaNova.g4 by ANTLR 4.7.1

	package linguanova;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguaNovaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, POINT=41, COMMA=42, SEMI=43, TILDE=44, SYMBOL=45, 
		COMPARATOR=46, OPERATOR=47, DTYPE=48, LETTER=49, WORD=50, INTEGER=51, 
		DECIMAL=52, NEWBLOCK=53, BLOCKCLS=54, NEWLINE=55, WS=56;
	public static final int
		RULE_prog = 0, RULE_string = 1, RULE_value = 2, RULE_array_length = 3, 
		RULE_lbl = 4, RULE_math_op = 5, RULE_incdec_op = 6, RULE_rtn = 7, RULE_static_assignments = 8, 
		RULE_main_body = 9, RULE_func_body = 10, RULE_func_call = 11, RULE_var_dec = 12, 
		RULE_var_assign = 13, RULE_assignment = 14, RULE_negate_op = 15, RULE_equals_op = 16, 
		RULE_comparison_op = 17, RULE_logic_op = 18, RULE_condition = 19, RULE_output = 20, 
		RULE_input = 21, RULE_do_while = 22, RULE_switchCase = 23, RULE_sCase = 24, 
		RULE_sDefault = 25, RULE_while_loop = 26, RULE_for_loop = 27, RULE_foreach_loop = 28, 
		RULE_if_stmt = 29, RULE_else_stmt = 30, RULE_array_container = 31, RULE_array_items = 32, 
		RULE_single_cmt = 33, RULE_multi_cmt = 34, RULE_statement = 35;
	public static final String[] ruleNames = {
		"prog", "string", "value", "array_length", "lbl", "math_op", "incdec_op", 
		"rtn", "static_assignments", "main_body", "func_body", "func_call", "var_dec", 
		"var_assign", "assignment", "negate_op", "equals_op", "comparison_op", 
		"logic_op", "condition", "output", "input", "do_while", "switchCase", 
		"sCase", "sDefault", "while_loop", "for_loop", "foreach_loop", "if_stmt", 
		"else_stmt", "array_container", "array_items", "single_cmt", "multi_cmt", 
		"statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"'", "'true'", "'false'", "'length'", "'('", "')'", "'inc'", 
		"'dec'", "'return'", "'$'", "'%'", "'$Main init():'", "'#'", "'Func'", 
		"'):'", "'call'", "'<-'", "'negate'", "'equals'", "'and'", "'or'", "'output('", 
		"'input('", "'initiate:'", "'interval('", "'trigger('", "'choice'", "':'", 
		"'standard:'", "'step(#Decimal'", "'/'", "'stepthru(#'", "' in '", "'verify('", 
		"'divert:'", "'<'", "'>'", "'//'", "'/*'", "'*/'", "'.'", "','", "';'", 
		"'~'", null, null, null, null, null, null, null, null, "'\n  '", "'[end]'", 
		"'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "POINT", "COMMA", "SEMI", "TILDE", "SYMBOL", 
		"COMPARATOR", "OPERATOR", "DTYPE", "LETTER", "WORD", "INTEGER", "DECIMAL", 
		"NEWBLOCK", "BLOCKCLS", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "LinguaNova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguaNovaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Main_bodyContext main_body() {
			return getRuleContext(Main_bodyContext.class,0);
		}
		public List<Static_assignmentsContext> static_assignments() {
			return getRuleContexts(Static_assignmentsContext.class);
		}
		public Static_assignmentsContext static_assignments(int i) {
			return getRuleContext(Static_assignmentsContext.class,i);
		}
		public List<Func_bodyContext> func_body() {
			return getRuleContexts(Func_bodyContext.class);
		}
		public Func_bodyContext func_body(int i) {
			return getRuleContext(Func_bodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguaNovaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguaNovaParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(72);
				static_assignments();
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(73);
					match(NEWLINE);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			main_body();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__12) {
				{
				{
				setState(85);
				func_body();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(86);
					match(NEWLINE);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(96);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(LinguaNovaParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LinguaNovaParser.LETTER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(LinguaNovaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(LinguaNovaParser.WORD, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(LinguaNovaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LinguaNovaParser.INTEGER, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LinguaNovaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LinguaNovaParser.DECIMAL, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(LinguaNovaParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(LinguaNovaParser.SYMBOL, i);
		}
		public List<TerminalNode> WS() { return getTokens(LinguaNovaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LinguaNovaParser.WS, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << LETTER) | (1L << WORD) | (1L << INTEGER) | (1L << DECIMAL) | (1L << WS))) != 0)) {
				{
				{
				setState(98);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << LETTER) | (1L << WORD) | (1L << INTEGER) | (1L << DECIMAL) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__0);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(LinguaNovaParser.DECIMAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Array_lengthContext array_length() {
			return getRuleContext(Array_lengthContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Math_opContext math_op() {
			return getRuleContext(Math_opContext.class,0);
		}
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_value);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(DECIMAL);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				string();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				array_length();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				func_call();
				}
				break;
			case OPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				math_op();
				}
				break;
			case LETTER:
			case WORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				lbl();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 7);
				{
				setState(112);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 8);
				{
				setState(113);
				match(T__2);
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

	public static class Array_lengthContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public Array_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterArray_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitArray_length(this);
		}
	}

	public final Array_lengthContext array_length() throws RecognitionException {
		Array_lengthContext _localctx = new Array_lengthContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(118);
			lbl();
			setState(119);
			match(T__5);
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

	public static class LblContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(LinguaNovaParser.LETTER, 0); }
		public TerminalNode WORD() { return getToken(LinguaNovaParser.WORD, 0); }
		public Array_containerContext array_container() {
			return getRuleContext(Array_containerContext.class,0);
		}
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==LETTER || _la==WORD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__35) {
				{
				setState(122);
				array_container();
				}
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

	public static class Math_opContext extends ParserRuleContext {
		public TerminalNode OPERATOR() { return getToken(LinguaNovaParser.OPERATOR, 0); }
		public List<LblContext> lbl() {
			return getRuleContexts(LblContext.class);
		}
		public LblContext lbl(int i) {
			return getRuleContext(LblContext.class,i);
		}
		public List<Func_callContext> func_call() {
			return getRuleContexts(Func_callContext.class);
		}
		public Func_callContext func_call(int i) {
			return getRuleContext(Func_callContext.class,i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LinguaNovaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LinguaNovaParser.DECIMAL, i);
		}
		public List<Math_opContext> math_op() {
			return getRuleContexts(Math_opContext.class);
		}
		public Math_opContext math_op(int i) {
			return getRuleContext(Math_opContext.class,i);
		}
		public Math_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterMath_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitMath_op(this);
		}
	}

	public final Math_opContext math_op() throws RecognitionException {
		Math_opContext _localctx = new Math_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_math_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OPERATOR);
			setState(126);
			match(T__4);
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(127);
				lbl();
				}
				break;
			case T__15:
				{
				setState(128);
				func_call();
				}
				break;
			case DECIMAL:
				{
				setState(129);
				match(DECIMAL);
				}
				break;
			case OPERATOR:
				{
				setState(130);
				math_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(133);
			match(COMMA);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(134);
				lbl();
				}
				break;
			case T__15:
				{
				setState(135);
				func_call();
				}
				break;
			case DECIMAL:
				{
				setState(136);
				match(DECIMAL);
				}
				break;
			case OPERATOR:
				{
				setState(137);
				math_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(140);
			match(T__5);
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

	public static class Incdec_opContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public Incdec_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incdec_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterIncdec_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitIncdec_op(this);
		}
	}

	public final Incdec_opContext incdec_op() throws RecognitionException {
		Incdec_opContext _localctx = new Incdec_opContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_incdec_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(T__4);
			setState(144);
			lbl();
			setState(145);
			match(T__5);
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

	public static class RtnContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RtnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterRtn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitRtn(this);
		}
	}

	public final RtnContext rtn() throws RecognitionException {
		RtnContext _localctx = new RtnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rtn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__8);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(148);
				value();
				}
				break;
			case 2:
				{
				setState(149);
				condition();
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

	public static class Static_assignmentsContext extends ParserRuleContext {
		public TerminalNode DTYPE() { return getToken(LinguaNovaParser.DTYPE, 0); }
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LinguaNovaParser.SEMI, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Static_assignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterStatic_assignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitStatic_assignments(this);
		}
	}

	public final Static_assignmentsContext static_assignments() throws RecognitionException {
		Static_assignmentsContext _localctx = new Static_assignmentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_static_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(153);
			match(DTYPE);
			setState(154);
			lbl();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(155);
				assignment();
				}
			}

			setState(158);
			match(SEMI);
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

	public static class Main_bodyContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguaNovaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguaNovaParser.NEWLINE, i);
		}
		public Main_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterMain_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitMain_body(this);
		}
	}

	public final Main_bodyContext main_body() throws RecognitionException {
		Main_bodyContext _localctx = new Main_bodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_main_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__11);
			setState(161);
			match(NEWBLOCK);
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(162);
					statement();
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWBLOCK) {
						{
						{
						setState(163);
						match(NEWBLOCK);
						}
						}
						setState(168);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(173);
				match(NEWLINE);
				}
				}
				setState(178);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<TerminalNode> DTYPE() { return getTokens(LinguaNovaParser.DTYPE); }
		public TerminalNode DTYPE(int i) {
			return getToken(LinguaNovaParser.DTYPE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RtnContext rtn() {
			return getRuleContext(RtnContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<Array_containerContext> array_container() {
			return getRuleContexts(Array_containerContext.class);
		}
		public Array_containerContext array_container(int i) {
			return getRuleContext(Array_containerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguaNovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguaNovaParser.COMMA, i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(180);
			match(T__13);
			setState(181);
			lbl();
			setState(182);
			match(T__4);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DTYPE) {
				{
				{
				setState(183);
				match(DTYPE);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__35) {
					{
					setState(184);
					array_container();
					}
				}

				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(187);
					value();
					}
					break;
				case 2:
					{
					setState(188);
					condition();
					}
					break;
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(191);
					match(COMMA);
					}
				}

				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(T__14);
			setState(200);
			match(NEWBLOCK);
			setState(208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(201);
					statement();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWBLOCK) {
						{
						{
						setState(202);
						match(NEWBLOCK);
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(212);
				rtn();
				}
			}

			setState(215);
			match(BLOCKCLS);
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

	public static class Func_callContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguaNovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguaNovaParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__15);
			setState(218);
			lbl();
			setState(219);
			match(T__4);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << COMPARATOR) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD) | (1L << DECIMAL))) != 0)) {
				{
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(220);
					value();
					}
					break;
				case 2:
					{
					setState(221);
					condition();
					}
					break;
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(224);
					match(COMMA);
					}
				}

				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__5);
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

	public static class Var_decContext extends ParserRuleContext {
		public TerminalNode DTYPE() { return getToken(LinguaNovaParser.DTYPE, 0); }
		public List<LblContext> lbl() {
			return getRuleContexts(LblContext.class);
		}
		public LblContext lbl(int i) {
			return getRuleContext(LblContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguaNovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguaNovaParser.COMMA, i);
		}
		public Var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterVar_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitVar_dec(this);
		}
	}

	public final Var_decContext var_dec() throws RecognitionException {
		Var_decContext _localctx = new Var_decContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_dec);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(235);
			match(DTYPE);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					lbl();
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__16) {
						{
						setState(237);
						assignment();
						}
					}

					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(240);
						match(COMMA);
						}
					}

					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class Var_assignContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(LinguaNovaParser.COMMA, 0); }
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			lbl();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(249);
				assignment();
				}
			}

			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(252);
				match(COMMA);
				}
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

	public static class AssignmentContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Array_itemsContext array_items() {
			return getRuleContext(Array_itemsContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__16);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(256);
				value();
				}
				break;
			case 2:
				{
				setState(257);
				condition();
				}
				break;
			case 3:
				{
				setState(258);
				array_items();
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

	public static class Negate_opContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Negate_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negate_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterNegate_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitNegate_op(this);
		}
	}

	public final Negate_opContext negate_op() throws RecognitionException {
		Negate_opContext _localctx = new Negate_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_negate_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__17);
			setState(262);
			match(T__4);
			setState(263);
			condition();
			setState(264);
			match(T__5);
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

	public static class Equals_opContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Equals_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterEquals_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitEquals_op(this);
		}
	}

	public final Equals_opContext equals_op() throws RecognitionException {
		Equals_opContext _localctx = new Equals_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equals_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__18);
			setState(267);
			match(T__4);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(268);
				value();
				}
				break;
			case 2:
				{
				setState(269);
				condition();
				}
				break;
			}
			setState(272);
			match(COMMA);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(273);
				value();
				}
				break;
			case 2:
				{
				setState(274);
				condition();
				}
				break;
			}
			setState(277);
			match(T__5);
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

	public static class Comparison_opContext extends ParserRuleContext {
		public TerminalNode COMPARATOR() { return getToken(LinguaNovaParser.COMPARATOR, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterComparison_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitComparison_op(this);
		}
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comparison_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(COMPARATOR);
			setState(280);
			match(T__4);
			setState(281);
			value();
			setState(282);
			match(COMMA);
			setState(283);
			value();
			setState(284);
			match(T__5);
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

	public static class Logic_opContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Logic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterLogic_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitLogic_op(this);
		}
	}

	public final Logic_opContext logic_op() throws RecognitionException {
		Logic_opContext _localctx = new Logic_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(287);
			match(T__4);
			setState(288);
			condition();
			setState(289);
			match(COMMA);
			setState(290);
			condition();
			setState(291);
			match(T__5);
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

	public static class ConditionContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Negate_opContext negate_op() {
			return getRuleContext(Negate_opContext.class,0);
		}
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public Equals_opContext equals_op() {
			return getRuleContext(Equals_opContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				func_call();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				negate_op();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				logic_op();
				}
				break;
			case COMPARATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				comparison_op();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				equals_op();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				match(T__2);
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

	public static class OutputContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguaNovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguaNovaParser.COMMA, i);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__21);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__15) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD) | (1L << DECIMAL))) != 0)) {
				{
				{
				setState(303);
				value();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(304);
					match(COMMA);
					}
				}

				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(T__5);
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
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__22);
			setState(315);
			lbl();
			setState(316);
			match(T__5);
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

	public static class Do_whileContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguaNovaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguaNovaParser.NEWLINE, i);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitDo_while(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_do_while);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(T__23);
			setState(319);
			match(NEWBLOCK);
			setState(327); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(320);
					statement();
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWBLOCK) {
						{
						{
						setState(321);
						match(NEWBLOCK);
						}
						}
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(329); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(331);
				match(NEWLINE);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(T__24);
			setState(338);
			condition();
			setState(339);
			match(T__5);
			setState(340);
			match(BLOCKCLS);
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

	public static class SwitchCaseContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public SDefaultContext sDefault() {
			return getRuleContext(SDefaultContext.class,0);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public List<SCaseContext> sCase() {
			return getRuleContexts(SCaseContext.class);
		}
		public SCaseContext sCase(int i) {
			return getRuleContext(SCaseContext.class,i);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switchCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(T__25);
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(343);
				lbl();
				}
				break;
			case T__15:
				{
				setState(344);
				func_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(347);
			match(T__14);
			setState(348);
			match(NEWBLOCK);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(349);
				sCase();
				setState(350);
				match(NEWBLOCK);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			sDefault();
			setState(358);
			match(NEWBLOCK);
			setState(359);
			match(BLOCKCLS);
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

	public static class SCaseContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public TerminalNode DECIMAL() { return getToken(LinguaNovaParser.DECIMAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterSCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitSCase(this);
		}
	}

	public final SCaseContext sCase() throws RecognitionException {
		SCaseContext _localctx = new SCaseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sCase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__26);
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL:
				{
				setState(362);
				match(DECIMAL);
				}
				break;
			case T__0:
				{
				setState(363);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(366);
			match(T__27);
			setState(367);
			match(NEWBLOCK);
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				statement();
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(NEWBLOCK);
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				}
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(379);
			match(NEWBLOCK);
			setState(380);
			match(BLOCKCLS);
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

	public static class SDefaultContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterSDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitSDefault(this);
		}
	}

	public final SDefaultContext sDefault() throws RecognitionException {
		SDefaultContext _localctx = new SDefaultContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__28);
			setState(383);
			match(NEWBLOCK);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0)) {
				{
				{
				setState(384);
				statement();
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(NEWBLOCK);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(NEWBLOCK);
			setState(397);
			match(BLOCKCLS);
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

	public static class While_loopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__24);
			setState(400);
			condition();
			setState(401);
			match(T__14);
			setState(402);
			match(NEWBLOCK);
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(403);
				statement();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWBLOCK) {
					{
					{
					setState(404);
					match(NEWBLOCK);
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(414);
			match(BLOCKCLS);
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

	public static class For_loopContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(LinguaNovaParser.DECIMAL, 0); }
		public Comparison_opContext comparison_op() {
			return getRuleContext(Comparison_opContext.class,0);
		}
		public Incdec_opContext incdec_op() {
			return getRuleContext(Incdec_opContext.class,0);
		}
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__29);
			setState(417);
			lbl();
			setState(418);
			match(T__16);
			setState(419);
			match(DECIMAL);
			setState(420);
			match(T__30);
			setState(421);
			comparison_op();
			setState(422);
			match(T__30);
			setState(423);
			incdec_op();
			setState(424);
			match(T__14);
			setState(425);
			match(NEWBLOCK);
			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(426);
				statement();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWBLOCK) {
					{
					{
					setState(427);
					match(NEWBLOCK);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(437);
			match(BLOCKCLS);
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

	public static class Foreach_loopContext extends ParserRuleContext {
		public TerminalNode DTYPE() { return getToken(LinguaNovaParser.DTYPE, 0); }
		public List<LblContext> lbl() {
			return getRuleContexts(LblContext.class);
		}
		public LblContext lbl(int i) {
			return getRuleContext(LblContext.class,i);
		}
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Foreach_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterForeach_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitForeach_loop(this);
		}
	}

	public final Foreach_loopContext foreach_loop() throws RecognitionException {
		Foreach_loopContext _localctx = new Foreach_loopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_foreach_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(T__31);
			setState(440);
			match(DTYPE);
			setState(441);
			lbl();
			setState(442);
			match(T__32);
			setState(443);
			lbl();
			setState(444);
			match(T__14);
			setState(445);
			match(NEWBLOCK);
			setState(453); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(446);
				statement();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWBLOCK) {
					{
					{
					setState(447);
					match(NEWBLOCK);
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(455); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(457);
			match(BLOCKCLS);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__33);
			setState(460);
			condition();
			setState(461);
			match(T__14);
			setState(462);
			match(NEWBLOCK);
			setState(470); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(463);
				statement();
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWBLOCK) {
					{
					{
					setState(464);
					match(NEWBLOCK);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(472); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(474);
			match(BLOCKCLS);
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

	public static class Else_stmtContext extends ParserRuleContext {
		public List<TerminalNode> NEWBLOCK() { return getTokens(LinguaNovaParser.NEWBLOCK); }
		public TerminalNode NEWBLOCK(int i) {
			return getToken(LinguaNovaParser.NEWBLOCK, i);
		}
		public TerminalNode BLOCKCLS() { return getToken(LinguaNovaParser.BLOCKCLS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitElse_stmt(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__34);
			setState(477);
			match(NEWBLOCK);
			setState(485); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(478);
				statement();
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWBLOCK) {
					{
					{
					setState(479);
					match(NEWBLOCK);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__12) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__31) | (1L << T__33) | (1L << T__34) | (1L << T__37) | (1L << T__38) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD))) != 0) );
			setState(489);
			match(BLOCKCLS);
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

	public static class Array_containerContext extends ParserRuleContext {
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LinguaNovaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LinguaNovaParser.DECIMAL, i);
		}
		public TerminalNode TILDE() { return getToken(LinguaNovaParser.TILDE, 0); }
		public Array_containerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterArray_container(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitArray_container(this);
		}
	}

	public final Array_containerContext array_container() throws RecognitionException {
		Array_containerContext _localctx = new Array_containerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(T__35);
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
			case WORD:
				{
				setState(492);
				lbl();
				}
				break;
			case DECIMAL:
				{
				setState(493);
				match(DECIMAL);
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TILDE) {
					{
					setState(494);
					match(TILDE);
					setState(495);
					match(DECIMAL);
					}
				}

				}
				break;
			case T__36:
				break;
			default:
				break;
			}
			setState(500);
			match(T__36);
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

	public static class Array_itemsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LinguaNovaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LinguaNovaParser.COMMA, i);
		}
		public Array_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterArray_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitArray_items(this);
		}
	}

	public final Array_itemsContext array_items() throws RecognitionException {
		Array_itemsContext _localctx = new Array_itemsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_array_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(T__35);
			setState(507); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(503);
				value();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(504);
					match(COMMA);
					}
				}

				}
				}
				setState(509); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__15) | (1L << OPERATOR) | (1L << LETTER) | (1L << WORD) | (1L << DECIMAL))) != 0) );
			setState(511);
			match(T__36);
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

	public static class Single_cmtContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(LinguaNovaParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LinguaNovaParser.LETTER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(LinguaNovaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(LinguaNovaParser.WORD, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(LinguaNovaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LinguaNovaParser.INTEGER, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LinguaNovaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LinguaNovaParser.DECIMAL, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(LinguaNovaParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(LinguaNovaParser.SYMBOL, i);
		}
		public List<TerminalNode> WS() { return getTokens(LinguaNovaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LinguaNovaParser.WS, i);
		}
		public Single_cmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_cmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterSingle_cmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitSingle_cmt(this);
		}
	}

	public final Single_cmtContext single_cmt() throws RecognitionException {
		Single_cmtContext _localctx = new Single_cmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_single_cmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(T__37);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << LETTER) | (1L << WORD) | (1L << INTEGER) | (1L << DECIMAL) | (1L << WS))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class Multi_cmtContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(LinguaNovaParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LinguaNovaParser.LETTER, i);
		}
		public List<TerminalNode> WORD() { return getTokens(LinguaNovaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(LinguaNovaParser.WORD, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(LinguaNovaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(LinguaNovaParser.INTEGER, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LinguaNovaParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LinguaNovaParser.DECIMAL, i);
		}
		public List<TerminalNode> SYMBOL() { return getTokens(LinguaNovaParser.SYMBOL); }
		public TerminalNode SYMBOL(int i) {
			return getToken(LinguaNovaParser.SYMBOL, i);
		}
		public List<TerminalNode> WS() { return getTokens(LinguaNovaParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(LinguaNovaParser.WS, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguaNovaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguaNovaParser.NEWLINE, i);
		}
		public Multi_cmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_cmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterMulti_cmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitMulti_cmt(this);
		}
	}

	public final Multi_cmtContext multi_cmt() throws RecognitionException {
		Multi_cmtContext _localctx = new Multi_cmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multi_cmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(T__38);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << LETTER) | (1L << WORD) | (1L << INTEGER) | (1L << DECIMAL) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
				setState(521);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYMBOL) | (1L << LETTER) | (1L << WORD) | (1L << INTEGER) | (1L << DECIMAL) | (1L << NEWLINE) | (1L << WS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(527);
			match(T__39);
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

	public static class StatementContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Var_decContext var_dec() {
			return getRuleContext(Var_decContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public SwitchCaseContext switchCase() {
			return getRuleContext(SwitchCaseContext.class,0);
		}
		public SCaseContext sCase() {
			return getRuleContext(SCaseContext.class,0);
		}
		public SDefaultContext sDefault() {
			return getRuleContext(SDefaultContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Foreach_loopContext foreach_loop() {
			return getRuleContext(Foreach_loopContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public Math_opContext math_op() {
			return getRuleContext(Math_opContext.class,0);
		}
		public Incdec_opContext incdec_op() {
			return getRuleContext(Incdec_opContext.class,0);
		}
		public Single_cmtContext single_cmt() {
			return getRuleContext(Single_cmtContext.class,0);
		}
		public Multi_cmtContext multi_cmt() {
			return getRuleContext(Multi_cmtContext.class,0);
		}
		public RtnContext rtn() {
			return getRuleContext(RtnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguaNovaListener ) ((LinguaNovaListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(529);
				func_call();
				}
				break;
			case 2:
				{
				setState(530);
				func_body();
				}
				break;
			case 3:
				{
				setState(531);
				var_dec();
				}
				break;
			case 4:
				{
				setState(532);
				var_assign();
				}
				break;
			case 5:
				{
				setState(533);
				output();
				}
				break;
			case 6:
				{
				setState(534);
				input();
				}
				break;
			case 7:
				{
				setState(535);
				do_while();
				}
				break;
			case 8:
				{
				setState(536);
				switchCase();
				}
				break;
			case 9:
				{
				setState(537);
				sCase();
				}
				break;
			case 10:
				{
				setState(538);
				sDefault();
				}
				break;
			case 11:
				{
				setState(539);
				while_loop();
				}
				break;
			case 12:
				{
				setState(540);
				for_loop();
				}
				break;
			case 13:
				{
				setState(541);
				foreach_loop();
				}
				break;
			case 14:
				{
				setState(542);
				if_stmt();
				}
				break;
			case 15:
				{
				setState(543);
				else_stmt();
				}
				break;
			case 16:
				{
				setState(544);
				math_op();
				}
				break;
			case 17:
				{
				setState(545);
				incdec_op();
				}
				break;
			case 18:
				{
				setState(546);
				single_cmt();
				}
				break;
			case 19:
				{
				setState(547);
				multi_cmt();
				}
				break;
			case 20:
				{
				setState(548);
				rtn();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u022a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\7\2_\n\2\f\2\16\2"+
		"b\13\2\3\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4u\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6~\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u0099\n\t\3\n\3\n\3\n\3\n\5\n\u009f\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16\13\u00aa\13\13\6"+
		"\13\u00ac\n\13\r\13\16\13\u00ad\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\f\3\f\5\f\u00c0\n\f\3\f"+
		"\5\f\u00c3\n\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13\f\3\f\3\f\3\f\3\f\7\f\u00ce"+
		"\n\f\f\f\16\f\u00d1\13\f\6\f\u00d3\n\f\r\f\16\f\u00d4\3\f\5\f\u00d8\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00e1\n\r\3\r\5\r\u00e4\n\r\7\r\u00e6"+
		"\n\r\f\r\16\r\u00e9\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00f1\n\16\3"+
		"\16\5\16\u00f4\n\16\7\16\u00f6\n\16\f\16\16\16\u00f9\13\16\3\17\3\17\5"+
		"\17\u00fd\n\17\3\17\5\17\u0100\n\17\3\20\3\20\3\20\3\20\5\20\u0106\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0111\n\22\3\22\3\22"+
		"\3\22\5\22\u0116\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u012f\n\25\3\26\3\26\3\26\5\26\u0134\n\26\7\26\u0136\n\26\f\26\16\26"+
		"\u0139\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0145"+
		"\n\30\f\30\16\30\u0148\13\30\6\30\u014a\n\30\r\30\16\30\u014b\3\30\7\30"+
		"\u014f\n\30\f\30\16\30\u0152\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\5\31\u015c\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u0163\n\31\f\31\16"+
		"\31\u0166\13\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\5\32\u016f\n\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0175\n\32\f\32\16\32\u0178\13\32\6\32\u017a\n\32"+
		"\r\32\16\32\u017b\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0185\n\33\f"+
		"\33\16\33\u0188\13\33\7\33\u018a\n\33\f\33\16\33\u018d\13\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0198\n\34\f\34\16\34\u019b\13"+
		"\34\6\34\u019d\n\34\r\34\16\34\u019e\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u01af\n\35\f\35\16\35\u01b2\13"+
		"\35\6\35\u01b4\n\35\r\35\16\35\u01b5\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01c3\n\36\f\36\16\36\u01c6\13\36\6\36\u01c8"+
		"\n\36\r\36\16\36\u01c9\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01d4"+
		"\n\37\f\37\16\37\u01d7\13\37\6\37\u01d9\n\37\r\37\16\37\u01da\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u01e3\n \f \16 \u01e6\13 \6 \u01e8\n \r \16 \u01e9\3 "+
		"\3 \3!\3!\3!\3!\3!\5!\u01f3\n!\5!\u01f5\n!\3!\3!\3\"\3\"\3\"\5\"\u01fc"+
		"\n\"\6\"\u01fe\n\"\r\"\16\"\u01ff\3\"\3\"\3#\3#\7#\u0206\n#\f#\16#\u0209"+
		"\13#\3$\3$\7$\u020d\n$\f$\16$\u0210\13$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0228\n%\3%\2\2&\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\t\5\2//\63\66"+
		"::\3\2\63\64\3\2\t\n\3\2\f\r\4\2\f\f\17\17\3\2\26\27\5\2//\63\669:\2\u0266"+
		"\2S\3\2\2\2\4c\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n{\3\2\2\2\f\177\3\2\2\2"+
		"\16\u0090\3\2\2\2\20\u0095\3\2\2\2\22\u009a\3\2\2\2\24\u00a2\3\2\2\2\26"+
		"\u00b5\3\2\2\2\30\u00db\3\2\2\2\32\u00ec\3\2\2\2\34\u00fa\3\2\2\2\36\u0101"+
		"\3\2\2\2 \u0107\3\2\2\2\"\u010c\3\2\2\2$\u0119\3\2\2\2&\u0120\3\2\2\2"+
		"(\u012e\3\2\2\2*\u0130\3\2\2\2,\u013c\3\2\2\2.\u0140\3\2\2\2\60\u0158"+
		"\3\2\2\2\62\u016b\3\2\2\2\64\u0180\3\2\2\2\66\u0191\3\2\2\28\u01a2\3\2"+
		"\2\2:\u01b9\3\2\2\2<\u01cd\3\2\2\2>\u01de\3\2\2\2@\u01ed\3\2\2\2B\u01f8"+
		"\3\2\2\2D\u0203\3\2\2\2F\u020a\3\2\2\2H\u0227\3\2\2\2JN\5\22\n\2KM\79"+
		"\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QJ\3\2"+
		"\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2V`\5\24\13\2W[\5"+
		"\26\f\2XZ\79\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2^W\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\3\3\2\2\2b`\3\2\2\2"+
		"cg\7\3\2\2df\t\2\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2"+
		"ig\3\2\2\2jk\7\3\2\2k\5\3\2\2\2lu\7\66\2\2mu\5\4\3\2nu\5\b\5\2ou\5\30"+
		"\r\2pu\5\f\7\2qu\5\n\6\2ru\7\4\2\2su\7\5\2\2tl\3\2\2\2tm\3\2\2\2tn\3\2"+
		"\2\2to\3\2\2\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\7\3\2\2\2vw\7"+
		"\6\2\2wx\7\7\2\2xy\5\n\6\2yz\7\b\2\2z\t\3\2\2\2{}\t\3\2\2|~\5@!\2}|\3"+
		"\2\2\2}~\3\2\2\2~\13\3\2\2\2\177\u0080\7\61\2\2\u0080\u0085\7\7\2\2\u0081"+
		"\u0086\5\n\6\2\u0082\u0086\5\30\r\2\u0083\u0086\7\66\2\2\u0084\u0086\5"+
		"\f\7\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008c\7,\2\2\u0088\u008d\5\n"+
		"\6\2\u0089\u008d\5\30\r\2\u008a\u008d\7\66\2\2\u008b\u008d\5\f\7\2\u008c"+
		"\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\b\2\2\u008f\r\3\2\2\2\u0090\u0091"+
		"\t\4\2\2\u0091\u0092\7\7\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7\b\2\2\u0094"+
		"\17\3\2\2\2\u0095\u0098\7\13\2\2\u0096\u0099\5\6\4\2\u0097\u0099\5(\25"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\21\3\2\2\2\u009a\u009b"+
		"\t\5\2\2\u009b\u009c\7\62\2\2\u009c\u009e\5\n\6\2\u009d\u009f\5\36\20"+
		"\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1"+
		"\7-\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\16\2\2\u00a3\u00ab\7\67\2\2\u00a4"+
		"\u00a8\5H%\2\u00a5\u00a7\7\67\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\79\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\25\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\u00b7"+
		"\7\20\2\2\u00b7\u00b8\5\n\6\2\u00b8\u00c6\7\7\2\2\u00b9\u00bb\7\62\2\2"+
		"\u00ba\u00bc\5@!\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00c0\5\6\4\2\u00be\u00c0\5(\25\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\7,\2\2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b9\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00d2\7\67\2\2\u00cb"+
		"\u00cf\5H%\2\u00cc\u00ce\7\67\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00cb\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d8\5\20\t\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\78"+
		"\2\2\u00da\27\3\2\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00e7"+
		"\7\7\2\2\u00de\u00e1\5\6\4\2\u00df\u00e1\5(\25\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e4\7,\2\2\u00e3\u00e2\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\b\2\2\u00eb\31\3\2\2\2\u00ec\u00ed"+
		"\t\6\2\2\u00ed\u00f7\7\62\2\2\u00ee\u00f0\5\n\6\2\u00ef\u00f1\5\36\20"+
		"\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4"+
		"\7,\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\33\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\n\6\2\u00fb\u00fd"+
		"\5\36\20\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2"+
		"\u00fe\u0100\7,\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\35\3"+
		"\2\2\2\u0101\u0105\7\23\2\2\u0102\u0106\5\6\4\2\u0103\u0106\5(\25\2\u0104"+
		"\u0106\5B\"\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2"+
		"\2\2\u0106\37\3\2\2\2\u0107\u0108\7\24\2\2\u0108\u0109\7\7\2\2\u0109\u010a"+
		"\5(\25\2\u010a\u010b\7\b\2\2\u010b!\3\2\2\2\u010c\u010d\7\25\2\2\u010d"+
		"\u0110\7\7\2\2\u010e\u0111\5\6\4\2\u010f\u0111\5(\25\2\u0110\u010e\3\2"+
		"\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0115\7,\2\2\u0113"+
		"\u0116\5\6\4\2\u0114\u0116\5(\25\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7\b\2\2\u0118#\3\2\2\2\u0119\u011a"+
		"\7\60\2\2\u011a\u011b\7\7\2\2\u011b\u011c\5\6\4\2\u011c\u011d\7,\2\2\u011d"+
		"\u011e\5\6\4\2\u011e\u011f\7\b\2\2\u011f%\3\2\2\2\u0120\u0121\t\7\2\2"+
		"\u0121\u0122\7\7\2\2\u0122\u0123\5(\25\2\u0123\u0124\7,\2\2\u0124\u0125"+
		"\5(\25\2\u0125\u0126\7\b\2\2\u0126\'\3\2\2\2\u0127\u012f\5\30\r\2\u0128"+
		"\u012f\5 \21\2\u0129\u012f\5&\24\2\u012a\u012f\5$\23\2\u012b\u012f\5\""+
		"\22\2\u012c\u012f\7\4\2\2\u012d\u012f\7\5\2\2\u012e\u0127\3\2\2\2\u012e"+
		"\u0128\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012b\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f)\3\2\2\2\u0130\u0137"+
		"\7\30\2\2\u0131\u0133\5\6\4\2\u0132\u0134\7,\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013b\7\b\2\2\u013b+\3\2\2\2\u013c\u013d\7\31\2\2"+
		"\u013d\u013e\5\n\6\2\u013e\u013f\7\b\2\2\u013f-\3\2\2\2\u0140\u0141\7"+
		"\32\2\2\u0141\u0149\7\67\2\2\u0142\u0146\5H%\2\u0143\u0145\7\67\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u0142\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0150\3\2"+
		"\2\2\u014d\u014f\79\2\2\u014e\u014d\3\2\2\2\u014f\u0152\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2"+
		"\2\2\u0153\u0154\7\33\2\2\u0154\u0155\5(\25\2\u0155\u0156\7\b\2\2\u0156"+
		"\u0157\78\2\2\u0157/\3\2\2\2\u0158\u015b\7\34\2\2\u0159\u015c\5\n\6\2"+
		"\u015a\u015c\5\30\r\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\7\21\2\2\u015e\u0164\7\67\2\2\u015f\u0160\5\62\32"+
		"\2\u0160\u0161\7\67\2\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0168\5\64\33\2\u0168\u0169\7\67\2\2\u0169"+
		"\u016a\78\2\2\u016a\61\3\2\2\2\u016b\u016e\7\35\2\2\u016c\u016f\7\66\2"+
		"\2\u016d\u016f\5\4\3\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0170"+
		"\3\2\2\2\u0170\u0171\7\36\2\2\u0171\u0179\7\67\2\2\u0172\u0176\5H%\2\u0173"+
		"\u0175\7\67\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u0172\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017e\7\67\2\2\u017e\u017f\78\2\2\u017f"+
		"\63\3\2\2\2\u0180\u0181\7\37\2\2\u0181\u018b\7\67\2\2\u0182\u0186\5H%"+
		"\2\u0183\u0185\7\67\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u0182\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\67"+
		"\2\2\u018f\u0190\78\2\2\u0190\65\3\2\2\2\u0191\u0192\7\33\2\2\u0192\u0193"+
		"\5(\25\2\u0193\u0194\7\21\2\2\u0194\u019c\7\67\2\2\u0195\u0199\5H%\2\u0196"+
		"\u0198\7\67\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019c"+
		"\u0195\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\78\2\2\u01a1\67\3\2\2\2\u01a2\u01a3"+
		"\7 \2\2\u01a3\u01a4\5\n\6\2\u01a4\u01a5\7\23\2\2\u01a5\u01a6\7\66\2\2"+
		"\u01a6\u01a7\7!\2\2\u01a7\u01a8\5$\23\2\u01a8\u01a9\7!\2\2\u01a9\u01aa"+
		"\5\16\b\2\u01aa\u01ab\7\21\2\2\u01ab\u01b3\7\67\2\2\u01ac\u01b0\5H%\2"+
		"\u01ad\u01af\7\67\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae"+
		"\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3"+
		"\u01ac\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\78\2\2\u01b89\3\2\2\2\u01b9\u01ba"+
		"\7\"\2\2\u01ba\u01bb\7\62\2\2\u01bb\u01bc\5\n\6\2\u01bc\u01bd\7#\2\2\u01bd"+
		"\u01be\5\n\6\2\u01be\u01bf\7\21\2\2\u01bf\u01c7\7\67\2\2\u01c0\u01c4\5"+
		"H%\2\u01c1\u01c3\7\67\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c0\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\78\2\2\u01cc;\3\2\2\2\u01cd"+
		"\u01ce\7$\2\2\u01ce\u01cf\5(\25\2\u01cf\u01d0\7\21\2\2\u01d0\u01d8\7\67"+
		"\2\2\u01d1\u01d5\5H%\2\u01d2\u01d4\7\67\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d9\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d1\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\78"+
		"\2\2\u01dd=\3\2\2\2\u01de\u01df\7%\2\2\u01df\u01e7\7\67\2\2\u01e0\u01e4"+
		"\5H%\2\u01e1\u01e3\7\67\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01e0\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\78\2\2\u01ec?\3\2\2\2\u01ed"+
		"\u01f4\7&\2\2\u01ee\u01f5\5\n\6\2\u01ef\u01f2\7\66\2\2\u01f0\u01f1\7."+
		"\2\2\u01f1\u01f3\7\66\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01ef\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7\'\2\2\u01f7A\3\2\2\2\u01f8\u01fd"+
		"\7&\2\2\u01f9\u01fb\5\6\4\2\u01fa\u01fc\7,\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"\u0202\7\'\2\2\u0202C\3\2\2\2\u0203\u0207\7(\2\2\u0204\u0206\t\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208E\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020e\7)\2\2\u020b\u020d"+
		"\t\b\2\2\u020c\u020b\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\7*"+
		"\2\2\u0212G\3\2\2\2\u0213\u0228\5\30\r\2\u0214\u0228\5\26\f\2\u0215\u0228"+
		"\5\32\16\2\u0216\u0228\5\34\17\2\u0217\u0228\5*\26\2\u0218\u0228\5,\27"+
		"\2\u0219\u0228\5.\30\2\u021a\u0228\5\60\31\2\u021b\u0228\5\62\32\2\u021c"+
		"\u0228\5\64\33\2\u021d\u0228\5\66\34\2\u021e\u0228\58\35\2\u021f\u0228"+
		"\5:\36\2\u0220\u0228\5<\37\2\u0221\u0228\5> \2\u0222\u0228\5\f\7\2\u0223"+
		"\u0228\5\16\b\2\u0224\u0228\5D#\2\u0225\u0228\5F$\2\u0226\u0228\5\20\t"+
		"\2\u0227\u0213\3\2\2\2\u0227\u0214\3\2\2\2\u0227\u0215\3\2\2\2\u0227\u0216"+
		"\3\2\2\2\u0227\u0217\3\2\2\2\u0227\u0218\3\2\2\2\u0227\u0219\3\2\2\2\u0227"+
		"\u021a\3\2\2\2\u0227\u021b\3\2\2\2\u0227\u021c\3\2\2\2\u0227\u021d\3\2"+
		"\2\2\u0227\u021e\3\2\2\2\u0227\u021f\3\2\2\2\u0227\u0220\3\2\2\2\u0227"+
		"\u0221\3\2\2\2\u0227\u0222\3\2\2\2\u0227\u0223\3\2\2\2\u0227\u0224\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228I\3\2\2\2@NS[`gt}\u0085"+
		"\u008c\u0098\u009e\u00a8\u00ad\u00b2\u00bb\u00bf\u00c2\u00c6\u00cf\u00d4"+
		"\u00d7\u00e0\u00e3\u00e7\u00f0\u00f3\u00f7\u00fc\u00ff\u0105\u0110\u0115"+
		"\u012e\u0133\u0137\u0146\u014b\u0150\u015b\u0164\u016e\u0176\u017b\u0186"+
		"\u018b\u0199\u019e\u01b0\u01b5\u01c4\u01c9\u01d5\u01da\u01e4\u01e9\u01f2"+
		"\u01f4\u01fb\u01ff\u0207\u020e\u0227";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}