// Generated from UDG.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UDGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMCODE=1, PARAM=2, NAME=3, AUTHOR=4, RET=5, ID=6, WS=7, NL=8, LCOMM=9, 
		RCOMM=10, JUNK=11, INJUNK=12;
	public static final int
		RULE_program = 0, RULE_comment_list = 1, RULE_comment = 2, RULE_comm_type = 3, 
		RULE_tags_list = 4, RULE_tag = 5, RULE_id_list = 6, RULE_tag_prefix = 7, 
		RULE_junk_lines = 8, RULE_junk_list = 9, RULE_injunk_list = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "comment_list", "comment", "comm_type", "tags_list", "tag", 
			"id_list", "tag_prefix", "junk_lines", "junk_list", "injunk_list"
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

	@Override
	public String getGrammarFileName() { return "UDG.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UDGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Comment_listContext comment_list() {
			return getRuleContext(Comment_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			comment_list(0);
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

	public static class Comment_listContext extends ParserRuleContext {
		public Junk_linesContext junk_lines() {
			return getRuleContext(Junk_linesContext.class,0);
		}
		public Comment_listContext comment_list() {
			return getRuleContext(Comment_listContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Comment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterComment_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitComment_list(this);
		}
	}

	public final Comment_listContext comment_list() throws RecognitionException {
		return comment_list(0);
	}

	private Comment_listContext comment_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comment_listContext _localctx = new Comment_listContext(_ctx, _parentState);
		Comment_listContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_comment_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25);
			junk_lines(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Comment_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comment_list);
					setState(27);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(28);
					comment();
					setState(29);
					junk_lines(0);
					}
					} 
				}
				setState(35);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LCOMM() { return getToken(UDGParser.LCOMM, 0); }
		public Injunk_listContext injunk_list() {
			return getRuleContext(Injunk_listContext.class,0);
		}
		public Comm_typeContext comm_type() {
			return getRuleContext(Comm_typeContext.class,0);
		}
		public TerminalNode RCOMM() { return getToken(UDGParser.RCOMM, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(LCOMM);
			setState(37);
			injunk_list(0);
			setState(38);
			comm_type(0);
			setState(39);
			match(RCOMM);
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

	public static class Comm_typeContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(UDGParser.NL, 0); }
		public TerminalNode COMCODE() { return getToken(UDGParser.COMCODE, 0); }
		public Tags_listContext tags_list() {
			return getRuleContext(Tags_listContext.class,0);
		}
		public Comm_typeContext comm_type() {
			return getRuleContext(Comm_typeContext.class,0);
		}
		public Comm_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comm_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterComm_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitComm_type(this);
		}
	}

	public final Comm_typeContext comm_type() throws RecognitionException {
		return comm_type(0);
	}

	private Comm_typeContext comm_type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Comm_typeContext _localctx = new Comm_typeContext(_ctx, _parentState);
		Comm_typeContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_comm_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NL:
				{
				setState(42);
				match(NL);
				}
				break;
			case COMCODE:
				{
				setState(43);
				match(COMCODE);
				setState(44);
				tags_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Comm_typeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comm_type);
						setState(47);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(48);
						match(COMCODE);
						setState(49);
						tags_list(0);
						}
						break;
					case 2:
						{
						_localctx = new Comm_typeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_comm_type);
						setState(50);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(51);
						match(NL);
						}
						break;
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Tags_listContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Tags_listContext tags_list() {
			return getRuleContext(Tags_listContext.class,0);
		}
		public Tags_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterTags_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitTags_list(this);
		}
	}

	public final Tags_listContext tags_list() throws RecognitionException {
		return tags_list(0);
	}

	private Tags_listContext tags_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Tags_listContext _localctx = new Tags_listContext(_ctx, _parentState);
		Tags_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_tags_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			tag();
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Tags_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tags_list);
					setState(60);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(61);
					tag();
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class TagContext extends ParserRuleContext {
		public Tag_prefixContext tag_prefix() {
			return getRuleContext(Tag_prefixContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			tag_prefix();
			setState(68);
			id_list(0);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(UDGParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		return id_list(0);
	}

	private Id_listContext id_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_listContext _localctx = new Id_listContext(_ctx, _parentState);
		Id_listContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_id_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_list);
					setState(73);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(74);
					match(ID);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Tag_prefixContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(UDGParser.RET, 0); }
		public TerminalNode PARAM() { return getToken(UDGParser.PARAM, 0); }
		public TerminalNode NAME() { return getToken(UDGParser.NAME, 0); }
		public TerminalNode AUTHOR() { return getToken(UDGParser.AUTHOR, 0); }
		public Tag_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterTag_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitTag_prefix(this);
		}
	}

	public final Tag_prefixContext tag_prefix() throws RecognitionException {
		Tag_prefixContext _localctx = new Tag_prefixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tag_prefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARAM) | (1L << NAME) | (1L << AUTHOR) | (1L << RET))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Junk_linesContext extends ParserRuleContext {
		public Junk_listContext junk_list() {
			return getRuleContext(Junk_listContext.class,0);
		}
		public Junk_linesContext junk_lines() {
			return getRuleContext(Junk_linesContext.class,0);
		}
		public TerminalNode NL() { return getToken(UDGParser.NL, 0); }
		public Junk_linesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junk_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterJunk_lines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitJunk_lines(this);
		}
	}

	public final Junk_linesContext junk_lines() throws RecognitionException {
		return junk_lines(0);
	}

	private Junk_linesContext junk_lines(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Junk_linesContext _localctx = new Junk_linesContext(_ctx, _parentState);
		Junk_linesContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_junk_lines, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(83);
			junk_list(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Junk_linesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_junk_lines);
					setState(85);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(86);
					match(NL);
					setState(87);
					junk_list(0);
					}
					} 
				}
				setState(92);
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

	public static class Junk_listContext extends ParserRuleContext {
		public TerminalNode JUNK() { return getToken(UDGParser.JUNK, 0); }
		public Junk_listContext junk_list() {
			return getRuleContext(Junk_listContext.class,0);
		}
		public Junk_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junk_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterJunk_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitJunk_list(this);
		}
	}

	public final Junk_listContext junk_list() throws RecognitionException {
		return junk_list(0);
	}

	private Junk_listContext junk_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Junk_listContext _localctx = new Junk_listContext(_ctx, _parentState);
		Junk_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_junk_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(94);
				match(JUNK);
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Junk_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_junk_list);
					setState(98);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(99);
					match(JUNK);
					}
					} 
				}
				setState(104);
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

	public static class Injunk_listContext extends ParserRuleContext {
		public TerminalNode INJUNK() { return getToken(UDGParser.INJUNK, 0); }
		public Injunk_listContext injunk_list() {
			return getRuleContext(Injunk_listContext.class,0);
		}
		public TerminalNode NL() { return getToken(UDGParser.NL, 0); }
		public Injunk_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injunk_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).enterInjunk_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UDGListener ) ((UDGListener)listener).exitInjunk_list(this);
		}
	}

	public final Injunk_listContext injunk_list() throws RecognitionException {
		return injunk_list(0);
	}

	private Injunk_listContext injunk_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Injunk_listContext _localctx = new Injunk_listContext(_ctx, _parentState);
		Injunk_listContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_injunk_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(106);
				match(INJUNK);
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Injunk_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_injunk_list);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						match(INJUNK);
						}
						break;
					case 2:
						{
						_localctx = new Injunk_listContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_injunk_list);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						match(NL);
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return comment_list_sempred((Comment_listContext)_localctx, predIndex);
		case 3:
			return comm_type_sempred((Comm_typeContext)_localctx, predIndex);
		case 4:
			return tags_list_sempred((Tags_listContext)_localctx, predIndex);
		case 6:
			return id_list_sempred((Id_listContext)_localctx, predIndex);
		case 8:
			return junk_lines_sempred((Junk_linesContext)_localctx, predIndex);
		case 9:
			return junk_list_sempred((Junk_listContext)_localctx, predIndex);
		case 10:
			return injunk_list_sempred((Injunk_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean comment_list_sempred(Comment_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean comm_type_sempred(Comm_typeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean tags_list_sempred(Tags_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean id_list_sempred(Id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean junk_lines_sempred(Junk_linesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean junk_list_sempred(Junk_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean injunk_list_sempred(Injunk_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\67\n\5\f\5\16\5:\13\5\3\6\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n[\n\n\f\n\16\n^\13\n\3\13\3\13\3\13\5\13c\n\13\3\13"+
		"\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\5\fo\n\f\3\f\3\f\3\f\3"+
		"\f\7\fu\n\f\f\f\16\fx\13\f\3\f\2\t\4\b\n\16\22\24\26\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\3\3\2\4\7\2z\2\30\3\2\2\2\4\32\3\2\2\2\6&\3\2\2\2\b/\3"+
		"\2\2\2\n;\3\2\2\2\fE\3\2\2\2\16H\3\2\2\2\20R\3\2\2\2\22T\3\2\2\2\24b\3"+
		"\2\2\2\26n\3\2\2\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\b\3\1\2\33\34\5\22"+
		"\n\2\34#\3\2\2\2\35\36\f\4\2\2\36\37\5\6\4\2\37 \5\22\n\2 \"\3\2\2\2!"+
		"\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7\13"+
		"\2\2\'(\5\26\f\2()\5\b\5\2)*\7\f\2\2*\7\3\2\2\2+,\b\5\1\2,\60\7\n\2\2"+
		"-.\7\3\2\2.\60\5\n\6\2/+\3\2\2\2/-\3\2\2\2\608\3\2\2\2\61\62\f\6\2\2\62"+
		"\63\7\3\2\2\63\67\5\n\6\2\64\65\f\5\2\2\65\67\7\n\2\2\66\61\3\2\2\2\66"+
		"\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\t\3\2\2\2:8\3\2\2\2;<\b"+
		"\6\1\2<=\5\f\7\2=B\3\2\2\2>?\f\4\2\2?A\5\f\7\2@>\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\13\3\2\2\2DB\3\2\2\2EF\5\20\t\2FG\5\16\b\2G\r\3\2\2"+
		"\2HI\b\b\1\2IJ\7\b\2\2JO\3\2\2\2KL\f\4\2\2LN\7\b\2\2MK\3\2\2\2NQ\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QO\3\2\2\2RS\t\2\2\2S\21\3\2\2\2TU\b"+
		"\n\1\2UV\5\24\13\2V\\\3\2\2\2WX\f\4\2\2XY\7\n\2\2Y[\5\24\13\2ZW\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\23\3\2\2\2^\\\3\2\2\2_`\b\13\1\2`"+
		"c\7\r\2\2ac\3\2\2\2b_\3\2\2\2ba\3\2\2\2ch\3\2\2\2de\f\5\2\2eg\7\r\2\2"+
		"fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\25\3\2\2\2jh\3\2\2\2kl\b\f\1"+
		"\2lo\7\16\2\2mo\3\2\2\2nk\3\2\2\2nm\3\2\2\2ov\3\2\2\2pq\f\6\2\2qu\7\16"+
		"\2\2rs\f\5\2\2su\7\n\2\2tp\3\2\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2"+
		"\2\2w\27\3\2\2\2xv\3\2\2\2\16#/\668BO\\bhntv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}