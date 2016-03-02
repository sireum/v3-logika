/*
 Copyright (c) 2016, Robby, Kansas State University
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:

 1. Redistributions of source code must retain the above copyright notice, this
    list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

// Generated from /Users/robby/Repositories/Sireum/sireum-v3/logika/jvm/src/main/resources/org/sireum/logika/parser/Antlr4Logika.g4 by ANTLR 4.5.1
package org.sireum.logika.parser;

// @formatter:off

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Antlr4LogikaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, HLINE=169, NUM=170, ID=171, RESERVED=172, NL=173, LINE_COMMENT=174, 
		COMMENT=175, WS=176, STRING=177, FLOAT=178, ERROR_CHAR=179;
	public static final int
		RULE_file = 0, RULE_sequent = 1, RULE_proof = 2, RULE_proofStep = 3, RULE_primFormula = 4, 
		RULE_formula = 5, RULE_qformula = 6, RULE_type = 7, RULE_justification = 8, 
		RULE_program = 9, RULE_impor = 10, RULE_facts = 11, RULE_factOrFun = 12, 
		RULE_fact = 13, RULE_fun = 14, RULE_param = 15, RULE_stmts = 16, RULE_stmt = 17, 
		RULE_stringOrExp = 18, RULE_primExp = 19, RULE_exp = 20, RULE_loopInvariant = 21, 
		RULE_modifies = 22, RULE_methodContract = 23, RULE_invariants = 24;
	public static final String[] ruleNames = {
		"file", "sequent", "proof", "proofStep", "primFormula", "formula", "qformula", 
		"type", "justification", "program", "impor", "facts", "factOrFun", "fact", 
		"fun", "param", "stmts", "stmt", "stringOrExp", "primExp", "exp", "loopInvariant", 
		"modifies", "methodContract", "invariants"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'|-'", "'⊢'", "'{'", "'}'", "'.'", "':'", "'assume'", "'true'", 
		"'T'", "'⊤'", "'false'", "'F'", "'_|_'", "'⊥'", "'('", "')'", "'result'", 
		"'Z'", "'R'", "'B'", "'Z8'", "'Z16'", "'Z32'", "'Z64'", "'N'", "'N8'", 
		"'N16'", "'N32'", "'N64'", "'S8'", "'S16'", "'S32'", "'S64'", "'U8'", 
		"'U16'", "'U32'", "'U64'", "'F32'", "'F64'", "'BS'", "'ZS'", "'Z8S'", 
		"'Z16S'", "'Z32S'", "'Z64S'", "'NS'", "'N8S'", "'N16S'", "'N32S'", "'N64S'", 
		"'S8S'", "'S16S'", "'S32S'", "'S64S'", "'U8S'", "'U16S'", "'U32S'", "'U64S'", 
		"'RS'", "'F32S'", "'F64S'", "'*'", "'/'", "'%'", "'+'", "'-'", "'+:'", 
		"':+'", "'='", "'=='", "'!='", "'≠'", "'not'", "'neg'", "'!'", "'~'", 
		"'¬'", "'<'", "'<='", "'≤'", "'>'", "'>='", "'≥'", "'>>'", "'>>>'", "'<<'", 
		"'and'", "'&'", "'^'", "'∧'", "'^|'", "'or'", "'|'", "'V'", "'∨'", "'implies'", 
		"'->'", "'→'", "'forall'", "'all'", "'A'", "'∀'", "'exists'", "'some'", 
		"'E'", "'∃'", "'..'", "'premise'", "'andi'", "'ande1'", "'ande2'", "'ori1'", 
		"'Vi1'", "'ori2'", "'Vi2'", "'ore'", "'Ve'", "'impliesi'", "'impliese'", 
		"'noti'", "'negi'", "'note'", "'nege'", "'bottome'", "'falsee'", "'pbc'", 
		"'subst1'", "'subst2'", "'algebra'", "'foralli'", "'alli'", "'Ai'", "'foralle'", 
		"'alle'", "'Ae'", "'existsi'", "'somei'", "'Ei'", "'existse'", "'somee'", 
		"'Ee'", "'invariant'", "'fact'", "'auto'", "'import'", "'_'", "'def'", 
		"'var'", "'val'", "'assert'", "'if'", "'else'", "'while'", "'l\"\"\"'", 
		"'\"\"\"'", "'print'", "'println'", "'@'", "'Unit'", "'return'", "'randomInt'", 
		"'readInt'", "'modifies'", "'requires'", "'pre'", "'ensures'", "'post'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "HLINE", "NUM", "ID", "RESERVED", "NL", "LINE_COMMENT", "COMMENT", 
		"WS", "STRING", "FLOAT", "ERROR_CHAR"
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
	public String getGrammarFileName() { return "Antlr4Logika.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Antlr4LogikaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	 
		public FileContext() { }
		public void copyFrom(FileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SequentFileContext extends FileContext {
		public SequentContext sequent() {
			return getRuleContext(SequentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Antlr4LogikaParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ProofContext proof() {
			return getRuleContext(ProofContext.class,0);
		}
		public SequentFileContext(FileContext ctx) { copyFrom(ctx); }
	}
	public static class ProgramFileContext extends FileContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Antlr4LogikaParser.EOF, 0); }
		public ProgramFileContext(FileContext ctx) { copyFrom(ctx); }
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			setState(71);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__66:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case HLINE:
			case NUM:
			case ID:
			case FLOAT:
				_localctx = new SequentFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				sequent();
				setState(54);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(51);
						match(NL);
						}
						} 
					}
					setState(56);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(58);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(57);
					proof();
					}
				}

				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(60);
					match(NL);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				match(EOF);
				}
				break;
			case EOF:
			case T__145:
			case NL:
				_localctx = new ProgramFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				program();
				setState(69);
				match(EOF);
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

	public static class SequentContext extends ParserRuleContext {
		public FormulaContext formula;
		public List<FormulaContext> premises = new ArrayList<FormulaContext>();
		public List<FormulaContext> conclusions = new ArrayList<FormulaContext>();
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode HLINE() { return getToken(Antlr4LogikaParser.HLINE, 0); }
		public SequentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequent; }
	}

	public final SequentContext sequent() throws RecognitionException {
		SequentContext _localctx = new SequentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequent);
		int _la;
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
					{
					setState(73);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(74);
						match(T__0);
						setState(75);
						((SequentContext)_localctx).formula = formula(0);
						((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
						}
						}
						setState(80);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(83);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(84);
				((SequentContext)_localctx).formula = formula(0);
				((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(85);
					match(T__0);
					setState(86);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
					{
					{
					setState(92);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).premises.add(((SequentContext)_localctx).formula);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(HLINE);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					((SequentContext)_localctx).formula = formula(0);
					((SequentContext)_localctx).conclusions.add(((SequentContext)_localctx).formula);
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0) );
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

	public static class ProofContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public List<ProofStepContext> proofStep() {
			return getRuleContexts(ProofStepContext.class);
		}
		public ProofStepContext proofStep(int i) {
			return getRuleContext(ProofStepContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proof; }
	}

	public final ProofContext proof() throws RecognitionException {
		ProofContext _localctx = new ProofContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_proof);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((ProofContext)_localctx).tb = match(T__3);
			setState(108);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(107);
				proofStep();
				}
			}

			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(116);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(115);
					proofStep();
					}
				}

				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			((ProofContext)_localctx).te = match(T__4);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(NL);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ProofStepContext extends ParserRuleContext {
		public ProofStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofStep; }
	 
		public ProofStepContext() { }
		public void copyFrom(ProofStepContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubProofContext extends ProofStepContext {
		public Token sub;
		public Token assume;
		public Token ate;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ProofStepContext> proofStep() {
			return getRuleContexts(ProofStepContext.class);
		}
		public ProofStepContext proofStep(int i) {
			return getRuleContext(ProofStepContext.class,i);
		}
		public SubProofContext(ProofStepContext ctx) { copyFrom(ctx); }
	}
	public static class StepContext extends ProofStepContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public JustificationContext justification() {
			return getRuleContext(JustificationContext.class,0);
		}
		public StepContext(ProofStepContext ctx) { copyFrom(ctx); }
	}

	public final ProofStepContext proofStep() throws RecognitionException {
		ProofStepContext _localctx = new ProofStepContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proofStep);
		int _la;
		try {
			int _alt;
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new StepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(NUM);
				setState(131);
				match(T__5);
				setState(132);
				formula(0);
				setState(133);
				justification();
				}
				break;
			case 2:
				_localctx = new SubProofContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((SubProofContext)_localctx).sub = match(NUM);
				setState(136);
				match(T__5);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(137);
					match(NL);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(T__3);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(144);
					match(NL);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				((SubProofContext)_localctx).assume = match(NUM);
				setState(151);
				match(T__5);
				setState(168);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(152);
					match(ID);
					setState(155);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(153);
						match(T__6);
						setState(154);
						type();
						}
					}

					}
					break;
				case 2:
					{
					setState(157);
					formula(0);
					setState(158);
					((SubProofContext)_localctx).ate = match(T__7);
					}
					break;
				case 3:
					{
					setState(160);
					match(ID);
					setState(163);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(161);
						match(T__6);
						setState(162);
						type();
						}
					}

					setState(165);
					formula(0);
					setState(166);
					((SubProofContext)_localctx).ate = match(T__7);
					}
					break;
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(171); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(170);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(173); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(176);
					_la = _input.LA(1);
					if (_la==NUM) {
						{
						setState(175);
						proofStep();
						}
					}

					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__4);
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

	public static class PrimFormulaContext extends ParserRuleContext {
		public PrimFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primFormula; }
	 
		public PrimFormulaContext() { }
		public void copyFrom(PrimFormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatLitContext extends PrimFormulaContext {
		public TerminalNode FLOAT() { return getToken(Antlr4LogikaParser.FLOAT, 0); }
		public FloatLitContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends PrimFormulaContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public VarContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class ApplyContext extends PrimFormulaContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ApplyContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class LitContext extends PrimFormulaContext {
		public Token t;
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public LitContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class TypeAccessContext extends PrimFormulaContext {
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeAccessContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanContext extends PrimFormulaContext {
		public Token t;
		public BooleanContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class IntContext extends PrimFormulaContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public IntContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class SeqContext extends PrimFormulaContext {
		public Token t;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SeqContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class ParenContext extends PrimFormulaContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ParenContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}
	public static class ResultContext extends PrimFormulaContext {
		public ResultContext(PrimFormulaContext ctx) { copyFrom(ctx); }
	}

	public final PrimFormulaContext primFormula() throws RecognitionException {
		PrimFormulaContext _localctx = new PrimFormulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primFormula);
		int _la;
		try {
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((BooleanContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
					((BooleanContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((VarContext)_localctx).tb = match(ID);
				}
				break;
			case 3:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__15);
				setState(189);
				formula(0);
				setState(190);
				match(T__16);
				}
				break;
			case 4:
				_localctx = new ResultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(T__17);
				}
				break;
			case 5:
				_localctx = new ApplyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(ID);
				setState(194);
				match(T__15);
				setState(195);
				formula(0);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(196);
					match(T__0);
					setState(197);
					formula(0);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__16);
				}
				break;
			case 6:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				match(NUM);
				}
				break;
			case 7:
				_localctx = new LitContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				((LitContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((LitContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(207);
				match(T__15);
				setState(208);
				match(STRING);
				setState(209);
				match(T__16);
				}
				break;
			case 8:
				_localctx = new FloatLitContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(210);
				match(FLOAT);
				}
				break;
			case 9:
				_localctx = new TypeAccessContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(211);
				((TypeAccessContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
					((TypeAccessContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(212);
				match(T__5);
				setState(213);
				match(ID);
				}
				break;
			case 10:
				_localctx = new SeqContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(214);
				((SeqContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
					((SeqContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(215);
				match(T__15);
				setState(224);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (T__161 - 162)) | (1L << (T__162 - 162)) | (1L << (NUM - 162)) | (1L << (ID - 162)) | (1L << (FLOAT - 162)))) != 0)) {
					{
					setState(216);
					exp(0);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(217);
						match(T__0);
						setState(218);
						exp(0);
						}
						}
						setState(223);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(226);
				match(T__16);
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

	public static class FormulaContext extends ParserRuleContext {
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PFormulaContext extends FormulaContext {
		public PrimFormulaContext primFormula() {
			return getRuleContext(PrimFormulaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public PFormulaContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryContext extends FormulaContext {
		public FormulaContext l;
		public Token op;
		public FormulaContext r;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public BinaryContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends FormulaContext {
		public Token op;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public UnaryContext(FormulaContext ctx) { copyFrom(ctx); }
	}
	public static class QuantContext extends FormulaContext {
		public QformulaContext qformula() {
			return getRuleContext(QformulaContext.class,0);
		}
		public QuantContext(FormulaContext ctx) { copyFrom(ctx); }
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			switch (_input.LA(1)) {
			case T__66:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(230);
				((UnaryContext)_localctx).op = match(T__66);
				setState(231);
				formula(8);
				}
				break;
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__77 - 74)))) != 0)) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(233);
				formula(7);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case NUM:
			case ID:
			case FLOAT:
				{
				_localctx = new PFormulaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				primFormula();
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						match(T__5);
						setState(236);
						match(ID);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
				{
				_localctx = new QuantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				qformula();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(245);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(246);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(248);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(247);
							match(NL);
							}
						}

						setState(250);
						((BinaryContext)_localctx).r = formula(14);
						}
						break;
					case 2:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(251);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(252);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__66) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(254);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(253);
							match(NL);
							}
						}

						setState(256);
						((BinaryContext)_localctx).r = formula(13);
						}
						break;
					case 3:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(257);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(258);
						((BinaryContext)_localctx).op = match(T__67);
						setState(260);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(259);
							match(NL);
							}
						}

						setState(262);
						((BinaryContext)_localctx).r = formula(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(263);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(264);
						((BinaryContext)_localctx).op = match(T__68);
						setState(266);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(265);
							match(NL);
							}
						}

						setState(268);
						((BinaryContext)_localctx).r = formula(11);
						}
						break;
					case 5:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(269);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(270);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(272);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(271);
							match(NL);
							}
						}

						setState(274);
						((BinaryContext)_localctx).r = formula(10);
						}
						break;
					case 6:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(275);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(276);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__80 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__83 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(278);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(277);
							match(NL);
							}
						}

						setState(280);
						((BinaryContext)_localctx).r = formula(7);
						}
						break;
					case 7:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (T__87 - 88)) | (1L << (T__88 - 88)) | (1L << (T__89 - 88)) | (1L << (T__90 - 88)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(284);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(283);
							match(NL);
							}
						}

						setState(286);
						((BinaryContext)_localctx).r = formula(6);
						}
						break;
					case 8:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(287);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(288);
						((BinaryContext)_localctx).op = match(T__91);
						setState(290);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(289);
							match(NL);
							}
						}

						setState(292);
						((BinaryContext)_localctx).r = formula(5);
						}
						break;
					case 9:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(293);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(294);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)) | (1L << (T__95 - 93)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(296);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(295);
							match(NL);
							}
						}

						setState(298);
						((BinaryContext)_localctx).r = formula(4);
						}
						break;
					case 10:
						{
						_localctx = new BinaryContext(new FormulaContext(_parentctx, _parentState));
						((BinaryContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(299);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(300);
						((BinaryContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__97 - 97)) | (1L << (T__98 - 97)))) != 0)) ) {
							((BinaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(302);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(301);
							match(NL);
							}
						}

						setState(304);
						((BinaryContext)_localctx).r = formula(2);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class QformulaContext extends ParserRuleContext {
		public Token q;
		public Token ID;
		public List<Token> vars = new ArrayList<Token>();
		public ExpContext lo;
		public Token ll;
		public Token lh;
		public ExpContext hi;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public QformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qformula; }
	}

	public final QformulaContext qformula() throws RecognitionException {
		QformulaContext _localctx = new QformulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qformula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			((QformulaContext)_localctx).q = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & ((1L << (T__99 - 100)) | (1L << (T__100 - 100)) | (1L << (T__101 - 100)) | (1L << (T__102 - 100)) | (1L << (T__103 - 100)) | (1L << (T__104 - 100)) | (1L << (T__105 - 100)) | (1L << (T__106 - 100)))) != 0)) ) {
				((QformulaContext)_localctx).q = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(311);
			((QformulaContext)_localctx).ID = match(ID);
			((QformulaContext)_localctx).vars.add(((QformulaContext)_localctx).ID);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(312);
				match(T__0);
				setState(313);
				((QformulaContext)_localctx).ID = match(ID);
				((QformulaContext)_localctx).vars.add(((QformulaContext)_localctx).ID);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(319);
				match(T__6);
				setState(320);
				type();
				}
				break;
			case 2:
				{
				setState(321);
				match(T__6);
				setState(322);
				match(T__15);
				setState(323);
				((QformulaContext)_localctx).lo = exp(0);
				setState(325);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(324);
					((QformulaContext)_localctx).ll = match(T__78);
					}
				}

				setState(327);
				match(T__107);
				setState(329);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(328);
					((QformulaContext)_localctx).lh = match(T__78);
					}
				}

				setState(331);
				((QformulaContext)_localctx).hi = exp(0);
				setState(332);
				match(T__16);
				}
				break;
			}
			setState(337);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(336);
				match(NL);
				}
			}

			setState(339);
			formula(0);
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

	public static class TypeContext extends ParserRuleContext {
		public Token t;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			((TypeContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
				((TypeContext)_localctx).t = (Token)_errHandler.recoverInline(this);
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

	public static class JustificationContext extends ParserRuleContext {
		public JustificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justification; }
	 
		public JustificationContext() { }
		public void copyFrom(JustificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvariantContext extends JustificationContext {
		public Token tb;
		public InvariantContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ForallElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ForallElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsIntroContext extends JustificationContext {
		public Token tb;
		public Token existsStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExistsIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class AndIntroContext extends JustificationContext {
		public Token tb;
		public Token lStep;
		public Token rStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public AndIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class OrIntroContext extends JustificationContext {
		public Token tb;
		public Token step;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public OrIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ForallIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ForallIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ExistsElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public Token subproof;
		public Token t;
		public Token subProof;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExistsElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ImpliesElimContext extends JustificationContext {
		public Token tb;
		public Token impliesStep;
		public Token antecedentStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ImpliesElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class PremiseContext extends JustificationContext {
		public Token t;
		public PremiseContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class AndElimContext extends JustificationContext {
		public Token tb;
		public Token andStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public AndElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class NegIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public NegIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class NegElimContext extends JustificationContext {
		public Token tb;
		public Token step;
		public Token negStep;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public NegElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class PbcContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public PbcContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class Subst2Context extends JustificationContext {
		public Token tb;
		public Token eqStep;
		public Token step;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public Subst2Context(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class AutoContext extends JustificationContext {
		public Token tb;
		public Token NUM;
		public List<Token> steps = new ArrayList<Token>();
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public AutoContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class Subst1Context extends JustificationContext {
		public Token tb;
		public Token eqStep;
		public Token step;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public Subst1Context(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class AlgebraContext extends JustificationContext {
		public Token tb;
		public Token NUM;
		public List<Token> steps = new ArrayList<Token>();
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public AlgebraContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class FctContext extends JustificationContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FctContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class BottomElimContext extends JustificationContext {
		public Token tb;
		public Token bottomStep;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public BottomElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class OrElimContext extends JustificationContext {
		public Token tb;
		public Token orStep;
		public Token lSubProof;
		public Token rSubProof;
		public List<TerminalNode> NUM() { return getTokens(Antlr4LogikaParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(Antlr4LogikaParser.NUM, i);
		}
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public OrElimContext(JustificationContext ctx) { copyFrom(ctx); }
	}
	public static class ImpliesIntroContext extends JustificationContext {
		public Token tb;
		public Token subProof;
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ImpliesIntroContext(JustificationContext ctx) { copyFrom(ctx); }
	}

	public final JustificationContext justification() throws RecognitionException {
		JustificationContext _localctx = new JustificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_justification);
		int _la;
		try {
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new PremiseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((PremiseContext)_localctx).t = match(T__108);
				}
				break;
			case 2:
				_localctx = new AndIntroContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				switch (_input.LA(1)) {
				case T__109:
					{
					setState(344);
					((AndIntroContext)_localctx).tb = match(T__109);
					}
					break;
				case T__88:
				case T__89:
				case T__90:
					{
					setState(345);
					((AndIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)))) != 0)) ) {
						((AndIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(346);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349);
				((AndIntroContext)_localctx).lStep = match(NUM);
				setState(350);
				((AndIntroContext)_localctx).rStep = match(NUM);
				}
				break;
			case 3:
				_localctx = new AndElimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				switch (_input.LA(1)) {
				case T__110:
				case T__111:
					{
					setState(351);
					((AndElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__110 || _la==T__111) ) {
						((AndElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case T__88:
				case T__89:
				case T__90:
					{
					setState(352);
					((AndElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)))) != 0)) ) {
						((AndElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(353);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(356);
				((AndElimContext)_localctx).andStep = match(NUM);
				}
				break;
			case 4:
				_localctx = new OrIntroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				switch (_input.LA(1)) {
				case T__112:
				case T__113:
				case T__114:
				case T__115:
					{
					setState(357);
					((OrIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (T__112 - 113)) | (1L << (T__113 - 113)) | (1L << (T__114 - 113)) | (1L << (T__115 - 113)))) != 0)) ) {
						((OrIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case T__93:
				case T__95:
					{
					setState(358);
					((OrIntroContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__93 || _la==T__95) ) {
						((OrIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(359);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(362);
				((OrIntroContext)_localctx).step = match(NUM);
				}
				break;
			case 5:
				_localctx = new OrElimContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				switch (_input.LA(1)) {
				case T__116:
				case T__117:
					{
					setState(363);
					((OrElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__116 || _la==T__117) ) {
						((OrElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case T__93:
				case T__95:
					{
					setState(364);
					((OrElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__93 || _la==T__95) ) {
						((OrElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(365);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368);
				((OrElimContext)_localctx).orStep = match(NUM);
				setState(369);
				((OrElimContext)_localctx).lSubProof = match(NUM);
				setState(370);
				((OrElimContext)_localctx).rSubProof = match(NUM);
				}
				break;
			case 6:
				_localctx = new ImpliesIntroContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				((ImpliesIntroContext)_localctx).tb = match(T__118);
				setState(372);
				((ImpliesIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 7:
				_localctx = new ImpliesElimContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(373);
				((ImpliesElimContext)_localctx).tb = match(T__119);
				setState(374);
				((ImpliesElimContext)_localctx).impliesStep = match(NUM);
				setState(375);
				((ImpliesElimContext)_localctx).antecedentStep = match(NUM);
				}
				break;
			case 8:
				_localctx = new ImpliesIntroContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(376);
				if (!(("->".equals(_input.LT(1).getText()) ||
				      "→".equals(_input.LT(1).getText())) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"->\".equals(_input.LT(1).getText()) ||\n      \"→\".equals(_input.LT(1).getText())) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(377);
				((ImpliesIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__97 || _la==T__98) ) {
					((ImpliesIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(378);
				match(ID);
				setState(379);
				((ImpliesIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 9:
				_localctx = new ImpliesElimContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(380);
				if (!(("->".equals(_input.LT(1).getText()) ||
				      "→".equals(_input.LT(1).getText())) &&
				      "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"->\".equals(_input.LT(1).getText()) ||\n      \"→\".equals(_input.LT(1).getText())) &&\n      \"e\".equals(_input.LT(2).getText())");
				setState(381);
				((ImpliesElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__97 || _la==T__98) ) {
					((ImpliesElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(382);
				match(ID);
				setState(383);
				((ImpliesElimContext)_localctx).impliesStep = match(NUM);
				setState(384);
				((ImpliesElimContext)_localctx).antecedentStep = match(NUM);
				}
				break;
			case 10:
				_localctx = new NegIntroContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(385);
				((NegIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__120 || _la==T__121) ) {
					((NegIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(386);
				((NegIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 11:
				_localctx = new NegElimContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(387);
				((NegElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__122 || _la==T__123) ) {
					((NegElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(388);
				((NegElimContext)_localctx).step = match(NUM);
				setState(389);
				((NegElimContext)_localctx).negStep = match(NUM);
				}
				break;
			case 12:
				_localctx = new NegIntroContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(390);
				if (!(("!".equals(_input.LT(1).getText()) ||
				      "~".equals(_input.LT(1).getText()) ||
				      "¬".equals(_input.LT(1).getText())) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"!\".equals(_input.LT(1).getText()) ||\n      \"~\".equals(_input.LT(1).getText()) ||\n      \"¬\".equals(_input.LT(1).getText())) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(391);
				((NegIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)))) != 0)) ) {
					((NegIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(392);
				match(ID);
				setState(393);
				((NegIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 13:
				_localctx = new NegElimContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(394);
				if (!(("!".equals(_input.LT(1).getText()) ||
				      "~".equals(_input.LT(1).getText()) ||
				      "¬".equals(_input.LT(1).getText())) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "(\"!\".equals(_input.LT(1).getText()) ||\n      \"~\".equals(_input.LT(1).getText()) ||\n      \"¬\".equals(_input.LT(1).getText())) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(395);
				((NegElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)))) != 0)) ) {
					((NegElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(396);
				match(ID);
				setState(397);
				((NegElimContext)_localctx).step = match(NUM);
				setState(398);
				((NegElimContext)_localctx).negStep = match(NUM);
				}
				break;
			case 14:
				_localctx = new BottomElimContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(402);
				switch (_input.LA(1)) {
				case T__124:
				case T__125:
					{
					setState(399);
					((BottomElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__124 || _la==T__125) ) {
						((BottomElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				case T__13:
				case T__14:
					{
					setState(400);
					((BottomElimContext)_localctx).tb = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
						((BottomElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(401);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(404);
				((BottomElimContext)_localctx).bottomStep = match(NUM);
				}
				break;
			case 15:
				_localctx = new PbcContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(405);
				((PbcContext)_localctx).tb = match(T__126);
				setState(406);
				((PbcContext)_localctx).subProof = match(NUM);
				}
				break;
			case 16:
				_localctx = new Subst1Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(407);
				((Subst1Context)_localctx).tb = match(T__127);
				setState(408);
				((Subst1Context)_localctx).eqStep = match(NUM);
				setState(409);
				((Subst1Context)_localctx).step = match(NUM);
				}
				break;
			case 17:
				_localctx = new Subst2Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(410);
				((Subst2Context)_localctx).tb = match(T__128);
				setState(411);
				((Subst2Context)_localctx).eqStep = match(NUM);
				setState(412);
				((Subst2Context)_localctx).step = match(NUM);
				}
				break;
			case 18:
				_localctx = new AlgebraContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(413);
				((AlgebraContext)_localctx).tb = match(T__129);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(414);
					((AlgebraContext)_localctx).NUM = match(NUM);
					((AlgebraContext)_localctx).steps.add(((AlgebraContext)_localctx).NUM);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 19:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(420);
				((ForallIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (T__130 - 131)) | (1L << (T__131 - 131)) | (1L << (T__132 - 131)))) != 0)) ) {
					((ForallIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(421);
				((ForallIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 20:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(422);
				((ForallElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)))) != 0)) ) {
					((ForallElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(423);
				((ForallElimContext)_localctx).step = match(NUM);
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(424);
					formula(0);
					}
					}
					setState(427); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0) );
				}
				break;
			case 21:
				_localctx = new ForallIntroContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(429);
				if (!("∀".equals(_input.LT(1).getText()) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"∀\".equals(_input.LT(1).getText()) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(430);
				((ForallIntroContext)_localctx).tb = match(T__102);
				setState(431);
				match(ID);
				setState(432);
				((ForallIntroContext)_localctx).subProof = match(NUM);
				}
				break;
			case 22:
				_localctx = new ForallElimContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(433);
				if (!("∀".equals(_input.LT(1).getText()) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"∀\".equals(_input.LT(1).getText()) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(434);
				((ForallElimContext)_localctx).tb = match(T__102);
				setState(435);
				match(ID);
				setState(436);
				((ForallElimContext)_localctx).step = match(NUM);
				setState(438); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(437);
					formula(0);
					}
					}
					setState(440); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0) );
				}
				break;
			case 23:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(442);
				((ExistsIntroContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (T__136 - 137)) | (1L << (T__137 - 137)) | (1L << (T__138 - 137)))) != 0)) ) {
					((ExistsIntroContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(443);
				((ExistsIntroContext)_localctx).existsStep = match(NUM);
				setState(445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(444);
					formula(0);
					}
					}
					setState(447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0) );
				}
				break;
			case 24:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(449);
				((ExistsElimContext)_localctx).tb = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (T__139 - 140)) | (1L << (T__140 - 140)) | (1L << (T__141 - 140)))) != 0)) ) {
					((ExistsElimContext)_localctx).tb = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(450);
				((ExistsElimContext)_localctx).step = match(NUM);
				setState(451);
				((ExistsElimContext)_localctx).subproof = match(NUM);
				}
				break;
			case 25:
				_localctx = new ExistsIntroContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(452);
				if (!("∃".equals(_input.LT(1).getText()) &&
				     "i".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"∃\".equals(_input.LT(1).getText()) &&\n     \"i\".equals(_input.LT(2).getText())");
				setState(453);
				((ExistsIntroContext)_localctx).tb = match(T__106);
				setState(454);
				match(ID);
				setState(455);
				((ExistsIntroContext)_localctx).existsStep = match(NUM);
				setState(457); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(456);
					formula(0);
					}
					}
					setState(459); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0) );
				}
				break;
			case 26:
				_localctx = new ExistsElimContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(461);
				if (!("∃".equals(_input.LT(1).getText()) &&
				     "e".equals(_input.LT(2).getText()))) throw new FailedPredicateException(this, "\"∃\".equals(_input.LT(1).getText()) &&\n     \"e\".equals(_input.LT(2).getText())");
				setState(462);
				((ExistsElimContext)_localctx).tb = match(T__106);
				setState(463);
				((ExistsElimContext)_localctx).t = match(ID);
				setState(464);
				((ExistsElimContext)_localctx).step = match(NUM);
				setState(465);
				((ExistsElimContext)_localctx).subProof = match(NUM);
				}
				break;
			case 27:
				_localctx = new InvariantContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(466);
				((InvariantContext)_localctx).tb = match(T__142);
				}
				break;
			case 28:
				_localctx = new FctContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(467);
				((FctContext)_localctx).tb = match(T__143);
				setState(468);
				match(ID);
				}
				break;
			case 29:
				_localctx = new AutoContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(469);
				((AutoContext)_localctx).tb = match(T__144);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUM) {
					{
					{
					setState(470);
					((AutoContext)_localctx).NUM = match(NUM);
					((AutoContext)_localctx).steps.add(((AutoContext)_localctx).NUM);
					}
					}
					setState(475);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ProgramContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ImporContext impor() {
			return getRuleContext(ImporContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(478);
				match(NL);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			_la = _input.LA(1);
			if (_la==T__145) {
				{
				setState(484);
				impor();
				setState(486); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(485);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(488); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(490);
				stmts();
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

	public static class ImporContext extends ParserRuleContext {
		public Token tb;
		public Token org;
		public Token sireum;
		public Token logika;
		public Token te;
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public ImporContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impor; }
	}

	public final ImporContext impor() throws RecognitionException {
		ImporContext _localctx = new ImporContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			((ImporContext)_localctx).tb = match(T__145);
			setState(495);
			((ImporContext)_localctx).org = match(ID);
			setState(496);
			match(T__5);
			setState(497);
			((ImporContext)_localctx).sireum = match(ID);
			setState(498);
			match(T__5);
			setState(499);
			((ImporContext)_localctx).logika = match(ID);
			setState(500);
			match(T__5);
			setState(501);
			((ImporContext)_localctx).te = match(T__146);
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

	public static class FactsContext extends ParserRuleContext {
		public Token ftb;
		public Token te;
		public List<FactOrFunContext> factOrFun() {
			return getRuleContexts(FactOrFunContext.class);
		}
		public FactOrFunContext factOrFun(int i) {
			return getRuleContext(FactOrFunContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_facts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__3);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(504);
				match(NL);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			((FactsContext)_localctx).ftb = match(T__143);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(511);
				match(NL);
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			factOrFun();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(519); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(518);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(521); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(524);
				_la = _input.LA(1);
				if (_la==T__147 || _la==ID) {
					{
					setState(523);
					factOrFun();
					}
				}

				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			((FactsContext)_localctx).te = match(T__4);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(532);
				match(NL);
				}
				}
				setState(537);
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

	public static class FactOrFunContext extends ParserRuleContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public FunContext fun() {
			return getRuleContext(FunContext.class,0);
		}
		public FactOrFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factOrFun; }
	}

	public final FactOrFunContext factOrFun() throws RecognitionException {
		FactOrFunContext _localctx = new FactOrFunContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factOrFun);
		try {
			setState(540);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				fact();
				}
				break;
			case T__147:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				fun();
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(ID);
			setState(543);
			match(T__5);
			setState(544);
			formula(0);
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

	public static class FunContext extends ParserRuleContext {
		public Token tb;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			((FunContext)_localctx).tb = match(T__147);
			setState(547);
			match(ID);
			setState(549);
			_la = _input.LA(1);
			if (_la==NL) {
				{
				setState(548);
				match(NL);
				}
			}

			setState(551);
			match(T__15);
			setState(552);
			param();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(553);
				match(T__0);
				setState(554);
				param();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
			match(T__16);
			setState(561);
			match(T__6);
			setState(562);
			type();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(ID);
			setState(565);
			match(T__6);
			setState(566);
			type();
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

	public static class StmtsContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__147 - 146)) | (1L << (T__148 - 146)) | (1L << (T__149 - 146)) | (1L << (T__150 - 146)) | (1L << (T__151 - 146)) | (1L << (T__153 - 146)) | (1L << (T__154 - 146)) | (1L << (T__156 - 146)) | (1L << (T__157 - 146)) | (1L << (T__158 - 146)) | (1L << (T__161 - 146)) | (1L << (T__162 - 146)) | (1L << (NUM - 146)) | (1L << (ID - 146)) | (1L << (FLOAT - 146)))) != 0)) {
				{
				setState(568);
				stmt();
				}
			}

			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(572); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(571);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(574); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(577);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__147 - 146)) | (1L << (T__148 - 146)) | (1L << (T__149 - 146)) | (1L << (T__150 - 146)) | (1L << (T__151 - 146)) | (1L << (T__153 - 146)) | (1L << (T__154 - 146)) | (1L << (T__156 - 146)) | (1L << (T__157 - 146)) | (1L << (T__158 - 146)) | (1L << (T__161 - 146)) | (1L << (T__162 - 146)) | (1L << (NUM - 146)) | (1L << (ID - 146)) | (1L << (FLOAT - 146)))) != 0)) {
					{
					setState(576);
					stmt();
					}
				}

				}
				}
				setState(583);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SeqAssignStmtContext extends StmtContext {
		public Token tb;
		public ExpContext index;
		public ExpContext r;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public SeqAssignStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ExpStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class AssignVarStmtContext extends StmtContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public AssignVarStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StmtContext {
		public StmtsContext ts;
		public StmtsContext fs;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public IfStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class PrintStmtContext extends StmtContext {
		public Token op;
		public List<StringOrExpContext> stringOrExp() {
			return getRuleContexts(StringOrExpContext.class);
		}
		public StringOrExpContext stringOrExp(int i) {
			return getRuleContext(StringOrExpContext.class,i);
		}
		public PrintStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class MethodDeclStmtContext extends StmtContext {
		public Token helper;
		public Token id;
		public Token rtb;
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public MethodContractContext methodContract() {
			return getRuleContext(MethodContractContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MethodDeclStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class ImportStmtContext extends StmtContext {
		public ImporContext impor() {
			return getRuleContext(ImporContext.class,0);
		}
		public ImportStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public LoopInvariantContext loopInvariant() {
			return getRuleContext(LoopInvariantContext.class,0);
		}
		public WhileStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class LogikaStmtContext extends StmtContext {
		public ProofContext proof() {
			return getRuleContext(ProofContext.class,0);
		}
		public SequentContext sequent() {
			return getRuleContext(SequentContext.class,0);
		}
		public InvariantsContext invariants() {
			return getRuleContext(InvariantsContext.class,0);
		}
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public LogikaStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class VarDeclStmtContext extends StmtContext {
		public Token modifier;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public VarDeclStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class AssertStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssertStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class AssumeStmtContext extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssumeStmtContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt);
		int _la;
		try {
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((VarDeclStmtContext)_localctx).modifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__148 || _la==T__149) ) {
					((VarDeclStmtContext)_localctx).modifier = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(585);
				match(ID);
				setState(586);
				match(T__6);
				setState(587);
				type();
				setState(588);
				match(T__69);
				setState(590);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(589);
					match(NL);
					}
				}

				setState(592);
				exp(0);
				}
				break;
			case 2:
				_localctx = new AssignVarStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(ID);
				setState(595);
				match(T__69);
				setState(597);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(596);
					match(NL);
					}
				}

				setState(599);
				exp(0);
				}
				break;
			case 3:
				_localctx = new AssumeStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(600);
				match(T__7);
				setState(601);
				match(T__15);
				setState(602);
				exp(0);
				setState(603);
				match(T__16);
				}
				break;
			case 4:
				_localctx = new AssertStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(T__150);
				setState(606);
				match(T__15);
				setState(607);
				exp(0);
				setState(608);
				match(T__16);
				}
				break;
			case 5:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(610);
				match(T__151);
				setState(611);
				match(T__15);
				setState(612);
				exp(0);
				setState(613);
				match(T__16);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(614);
					match(NL);
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(620);
				match(T__3);
				setState(621);
				((IfStmtContext)_localctx).ts = stmts();
				setState(622);
				match(T__4);
				setState(634);
				_la = _input.LA(1);
				if (_la==T__152) {
					{
					setState(623);
					match(T__152);
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(624);
						match(NL);
						}
						}
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(630);
					match(T__3);
					setState(631);
					((IfStmtContext)_localctx).fs = stmts();
					setState(632);
					match(T__4);
					}
				}

				}
				break;
			case 6:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(636);
				match(T__153);
				setState(637);
				match(T__15);
				setState(638);
				exp(0);
				setState(639);
				match(T__16);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(640);
					match(NL);
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(646);
				match(T__3);
				setState(657);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(650);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(647);
						match(NL);
						}
						}
						setState(652);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(653);
					match(T__154);
					setState(654);
					loopInvariant();
					setState(655);
					match(T__155);
					}
					break;
				}
				setState(659);
				stmts();
				setState(660);
				match(T__4);
				}
				break;
			case 7:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(662);
				((PrintStmtContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__156 || _la==T__157) ) {
					((PrintStmtContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(663);
				match(T__15);
				setState(672);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (T__161 - 162)) | (1L << (T__162 - 162)) | (1L << (NUM - 162)) | (1L << (ID - 162)) | (1L << (STRING - 162)) | (1L << (FLOAT - 162)))) != 0)) {
					{
					setState(664);
					stringOrExp();
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(665);
						match(T__0);
						setState(666);
						stringOrExp();
						}
						}
						setState(671);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(674);
				match(T__16);
				}
				break;
			case 8:
				_localctx = new SeqAssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(675);
				((SeqAssignStmtContext)_localctx).tb = match(ID);
				setState(676);
				match(T__15);
				setState(677);
				((SeqAssignStmtContext)_localctx).index = exp(0);
				setState(678);
				match(T__16);
				setState(679);
				match(T__69);
				setState(681);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(680);
					match(NL);
					}
				}

				setState(683);
				((SeqAssignStmtContext)_localctx).r = exp(0);
				}
				break;
			case 9:
				_localctx = new MethodDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(687);
				_la = _input.LA(1);
				if (_la==T__158) {
					{
					setState(685);
					match(T__158);
					setState(686);
					((MethodDeclStmtContext)_localctx).helper = match(ID);
					}
				}

				setState(689);
				match(T__147);
				setState(690);
				((MethodDeclStmtContext)_localctx).id = match(ID);
				setState(692);
				_la = _input.LA(1);
				if (_la==NL) {
					{
					setState(691);
					match(NL);
					}
				}

				setState(694);
				match(T__15);
				setState(703);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(695);
					param();
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(696);
						match(T__0);
						setState(697);
						param();
						}
						}
						setState(702);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(705);
				match(T__16);
				setState(706);
				match(T__6);
				setState(709);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__61:
					{
					setState(707);
					type();
					}
					break;
				case T__159:
					{
					setState(708);
					match(T__159);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(711);
				match(T__69);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(712);
					match(NL);
					}
					}
					setState(717);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(718);
				match(T__3);
				setState(735);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(722);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(719);
						match(NL);
						}
						}
						setState(724);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(725);
					match(T__154);
					setState(726);
					methodContract();
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(727);
						match(NL);
						}
						}
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(733);
					match(T__155);
					}
					break;
				}
				setState(737);
				stmts();
				setState(748);
				_la = _input.LA(1);
				if (_la==T__160) {
					{
					setState(738);
					((MethodDeclStmtContext)_localctx).rtb = match(T__160);
					setState(740);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (T__161 - 162)) | (1L << (T__162 - 162)) | (1L << (NUM - 162)) | (1L << (ID - 162)) | (1L << (FLOAT - 162)))) != 0)) {
						{
						setState(739);
						exp(0);
						}
					}

					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(742);
						match(NL);
						}
						}
						setState(747);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(750);
				match(T__4);
				}
				break;
			case 10:
				_localctx = new LogikaStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(752);
				match(T__154);
				setState(757);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(753);
					proof();
					}
					break;
				case 2:
					{
					setState(754);
					sequent();
					}
					break;
				case 3:
					{
					setState(755);
					invariants();
					}
					break;
				case 4:
					{
					setState(756);
					facts();
					}
					break;
				}
				setState(759);
				match(T__155);
				}
				break;
			case 11:
				_localctx = new ImportStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(761);
				impor();
				}
				break;
			case 12:
				_localctx = new ExpStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(762);
				exp(0);
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

	public static class StringOrExpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StringOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringOrExp; }
	}

	public final StringOrExpContext stringOrExp() throws RecognitionException {
		StringOrExpContext _localctx = new StringOrExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringOrExp);
		try {
			setState(767);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(765);
				match(STRING);
				}
				break;
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__66:
			case T__75:
			case T__76:
			case T__161:
			case T__162:
			case NUM:
			case ID:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				exp(0);
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

	public static class PrimExpContext extends ParserRuleContext {
		public PrimExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primExp; }
	 
		public PrimExpContext() { }
		public void copyFrom(PrimExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatLitExpContext extends PrimExpContext {
		public TerminalNode FLOAT() { return getToken(Antlr4LogikaParser.FLOAT, 0); }
		public FloatLitExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class TypeAccessExpContext extends PrimExpContext {
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public TypeAccessExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExpContext extends PrimExpContext {
		public Token t;
		public BooleanExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class VarExpContext extends PrimExpContext {
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public VarExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class IntExpContext extends PrimExpContext {
		public TerminalNode NUM() { return getToken(Antlr4LogikaParser.NUM, 0); }
		public IntExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class LitExpContext extends PrimExpContext {
		public Token t;
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public LitExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}
	public static class SeqExpContext extends PrimExpContext {
		public Token t;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public SeqExpContext(PrimExpContext ctx) { copyFrom(ctx); }
	}

	public final PrimExpContext primExp() throws RecognitionException {
		PrimExpContext _localctx = new PrimExpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primExp);
		int _la;
		try {
			setState(793);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new BooleanExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				((BooleanExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
					((BooleanExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				_localctx = new IntExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(NUM);
				}
				break;
			case 3:
				_localctx = new VarExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(771);
				match(ID);
				}
				break;
			case 4:
				_localctx = new TypeAccessExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(772);
				((TypeAccessExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
					((TypeAccessExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(773);
				match(T__5);
				setState(774);
				match(ID);
				}
				break;
			case 5:
				_localctx = new LitExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(775);
				((LitExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__18 || _la==T__19) ) {
					((LitExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(776);
				match(T__15);
				setState(777);
				match(STRING);
				setState(778);
				match(T__16);
				}
				break;
			case 6:
				_localctx = new FloatLitExpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(779);
				match(FLOAT);
				}
				break;
			case 7:
				_localctx = new SeqExpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(780);
				((SeqExpContext)_localctx).t = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
					((SeqExpContext)_localctx).t = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(781);
				match(T__15);
				setState(790);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (T__161 - 162)) | (1L << (T__162 - 162)) | (1L << (NUM - 162)) | (1L << (ID - 162)) | (1L << (FLOAT - 162)))) != 0)) {
					{
					setState(782);
					exp(0);
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(783);
						match(T__0);
						setState(784);
						exp(0);
						}
						}
						setState(789);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(792);
				match(T__16);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InvokeExpContext extends ExpContext {
		public Token tb;
		public Token t;
		public TerminalNode ID() { return getToken(Antlr4LogikaParser.ID, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public InvokeExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ParenExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class PExpContext extends ExpContext {
		public PrimExpContext primExp() {
			return getRuleContext(PrimExpContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public PExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class ReadIntExpContext extends ExpContext {
		public TerminalNode STRING() { return getToken(Antlr4LogikaParser.STRING, 0); }
		public ReadIntExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class RandomIntExpContext extends ExpContext {
		public RandomIntExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpContext extends ExpContext {
		public Token op;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnaryExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryExpContext extends ExpContext {
		public ExpContext l;
		public Token op;
		public ExpContext r;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NL() { return getToken(Antlr4LogikaParser.NL, 0); }
		public BinaryExpContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(796);
				((UnaryExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0)) ) {
					((UnaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(797);
				exp(10);
				}
				break;
			case 2:
				{
				_localctx = new InvokeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(798);
				((InvokeExpContext)_localctx).tb = match(ID);
				setState(799);
				((InvokeExpContext)_localctx).t = match(T__15);
				setState(808);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (T__161 - 162)) | (1L << (T__162 - 162)) | (1L << (NUM - 162)) | (1L << (ID - 162)) | (1L << (FLOAT - 162)))) != 0)) {
					{
					setState(800);
					exp(0);
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(801);
						match(T__0);
						setState(802);
						exp(0);
						}
						}
						setState(807);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(810);
				match(T__16);
				}
				break;
			case 3:
				{
				_localctx = new PExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(811);
				primExp();
				setState(816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(812);
						match(T__5);
						setState(813);
						match(ID);
						}
						} 
					}
					setState(818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 4:
				{
				_localctx = new RandomIntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(819);
				match(T__161);
				setState(820);
				match(T__15);
				setState(821);
				match(T__16);
				}
				break;
			case 5:
				{
				_localctx = new ReadIntExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(822);
				match(T__162);
				setState(823);
				match(T__15);
				setState(825);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(824);
					match(STRING);
					}
				}

				setState(827);
				match(T__16);
				}
				break;
			case 6:
				{
				_localctx = new ParenExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(828);
				match(T__15);
				setState(829);
				exp(0);
				setState(830);
				match(T__16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(890);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(888);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(834);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(835);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(837);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(836);
							match(NL);
							}
						}

						setState(839);
						((BinaryExpContext)_localctx).r = exp(10);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(840);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(841);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__66) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(843);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(842);
							match(NL);
							}
						}

						setState(845);
						((BinaryExpContext)_localctx).r = exp(9);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(846);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(847);
						((BinaryExpContext)_localctx).op = match(T__67);
						setState(849);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(848);
							match(NL);
							}
						}

						setState(851);
						((BinaryExpContext)_localctx).r = exp(7);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(852);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(853);
						((BinaryExpContext)_localctx).op = match(T__68);
						setState(855);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(854);
							match(NL);
							}
						}

						setState(857);
						((BinaryExpContext)_localctx).r = exp(7);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(858);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(859);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (T__78 - 79)) | (1L << (T__79 - 79)) | (1L << (T__81 - 79)) | (1L << (T__82 - 79)) | (1L << (T__84 - 79)) | (1L << (T__85 - 79)) | (1L << (T__86 - 79)))) != 0)) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(861);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(860);
							match(NL);
							}
						}

						setState(863);
						((BinaryExpContext)_localctx).r = exp(6);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(864);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(865);
						((BinaryExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__70 || _la==T__71) ) {
							((BinaryExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(867);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(866);
							match(NL);
							}
						}

						setState(869);
						((BinaryExpContext)_localctx).r = exp(5);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(870);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(871);
						((BinaryExpContext)_localctx).op = match(T__88);
						setState(873);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(872);
							match(NL);
							}
						}

						setState(875);
						((BinaryExpContext)_localctx).r = exp(4);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(876);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(877);
						((BinaryExpContext)_localctx).op = match(T__91);
						setState(879);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(878);
							match(NL);
							}
						}

						setState(881);
						((BinaryExpContext)_localctx).r = exp(3);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpContext(new ExpContext(_parentctx, _parentState));
						((BinaryExpContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(882);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(883);
						((BinaryExpContext)_localctx).op = match(T__93);
						setState(885);
						_la = _input.LA(1);
						if (_la==NL) {
							{
							setState(884);
							match(NL);
							}
						}

						setState(887);
						((BinaryExpContext)_localctx).r = exp(2);
						}
						break;
					}
					} 
				}
				setState(892);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
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

	public static class LoopInvariantContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public Token itb;
		public ModifiesContext modifies() {
			return getRuleContext(ModifiesContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public LoopInvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopInvariant; }
	}

	public final LoopInvariantContext loopInvariant() throws RecognitionException {
		LoopInvariantContext _localctx = new LoopInvariantContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loopInvariant);
		int _la;
		try {
			int _alt;
			setState(946);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				((LoopInvariantContext)_localctx).tb = match(T__3);
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(894);
					match(NL);
					}
					}
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(900);
				modifies();
				setState(901);
				((LoopInvariantContext)_localctx).te = match(T__4);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(902);
					match(NL);
					}
					}
					setState(907);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
				((LoopInvariantContext)_localctx).tb = match(T__3);
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(909);
					match(NL);
					}
					}
					setState(914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(915);
				((LoopInvariantContext)_localctx).itb = match(T__142);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(916);
					match(NL);
					}
					}
					setState(921);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(922);
				formula(0);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(924); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(923);
							match(NL);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(926); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(929);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
						{
						setState(928);
						formula(0);
						}
					}

					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(937);
				_la = _input.LA(1);
				if (_la==T__163) {
					{
					setState(936);
					modifies();
					}
				}

				setState(939);
				((LoopInvariantContext)_localctx).te = match(T__4);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(940);
					match(NL);
					}
					}
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ModifiesContext extends ParserRuleContext {
		public Token tb;
		public List<TerminalNode> ID() { return getTokens(Antlr4LogikaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Antlr4LogikaParser.ID, i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ModifiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifies; }
	}

	public final ModifiesContext modifies() throws RecognitionException {
		ModifiesContext _localctx = new ModifiesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_modifies);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			((ModifiesContext)_localctx).tb = match(T__163);
			setState(949);
			match(ID);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(950);
				match(T__0);
				setState(951);
				match(ID);
				}
				}
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(957);
					match(NL);
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
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

	public static class MethodContractContext extends ParserRuleContext {
		public Token tb;
		public FormulaContext formula;
		public List<FormulaContext> rs = new ArrayList<FormulaContext>();
		public List<FormulaContext> es = new ArrayList<FormulaContext>();
		public Token te;
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public ModifiesContext modifies() {
			return getRuleContext(ModifiesContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public MethodContractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodContract; }
	}

	public final MethodContractContext methodContract() throws RecognitionException {
		MethodContractContext _localctx = new MethodContractContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_methodContract);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			((MethodContractContext)_localctx).tb = match(T__3);
			setState(967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(964);
					match(NL);
					}
					} 
				}
				setState(969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(991);
			_la = _input.LA(1);
			if (_la==T__164 || _la==T__165) {
				{
				setState(970);
				_la = _input.LA(1);
				if ( !(_la==T__164 || _la==T__165) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(971);
					match(NL);
					}
					}
					setState(976);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(977);
				((MethodContractContext)_localctx).formula = formula(0);
				((MethodContractContext)_localctx).rs.add(((MethodContractContext)_localctx).formula);
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(979); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(978);
								match(NL);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(981); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(984);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
							{
							setState(983);
							((MethodContractContext)_localctx).formula = formula(0);
							((MethodContractContext)_localctx).rs.add(((MethodContractContext)_localctx).formula);
							}
						}

						}
						} 
					}
					setState(990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,136,_ctx);
				}
				}
			}

			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993);
					match(NL);
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(1000);
			_la = _input.LA(1);
			if (_la==T__163) {
				{
				setState(999);
				modifies();
				}
			}

			setState(1023);
			_la = _input.LA(1);
			if (_la==T__166 || _la==T__167) {
				{
				setState(1002);
				_la = _input.LA(1);
				if ( !(_la==T__166 || _la==T__167) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(1003);
					match(NL);
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
				((MethodContractContext)_localctx).formula = formula(0);
				((MethodContractContext)_localctx).es.add(((MethodContractContext)_localctx).formula);
				setState(1020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1011); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(1010);
								match(NL);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(1013); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(1016);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
							{
							setState(1015);
							((MethodContractContext)_localctx).formula = formula(0);
							((MethodContractContext)_localctx).es.add(((MethodContractContext)_localctx).formula);
							}
						}

						}
						} 
					}
					setState(1022);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
				}
				}
			}

			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1025);
				match(NL);
				}
				}
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1031);
			((MethodContractContext)_localctx).te = match(T__4);
			setState(1035);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1032);
					match(NL);
					}
					} 
				}
				setState(1037);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
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

	public static class InvariantsContext extends ParserRuleContext {
		public Token tb;
		public Token te;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Antlr4LogikaParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Antlr4LogikaParser.NL, i);
		}
		public InvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariants; }
	}

	public final InvariantsContext invariants() throws RecognitionException {
		InvariantsContext _localctx = new InvariantsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_invariants);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			((InvariantsContext)_localctx).tb = match(T__3);
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1039);
				match(NL);
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
			match(T__142);
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1046);
				match(NL);
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			formula(0);
			setState(1063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1054); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1053);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1056); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1059);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__73 - 67)) | (1L << (T__74 - 67)) | (1L << (T__75 - 67)) | (1L << (T__76 - 67)) | (1L << (T__77 - 67)) | (1L << (T__99 - 67)) | (1L << (T__100 - 67)) | (1L << (T__101 - 67)) | (1L << (T__102 - 67)) | (1L << (T__103 - 67)) | (1L << (T__104 - 67)) | (1L << (T__105 - 67)) | (1L << (T__106 - 67)))) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & ((1L << (NUM - 170)) | (1L << (ID - 170)) | (1L << (FLOAT - 170)))) != 0)) {
					{
					setState(1058);
					formula(0);
					}
				}

				}
				}
				setState(1065);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1066);
			((InvariantsContext)_localctx).te = match(T__4);
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(1067);
				match(NL);
				}
				}
				setState(1072);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		case 8:
			return justification_sempred((JustificationContext)_localctx, predIndex);
		case 20:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean justification_sempred(JustificationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return ("->".equals(_input.LT(1).getText()) ||
		      "→".equals(_input.LT(1).getText())) &&
		     "i".equals(_input.LT(2).getText());
		case 11:
			return ("->".equals(_input.LT(1).getText()) ||
		      "→".equals(_input.LT(1).getText())) &&
		      "e".equals(_input.LT(2).getText());
		case 12:
			return ("!".equals(_input.LT(1).getText()) ||
		      "~".equals(_input.LT(1).getText()) ||
		      "¬".equals(_input.LT(1).getText())) &&
		     "i".equals(_input.LT(2).getText());
		case 13:
			return ("!".equals(_input.LT(1).getText()) ||
		      "~".equals(_input.LT(1).getText()) ||
		      "¬".equals(_input.LT(1).getText())) &&
		     "e".equals(_input.LT(2).getText());
		case 14:
			return "∀".equals(_input.LT(1).getText()) &&
		     "i".equals(_input.LT(2).getText());
		case 15:
			return "∀".equals(_input.LT(1).getText()) &&
		     "e".equals(_input.LT(2).getText());
		case 16:
			return "∃".equals(_input.LT(1).getText()) &&
		     "i".equals(_input.LT(2).getText());
		case 17:
			return "∃".equals(_input.LT(1).getText()) &&
		     "e".equals(_input.LT(2).getText());
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 9);
		case 19:
			return precpred(_ctx, 8);
		case 20:
			return precpred(_ctx, 7);
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00b5\u0434\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\5\2=\n\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\3\3\3\3\7\3O\n\3\f\3"+
		"\16\3R\13\3\5\3T\n\3\3\3\3\3\3\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\7\3`"+
		"\n\3\f\3\16\3c\13\3\3\3\3\3\6\3g\n\3\r\3\16\3h\5\3k\n\3\3\4\3\4\5\4o\n"+
		"\4\3\4\6\4r\n\4\r\4\16\4s\3\4\5\4w\n\4\7\4y\n\4\f\4\16\4|\13\4\3\4\3\4"+
		"\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5"+
		"\u008d\n\5\f\5\16\5\u0090\13\5\3\5\3\5\7\5\u0094\n\5\f\5\16\5\u0097\13"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a6"+
		"\n\5\3\5\3\5\3\5\5\5\u00ab\n\5\3\5\6\5\u00ae\n\5\r\5\16\5\u00af\3\5\5"+
		"\5\u00b3\n\5\7\5\u00b5\n\5\f\5\16\5\u00b8\13\5\3\5\5\5\u00bb\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00c9\n\6\f\6\16\6\u00cc"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00de\n\6\f\6\16\6\u00e1\13\6\5\6\u00e3\n\6\3\6\5\6\u00e6\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f0\n\7\f\7\16\7\u00f3\13\7\3\7\5\7"+
		"\u00f6\n\7\3\7\3\7\3\7\5\7\u00fb\n\7\3\7\3\7\3\7\3\7\5\7\u0101\n\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0107\n\7\3\7\3\7\3\7\3\7\5\7\u010d\n\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0113\n\7\3\7\3\7\3\7\3\7\5\7\u0119\n\7\3\7\3\7\3\7\3\7\5\7\u011f"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u0125\n\7\3\7\3\7\3\7\3\7\5\7\u012b\n\7\3\7\3"+
		"\7\3\7\3\7\5\7\u0131\n\7\3\7\7\7\u0134\n\7\f\7\16\7\u0137\13\7\3\b\3\b"+
		"\3\b\3\b\7\b\u013d\n\b\f\b\16\b\u0140\13\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0148\n\b\3\b\3\b\5\b\u014c\n\b\3\b\3\b\3\b\5\b\u0151\n\b\3\b\5\b\u0154"+
		"\n\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u015e\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0165\n\n\3\n\3\n\3\n\3\n\5\n\u016b\n\n\3\n\3\n\3\n\3\n\5\n\u0171"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0195\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01a2\n"+
		"\n\f\n\16\n\u01a5\13\n\3\n\3\n\3\n\3\n\3\n\6\n\u01ac\n\n\r\n\16\n\u01ad"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u01b9\n\n\r\n\16\n\u01ba\3\n"+
		"\3\n\3\n\6\n\u01c0\n\n\r\n\16\n\u01c1\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\6\n\u01cc\n\n\r\n\16\n\u01cd\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u01da\n\n\f\n\16\n\u01dd\13\n\5\n\u01df\n\n\3\13\7\13\u01e2\n\13"+
		"\f\13\16\13\u01e5\13\13\3\13\3\13\6\13\u01e9\n\13\r\13\16\13\u01ea\3\13"+
		"\3\13\5\13\u01ef\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r"+
		"\u01fc\n\r\f\r\16\r\u01ff\13\r\3\r\3\r\7\r\u0203\n\r\f\r\16\r\u0206\13"+
		"\r\3\r\3\r\6\r\u020a\n\r\r\r\16\r\u020b\3\r\5\r\u020f\n\r\7\r\u0211\n"+
		"\r\f\r\16\r\u0214\13\r\3\r\3\r\7\r\u0218\n\r\f\r\16\r\u021b\13\r\3\16"+
		"\3\16\5\16\u021f\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0228\n"+
		"\20\3\20\3\20\3\20\3\20\7\20\u022e\n\20\f\20\16\20\u0231\13\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\5\22\u023c\n\22\3\22\6\22\u023f"+
		"\n\22\r\22\16\22\u0240\3\22\5\22\u0244\n\22\7\22\u0246\n\22\f\22\16\22"+
		"\u0249\13\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0251\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0258\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u026a\n\23\f\23\16\23\u026d"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\7\23\u0274\n\23\f\23\16\23\u0277\13\23"+
		"\3\23\3\23\3\23\3\23\5\23\u027d\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u0284"+
		"\n\23\f\23\16\23\u0287\13\23\3\23\3\23\7\23\u028b\n\23\f\23\16\23\u028e"+
		"\13\23\3\23\3\23\3\23\3\23\5\23\u0294\n\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\7\23\u029e\n\23\f\23\16\23\u02a1\13\23\5\23\u02a3\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02ac\n\23\3\23\3\23\3\23\3\23"+
		"\5\23\u02b2\n\23\3\23\3\23\3\23\5\23\u02b7\n\23\3\23\3\23\3\23\3\23\7"+
		"\23\u02bd\n\23\f\23\16\23\u02c0\13\23\5\23\u02c2\n\23\3\23\3\23\3\23\3"+
		"\23\5\23\u02c8\n\23\3\23\3\23\7\23\u02cc\n\23\f\23\16\23\u02cf\13\23\3"+
		"\23\3\23\7\23\u02d3\n\23\f\23\16\23\u02d6\13\23\3\23\3\23\3\23\7\23\u02db"+
		"\n\23\f\23\16\23\u02de\13\23\3\23\3\23\5\23\u02e2\n\23\3\23\3\23\3\23"+
		"\5\23\u02e7\n\23\3\23\7\23\u02ea\n\23\f\23\16\23\u02ed\13\23\5\23\u02ef"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u02f8\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u02fe\n\23\3\24\3\24\5\24\u0302\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0314"+
		"\n\25\f\25\16\25\u0317\13\25\5\25\u0319\n\25\3\25\5\25\u031c\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0326\n\26\f\26\16\26\u0329\13"+
		"\26\5\26\u032b\n\26\3\26\3\26\3\26\3\26\7\26\u0331\n\26\f\26\16\26\u0334"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u033c\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0343\n\26\3\26\3\26\3\26\5\26\u0348\n\26\3\26\3\26\3\26"+
		"\3\26\5\26\u034e\n\26\3\26\3\26\3\26\3\26\5\26\u0354\n\26\3\26\3\26\3"+
		"\26\3\26\5\26\u035a\n\26\3\26\3\26\3\26\3\26\5\26\u0360\n\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0366\n\26\3\26\3\26\3\26\3\26\5\26\u036c\n\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0372\n\26\3\26\3\26\3\26\3\26\5\26\u0378\n\26\3\26"+
		"\7\26\u037b\n\26\f\26\16\26\u037e\13\26\3\27\3\27\7\27\u0382\n\27\f\27"+
		"\16\27\u0385\13\27\3\27\3\27\3\27\7\27\u038a\n\27\f\27\16\27\u038d\13"+
		"\27\3\27\3\27\7\27\u0391\n\27\f\27\16\27\u0394\13\27\3\27\3\27\7\27\u0398"+
		"\n\27\f\27\16\27\u039b\13\27\3\27\3\27\6\27\u039f\n\27\r\27\16\27\u03a0"+
		"\3\27\5\27\u03a4\n\27\7\27\u03a6\n\27\f\27\16\27\u03a9\13\27\3\27\5\27"+
		"\u03ac\n\27\3\27\3\27\7\27\u03b0\n\27\f\27\16\27\u03b3\13\27\5\27\u03b5"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u03bb\n\30\f\30\16\30\u03be\13\30\3\30"+
		"\7\30\u03c1\n\30\f\30\16\30\u03c4\13\30\3\31\3\31\7\31\u03c8\n\31\f\31"+
		"\16\31\u03cb\13\31\3\31\3\31\7\31\u03cf\n\31\f\31\16\31\u03d2\13\31\3"+
		"\31\3\31\6\31\u03d6\n\31\r\31\16\31\u03d7\3\31\5\31\u03db\n\31\7\31\u03dd"+
		"\n\31\f\31\16\31\u03e0\13\31\5\31\u03e2\n\31\3\31\7\31\u03e5\n\31\f\31"+
		"\16\31\u03e8\13\31\3\31\5\31\u03eb\n\31\3\31\3\31\7\31\u03ef\n\31\f\31"+
		"\16\31\u03f2\13\31\3\31\3\31\6\31\u03f6\n\31\r\31\16\31\u03f7\3\31\5\31"+
		"\u03fb\n\31\7\31\u03fd\n\31\f\31\16\31\u0400\13\31\5\31\u0402\n\31\3\31"+
		"\7\31\u0405\n\31\f\31\16\31\u0408\13\31\3\31\3\31\7\31\u040c\n\31\f\31"+
		"\16\31\u040f\13\31\3\32\3\32\7\32\u0413\n\32\f\32\16\32\u0416\13\32\3"+
		"\32\3\32\7\32\u041a\n\32\f\32\16\32\u041d\13\32\3\32\3\32\6\32\u0421\n"+
		"\32\r\32\16\32\u0422\3\32\5\32\u0426\n\32\7\32\u0428\n\32\f\32\16\32\u042b"+
		"\13\32\3\32\3\32\7\32\u042f\n\32\f\32\16\32\u0432\13\32\3\32\2\4\f*\33"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\'\3\2\4\5\3\2"+
		"\13\21\3\2\25\26\3\2\25*\3\2+@\3\2LP\3\2AC\3\2DE\3\2HK\3\2QY\3\2Z]\3\2"+
		"_b\3\2ce\3\2fm\3\2\25@\3\2[]\3\2qr\3\2sv\4\2``bb\3\2wx\3\2de\3\2{|\3\2"+
		"}~\3\2NP\3\2\177\u0080\3\2\20\21\3\2\u0085\u0087\3\2\u0088\u008a\3\2\u008b"+
		"\u008d\3\2\u008e\u0090\3\2\u0097\u0098\3\2\u009f\u00a0\4\2EENO\5\2QRT"+
		"UWY\3\2IJ\3\2\u00a7\u00a8\3\2\u00a9\u00aa\u04fe\2I\3\2\2\2\4j\3\2\2\2"+
		"\6l\3\2\2\2\b\u00ba\3\2\2\2\n\u00e5\3\2\2\2\f\u00f5\3\2\2\2\16\u0138\3"+
		"\2\2\2\20\u0157\3\2\2\2\22\u01de\3\2\2\2\24\u01e3\3\2\2\2\26\u01f0\3\2"+
		"\2\2\30\u01f9\3\2\2\2\32\u021e\3\2\2\2\34\u0220\3\2\2\2\36\u0224\3\2\2"+
		"\2 \u0236\3\2\2\2\"\u023b\3\2\2\2$\u02fd\3\2\2\2&\u0301\3\2\2\2(\u031b"+
		"\3\2\2\2*\u0342\3\2\2\2,\u03b4\3\2\2\2.\u03b6\3\2\2\2\60\u03c5\3\2\2\2"+
		"\62\u0410\3\2\2\2\648\5\4\3\2\65\67\7\u00af\2\2\66\65\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;=\5\6\4\2<;\3\2\2\2<=\3"+
		"\2\2\2=A\3\2\2\2>@\7\u00af\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"BD\3\2\2\2CA\3\2\2\2DE\7\2\2\3EJ\3\2\2\2FG\5\24\13\2GH\7\2\2\3HJ\3\2\2"+
		"\2I\64\3\2\2\2IF\3\2\2\2J\3\3\2\2\2KP\5\f\7\2LM\7\3\2\2MO\5\f\7\2NL\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2RP\3\2\2\2SK\3\2\2\2ST\3"+
		"\2\2\2TU\3\2\2\2UV\t\2\2\2V[\5\f\7\2WX\7\3\2\2XZ\5\f\7\2YW\3\2\2\2Z]\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\k\3\2\2\2][\3\2\2\2^`\5\f\7\2_^\3\2\2\2`"+
		"c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2df\7\u00ab\2\2eg\5\f"+
		"\7\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jS\3\2\2\2ja\3\2"+
		"\2\2k\5\3\2\2\2ln\7\6\2\2mo\5\b\5\2nm\3\2\2\2no\3\2\2\2oz\3\2\2\2pr\7"+
		"\u00af\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\b\5\2"+
		"vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xq\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|z\3\2\2\2}\u0081\7\7\2\2~\u0080\7\u00af\2\2\177~\3\2\2\2\u0080"+
		"\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0085\7\u00ac\2\2\u0085\u0086\7\b\2\2\u0086\u0087"+
		"\5\f\7\2\u0087\u0088\5\22\n\2\u0088\u00bb\3\2\2\2\u0089\u008a\7\u00ac"+
		"\2\2\u008a\u008e\7\b\2\2\u008b\u008d\7\u00af\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7\6\2\2\u0092\u0094\7\u00af\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\u00ac\2\2\u0099"+
		"\u00aa\7\b\2\2\u009a\u009d\7\u00ad\2\2\u009b\u009c\7\t\2\2\u009c\u009e"+
		"\5\20\t\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00ab\3\2\2\2"+
		"\u009f\u00a0\5\f\7\2\u00a0\u00a1\7\n\2\2\u00a1\u00ab\3\2\2\2\u00a2\u00a5"+
		"\7\u00ad\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a6\5\20\t\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\f\7\2\u00a8"+
		"\u00a9\7\n\2\2\u00a9\u00ab\3\2\2\2\u00aa\u009a\3\2\2\2\u00aa\u009f\3\2"+
		"\2\2\u00aa\u00a2\3\2\2\2\u00ab\u00b6\3\2\2\2\u00ac\u00ae\7\u00af\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\5\b\5\2\u00b2\u00b1\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\7\7\2\2\u00ba\u0084\3\2\2\2\u00ba\u0089\3\2"+
		"\2\2\u00bb\t\3\2\2\2\u00bc\u00e6\t\3\2\2\u00bd\u00e6\7\u00ad\2\2\u00be"+
		"\u00bf\7\22\2\2\u00bf\u00c0\5\f\7\2\u00c0\u00c1\7\23\2\2\u00c1\u00e6\3"+
		"\2\2\2\u00c2\u00e6\7\24\2\2\u00c3\u00c4\7\u00ad\2\2\u00c4\u00c5\7\22\2"+
		"\2\u00c5\u00ca\5\f\7\2\u00c6\u00c7\7\3\2\2\u00c7\u00c9\5\f\7\2\u00c8\u00c6"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\23\2\2\u00ce\u00e6\3"+
		"\2\2\2\u00cf\u00e6\7\u00ac\2\2\u00d0\u00d1\t\4\2\2\u00d1\u00d2\7\22\2"+
		"\2\u00d2\u00d3\7\u00b3\2\2\u00d3\u00e6\7\23\2\2\u00d4\u00e6\7\u00b4\2"+
		"\2\u00d5\u00d6\t\5\2\2\u00d6\u00d7\7\b\2\2\u00d7\u00e6\7\u00ad\2\2\u00d8"+
		"\u00d9\t\6\2\2\u00d9\u00e2\7\22\2\2\u00da\u00df\5*\26\2\u00db\u00dc\7"+
		"\3\2\2\u00dc\u00de\5*\26\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e2\u00da\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\7\23\2\2\u00e5\u00bc\3\2\2\2\u00e5\u00bd\3\2\2\2\u00e5\u00be\3"+
		"\2\2\2\u00e5\u00c2\3\2\2\2\u00e5\u00c3\3\2\2\2\u00e5\u00cf\3\2\2\2\u00e5"+
		"\u00d0\3\2\2\2\u00e5\u00d4\3\2\2\2\u00e5\u00d5\3\2\2\2\u00e5\u00d8\3\2"+
		"\2\2\u00e6\13\3\2\2\2\u00e7\u00e8\b\7\1\2\u00e8\u00e9\7E\2\2\u00e9\u00f6"+
		"\5\f\7\n\u00ea\u00eb\t\7\2\2\u00eb\u00f6\5\f\7\t\u00ec\u00f1\5\n\6\2\u00ed"+
		"\u00ee\7\b\2\2\u00ee\u00f0\7\u00ad\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3"+
		"\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\5\16\b\2\u00f5\u00e7\3\2\2\2\u00f5\u00ea\3"+
		"\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u0135\3\2\2\2\u00f7"+
		"\u00f8\f\17\2\2\u00f8\u00fa\t\b\2\2\u00f9\u00fb\7\u00af\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0134\5\f\7\20"+
		"\u00fd\u00fe\f\16\2\2\u00fe\u0100\t\t\2\2\u00ff\u0101\7\u00af\2\2\u0100"+
		"\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0134\5\f"+
		"\7\17\u0103\u0104\f\r\2\2\u0104\u0106\7F\2\2\u0105\u0107\7\u00af\2\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0134\5\f"+
		"\7\r\u0109\u010a\f\f\2\2\u010a\u010c\7G\2\2\u010b\u010d\7\u00af\2\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0134\5\f"+
		"\7\r\u010f\u0110\f\13\2\2\u0110\u0112\t\n\2\2\u0111\u0113\7\u00af\2\2"+
		"\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0134"+
		"\5\f\7\f\u0115\u0116\f\b\2\2\u0116\u0118\t\13\2\2\u0117\u0119\7\u00af"+
		"\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0134\5\f\7\t\u011b\u011c\f\7\2\2\u011c\u011e\t\f\2\2\u011d\u011f\7\u00af"+
		"\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0134\5\f\7\b\u0121\u0122\f\6\2\2\u0122\u0124\7^\2\2\u0123\u0125\7\u00af"+
		"\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0134\5\f\7\7\u0127\u0128\f\5\2\2\u0128\u012a\t\r\2\2\u0129\u012b\7\u00af"+
		"\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u0134\5\f\7\6\u012d\u012e\f\4\2\2\u012e\u0130\t\16\2\2\u012f\u0131\7"+
		"\u00af\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2\2\2"+
		"\u0132\u0134\5\f\7\4\u0133\u00f7\3\2\2\2\u0133\u00fd\3\2\2\2\u0133\u0103"+
		"\3\2\2\2\u0133\u0109\3\2\2\2\u0133\u010f\3\2\2\2\u0133\u0115\3\2\2\2\u0133"+
		"\u011b\3\2\2\2\u0133\u0121\3\2\2\2\u0133\u0127\3\2\2\2\u0133\u012d\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\r\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\t\17\2\2\u0139\u013e\7\u00ad"+
		"\2\2\u013a\u013b\7\3\2\2\u013b\u013d\7\u00ad\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0150\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\t\2\2\u0142\u0151\5\20\t\2\u0143"+
		"\u0144\7\t\2\2\u0144\u0145\7\22\2\2\u0145\u0147\5*\26\2\u0146\u0148\7"+
		"Q\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\7n\2\2\u014a\u014c\7Q\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2"+
		"\2\u014c\u014d\3\2\2\2\u014d\u014e\5*\26\2\u014e\u014f\7\23\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0141\3\2\2\2\u0150\u0143\3\2\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7\u00af\2\2\u0153\u0152\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\5\f\7\2\u0156\17\3\2\2"+
		"\2\u0157\u0158\t\20\2\2\u0158\21\3\2\2\2\u0159\u01df\7o\2\2\u015a\u015e"+
		"\7p\2\2\u015b\u015c\t\21\2\2\u015c\u015e\7\u00ad\2\2\u015d\u015a\3\2\2"+
		"\2\u015d\u015b\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\u00ac\2\2\u0160"+
		"\u01df\7\u00ac\2\2\u0161\u0165\t\22\2\2\u0162\u0163\t\21\2\2\u0163\u0165"+
		"\7\u00ad\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\3\2\2"+
		"\2\u0166\u01df\7\u00ac\2\2\u0167\u016b\t\23\2\2\u0168\u0169\t\24\2\2\u0169"+
		"\u016b\7\u00ad\2\2\u016a\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u01df\7\u00ac\2\2\u016d\u0171\t\25\2\2\u016e\u016f\t\24"+
		"\2\2\u016f\u0171\7\u00ad\2\2\u0170\u016d\3\2\2\2\u0170\u016e\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\7\u00ac\2\2\u0173\u0174\7\u00ac\2\2\u0174\u01df"+
		"\7\u00ac\2\2\u0175\u0176\7y\2\2\u0176\u01df\7\u00ac\2\2\u0177\u0178\7"+
		"z\2\2\u0178\u0179\7\u00ac\2\2\u0179\u01df\7\u00ac\2\2\u017a\u017b\6\n"+
		"\f\2\u017b\u017c\t\26\2\2\u017c\u017d\7\u00ad\2\2\u017d\u01df\7\u00ac"+
		"\2\2\u017e\u017f\6\n\r\2\u017f\u0180\t\26\2\2\u0180\u0181\7\u00ad\2\2"+
		"\u0181\u0182\7\u00ac\2\2\u0182\u01df\7\u00ac\2\2\u0183\u0184\t\27\2\2"+
		"\u0184\u01df\7\u00ac\2\2\u0185\u0186\t\30\2\2\u0186\u0187\7\u00ac\2\2"+
		"\u0187\u01df\7\u00ac\2\2\u0188\u0189\6\n\16\2\u0189\u018a\t\31\2\2\u018a"+
		"\u018b\7\u00ad\2\2\u018b\u01df\7\u00ac\2\2\u018c\u018d\6\n\17\2\u018d"+
		"\u018e\t\31\2\2\u018e\u018f\7\u00ad\2\2\u018f\u0190\7\u00ac\2\2\u0190"+
		"\u01df\7\u00ac\2\2\u0191\u0195\t\32\2\2\u0192\u0193\t\33\2\2\u0193\u0195"+
		"\7\u00ad\2\2\u0194\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\3\2\2"+
		"\2\u0196\u01df\7\u00ac\2\2\u0197\u0198\7\u0081\2\2\u0198\u01df\7\u00ac"+
		"\2\2\u0199\u019a\7\u0082\2\2\u019a\u019b\7\u00ac\2\2\u019b\u01df\7\u00ac"+
		"\2\2\u019c\u019d\7\u0083\2\2\u019d\u019e\7\u00ac\2\2\u019e\u01df\7\u00ac"+
		"\2\2\u019f\u01a3\7\u0084\2\2\u01a0\u01a2\7\u00ac\2\2\u01a1\u01a0\3\2\2"+
		"\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01df"+
		"\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\t\34\2\2\u01a7\u01df\7\u00ac"+
		"\2\2\u01a8\u01a9\t\35\2\2\u01a9\u01ab\7\u00ac\2\2\u01aa\u01ac\5\f\7\2"+
		"\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae"+
		"\3\2\2\2\u01ae\u01df\3\2\2\2\u01af\u01b0\6\n\20\2\u01b0\u01b1\7i\2\2\u01b1"+
		"\u01b2\7\u00ad\2\2\u01b2\u01df\7\u00ac\2\2\u01b3\u01b4\6\n\21\2\u01b4"+
		"\u01b5\7i\2\2\u01b5\u01b6\7\u00ad\2\2\u01b6\u01b8\7\u00ac\2\2\u01b7\u01b9"+
		"\5\f\7\2\u01b8\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01df\3\2\2\2\u01bc\u01bd\t\36\2\2\u01bd\u01bf\7"+
		"\u00ac\2\2\u01be\u01c0\5\f\7\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2"+
		"\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01df\3\2\2\2\u01c3\u01c4"+
		"\t\37\2\2\u01c4\u01c5\7\u00ac\2\2\u01c5\u01df\7\u00ac\2\2\u01c6\u01c7"+
		"\6\n\22\2\u01c7\u01c8\7m\2\2\u01c8\u01c9\7\u00ad\2\2\u01c9\u01cb\7\u00ac"+
		"\2\2\u01ca\u01cc\5\f\7\2\u01cb\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01df\3\2\2\2\u01cf\u01d0\6\n"+
		"\23\2\u01d0\u01d1\7m\2\2\u01d1\u01d2\7\u00ad\2\2\u01d2\u01d3\7\u00ac\2"+
		"\2\u01d3\u01df\7\u00ac\2\2\u01d4\u01df\7\u0091\2\2\u01d5\u01d6\7\u0092"+
		"\2\2\u01d6\u01df\7\u00ad\2\2\u01d7\u01db\7\u0093\2\2\u01d8\u01da\7\u00ac"+
		"\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u0159\3\2"+
		"\2\2\u01de\u015d\3\2\2\2\u01de\u0164\3\2\2\2\u01de\u016a\3\2\2\2\u01de"+
		"\u0170\3\2\2\2\u01de\u0175\3\2\2\2\u01de\u0177\3\2\2\2\u01de\u017a\3\2"+
		"\2\2\u01de\u017e\3\2\2\2\u01de\u0183\3\2\2\2\u01de\u0185\3\2\2\2\u01de"+
		"\u0188\3\2\2\2\u01de\u018c\3\2\2\2\u01de\u0194\3\2\2\2\u01de\u0197\3\2"+
		"\2\2\u01de\u0199\3\2\2\2\u01de\u019c\3\2\2\2\u01de\u019f\3\2\2\2\u01de"+
		"\u01a6\3\2\2\2\u01de\u01a8\3\2\2\2\u01de\u01af\3\2\2\2\u01de\u01b3\3\2"+
		"\2\2\u01de\u01bc\3\2\2\2\u01de\u01c3\3\2\2\2\u01de\u01c6\3\2\2\2\u01de"+
		"\u01cf\3\2\2\2\u01de\u01d4\3\2\2\2\u01de\u01d5\3\2\2\2\u01de\u01d7\3\2"+
		"\2\2\u01df\23\3\2\2\2\u01e0\u01e2\7\u00af\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01ee\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01e8\5\26\f\2\u01e7\u01e9\7\u00af\2\2"+
		"\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\5\"\22\2\u01ed\u01ef\3\2\2\2"+
		"\u01ee\u01e6\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\25\3\2\2\2\u01f0\u01f1"+
		"\7\u0094\2\2\u01f1\u01f2\7\u00ad\2\2\u01f2\u01f3\7\b\2\2\u01f3\u01f4\7"+
		"\u00ad\2\2\u01f4\u01f5\7\b\2\2\u01f5\u01f6\7\u00ad\2\2\u01f6\u01f7\7\b"+
		"\2\2\u01f7\u01f8\7\u0095\2\2\u01f8\27\3\2\2\2\u01f9\u01fd\7\6\2\2\u01fa"+
		"\u01fc\7\u00af\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\u0204\7\u0092\2\2\u0201\u0203\7\u00af\2\2\u0202\u0201\3\2\2\2\u0203\u0206"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0207\u0212\5\32\16\2\u0208\u020a\7\u00af\2\2\u0209\u0208"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u020f\5\32\16\2\u020e\u020d\3\2\2\2\u020e\u020f\3"+
		"\2\2\2\u020f\u0211\3\2\2\2\u0210\u0209\3\2\2\2\u0211\u0214\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0215\u0219\7\7\2\2\u0216\u0218\7\u00af\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\31\3\2\2"+
		"\2\u021b\u0219\3\2\2\2\u021c\u021f\5\34\17\2\u021d\u021f\5\36\20\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021d\3\2\2\2\u021f\33\3\2\2\2\u0220\u0221\7\u00ad"+
		"\2\2\u0221\u0222\7\b\2\2\u0222\u0223\5\f\7\2\u0223\35\3\2\2\2\u0224\u0225"+
		"\7\u0096\2\2\u0225\u0227\7\u00ad\2\2\u0226\u0228\7\u00af\2\2\u0227\u0226"+
		"\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7\22\2\2"+
		"\u022a\u022f\5 \21\2\u022b\u022c\7\3\2\2\u022c\u022e\5 \21\2\u022d\u022b"+
		"\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0233\7\23\2\2\u0233\u0234\7"+
		"\t\2\2\u0234\u0235\5\20\t\2\u0235\37\3\2\2\2\u0236\u0237\7\u00ad\2\2\u0237"+
		"\u0238\7\t\2\2\u0238\u0239\5\20\t\2\u0239!\3\2\2\2\u023a\u023c\5$\23\2"+
		"\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0247\3\2\2\2\u023d\u023f"+
		"\7\u00af\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0244\5$\23\2\u0243\u0242"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u023e\3\2\2\2\u0246"+
		"\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248#\3\2\2\2"+
		"\u0249\u0247\3\2\2\2\u024a\u024b\t \2\2\u024b\u024c\7\u00ad\2\2\u024c"+
		"\u024d\7\t\2\2\u024d\u024e\5\20\t\2\u024e\u0250\7H\2\2\u024f\u0251\7\u00af"+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\5*\26\2\u0253\u02fe\3\2\2\2\u0254\u0255\7\u00ad\2\2\u0255\u0257"+
		"\7H\2\2\u0256\u0258\7\u00af\2\2\u0257\u0256\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u0259\3\2\2\2\u0259\u02fe\5*\26\2\u025a\u025b\7\n\2\2\u025b\u025c"+
		"\7\22\2\2\u025c\u025d\5*\26\2\u025d\u025e\7\23\2\2\u025e\u02fe\3\2\2\2"+
		"\u025f\u0260\7\u0099\2\2\u0260\u0261\7\22\2\2\u0261\u0262\5*\26\2\u0262"+
		"\u0263\7\23\2\2\u0263\u02fe\3\2\2\2\u0264\u0265\7\u009a\2\2\u0265\u0266"+
		"\7\22\2\2\u0266\u0267\5*\26\2\u0267\u026b\7\23\2\2\u0268\u026a\7\u00af"+
		"\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u026f\7\6"+
		"\2\2\u026f\u0270\5\"\22\2\u0270\u027c\7\7\2\2\u0271\u0275\7\u009b\2\2"+
		"\u0272\u0274\7\u00af\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0278\u0279\7\6\2\2\u0279\u027a\5\"\22\2\u027a\u027b\7\7\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u0271\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u02fe\3\2"+
		"\2\2\u027e\u027f\7\u009c\2\2\u027f\u0280\7\22\2\2\u0280\u0281\5*\26\2"+
		"\u0281\u0285\7\23\2\2\u0282\u0284\7\u00af\2\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u0293\7\6\2\2\u0289\u028b\7\u00af\2\2\u028a"+
		"\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0290\7\u009d\2\2\u0290"+
		"\u0291\5,\27\2\u0291\u0292\7\u009e\2\2\u0292\u0294\3\2\2\2\u0293\u028c"+
		"\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\5\"\22\2"+
		"\u0296\u0297\7\7\2\2\u0297\u02fe\3\2\2\2\u0298\u0299\t!\2\2\u0299\u02a2"+
		"\7\22\2\2\u029a\u029f\5&\24\2\u029b\u029c\7\3\2\2\u029c\u029e\5&\24\2"+
		"\u029d\u029b\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0"+
		"\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u029a\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02fe\7\23\2\2\u02a5\u02a6\7"+
		"\u00ad\2\2\u02a6\u02a7\7\22\2\2\u02a7\u02a8\5*\26\2\u02a8\u02a9\7\23\2"+
		"\2\u02a9\u02ab\7H\2\2\u02aa\u02ac\7\u00af\2\2\u02ab\u02aa\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\5*\26\2\u02ae\u02fe\3\2"+
		"\2\2\u02af\u02b0\7\u00a1\2\2\u02b0\u02b2\7\u00ad\2\2\u02b1\u02af\3\2\2"+
		"\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\7\u0096\2\2\u02b4"+
		"\u02b6\7\u00ad\2\2\u02b5\u02b7\7\u00af\2\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7"+
		"\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02c1\7\22\2\2\u02b9\u02be\5 \21\2"+
		"\u02ba\u02bb\7\3\2\2\u02bb\u02bd\5 \21\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02b9\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c4\7\23\2\2\u02c4\u02c7\7\t\2\2\u02c5\u02c8\5\20\t\2\u02c6"+
		"\u02c8\7\u00a2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02cd\7H\2\2\u02ca\u02cc\7\u00af\2\2\u02cb\u02ca\3\2\2"+
		"\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02e1\7\6\2\2\u02d1\u02d3\7\u00af\2"+
		"\2\u02d2\u02d1\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\u009d\2"+
		"\2\u02d8\u02dc\5\60\31\2\u02d9\u02db\7\u00af\2\2\u02da\u02d9\3\2\2\2\u02db"+
		"\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7\u009e\2\2\u02e0\u02e2\3\2\2\2\u02e1"+
		"\u02d4\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02ee\5\""+
		"\22\2\u02e4\u02e6\7\u00a3\2\2\u02e5\u02e7\5*\26\2\u02e6\u02e5\3\2\2\2"+
		"\u02e6\u02e7\3\2\2\2\u02e7\u02eb\3\2\2\2\u02e8\u02ea\7\u00af\2\2\u02e9"+
		"\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec\u02ef\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02e4\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\7\7\2\2\u02f1\u02fe\3\2"+
		"\2\2\u02f2\u02f7\7\u009d\2\2\u02f3\u02f8\5\6\4\2\u02f4\u02f8\5\4\3\2\u02f5"+
		"\u02f8\5\62\32\2\u02f6\u02f8\5\30\r\2\u02f7\u02f3\3\2\2\2\u02f7\u02f4"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9"+
		"\u02fa\7\u009e\2\2\u02fa\u02fe\3\2\2\2\u02fb\u02fe\5\26\f\2\u02fc\u02fe"+
		"\5*\26\2\u02fd\u024a\3\2\2\2\u02fd\u0254\3\2\2\2\u02fd\u025a\3\2\2\2\u02fd"+
		"\u025f\3\2\2\2\u02fd\u0264\3\2\2\2\u02fd\u027e\3\2\2\2\u02fd\u0298\3\2"+
		"\2\2\u02fd\u02a5\3\2\2\2\u02fd\u02b1\3\2\2\2\u02fd\u02f2\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fe%\3\2\2\2\u02ff\u0302\7\u00b3"+
		"\2\2\u0300\u0302\5*\26\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302"+
		"\'\3\2\2\2\u0303\u031c\t\3\2\2\u0304\u031c\7\u00ac\2\2\u0305\u031c\7\u00ad"+
		"\2\2\u0306\u0307\t\5\2\2\u0307\u0308\7\b\2\2\u0308\u031c\7\u00ad\2\2\u0309"+
		"\u030a\t\4\2\2\u030a\u030b\7\22\2\2\u030b\u030c\7\u00b3\2\2\u030c\u031c"+
		"\7\23\2\2\u030d\u031c\7\u00b4\2\2\u030e\u030f\t\6\2\2\u030f\u0318\7\22"+
		"\2\2\u0310\u0315\5*\26\2\u0311\u0312\7\3\2\2\u0312\u0314\5*\26\2\u0313"+
		"\u0311\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0310\3\2\2\2\u0318"+
		"\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031c\7\23\2\2\u031b\u0303\3"+
		"\2\2\2\u031b\u0304\3\2\2\2\u031b\u0305\3\2\2\2\u031b\u0306\3\2\2\2\u031b"+
		"\u0309\3\2\2\2\u031b\u030d\3\2\2\2\u031b\u030e\3\2\2\2\u031c)\3\2\2\2"+
		"\u031d\u031e\b\26\1\2\u031e\u031f\t\"\2\2\u031f\u0343\5*\26\f\u0320\u0321"+
		"\7\u00ad\2\2\u0321\u032a\7\22\2\2\u0322\u0327\5*\26\2\u0323\u0324\7\3"+
		"\2\2\u0324\u0326\5*\26\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u032a\u0322\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0343\7\23\2\2\u032d\u0332\5(\25\2\u032e\u032f\7\b\2\2\u032f\u0331\7"+
		"\u00ad\2\2\u0330\u032e\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2"+
		"\u0332\u0333\3\2\2\2\u0333\u0343\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0336"+
		"\7\u00a4\2\2\u0336\u0337\7\22\2\2\u0337\u0343\7\23\2\2\u0338\u0339\7\u00a5"+
		"\2\2\u0339\u033b\7\22\2\2\u033a\u033c\7\u00b3\2\2\u033b\u033a\3\2\2\2"+
		"\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u0343\7\23\2\2\u033e\u033f"+
		"\7\22\2\2\u033f\u0340\5*\26\2\u0340\u0341\7\23\2\2\u0341\u0343\3\2\2\2"+
		"\u0342\u031d\3\2\2\2\u0342\u0320\3\2\2\2\u0342\u032d\3\2\2\2\u0342\u0335"+
		"\3\2\2\2\u0342\u0338\3\2\2\2\u0342\u033e\3\2\2\2\u0343\u037c\3\2\2\2\u0344"+
		"\u0345\f\13\2\2\u0345\u0347\t\b\2\2\u0346\u0348\7\u00af\2\2\u0347\u0346"+
		"\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u037b\5*\26\f\u034a"+
		"\u034b\f\n\2\2\u034b\u034d\t\t\2\2\u034c\u034e\7\u00af\2\2\u034d\u034c"+
		"\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u037b\5*\26\13"+
		"\u0350\u0351\f\t\2\2\u0351\u0353\7F\2\2\u0352\u0354\7\u00af\2\2\u0353"+
		"\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u037b\5*"+
		"\26\t\u0356\u0357\f\b\2\2\u0357\u0359\7G\2\2\u0358\u035a\7\u00af\2\2\u0359"+
		"\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u037b\5*"+
		"\26\t\u035c\u035d\f\7\2\2\u035d\u035f\t#\2\2\u035e\u0360\7\u00af\2\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u037b\5*"+
		"\26\b\u0362\u0363\f\6\2\2\u0363\u0365\t$\2\2\u0364\u0366\7\u00af\2\2\u0365"+
		"\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u037b\5*"+
		"\26\7\u0368\u0369\f\5\2\2\u0369\u036b\7[\2\2\u036a\u036c\7\u00af\2\2\u036b"+
		"\u036a\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u037b\5*"+
		"\26\6\u036e\u036f\f\4\2\2\u036f\u0371\7^\2\2\u0370\u0372\7\u00af\2\2\u0371"+
		"\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u037b\5*"+
		"\26\5\u0374\u0375\f\3\2\2\u0375\u0377\7`\2\2\u0376\u0378\7\u00af\2\2\u0377"+
		"\u0376\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\5*"+
		"\26\4\u037a\u0344\3\2\2\2\u037a\u034a\3\2\2\2\u037a\u0350\3\2\2\2\u037a"+
		"\u0356\3\2\2\2\u037a\u035c\3\2\2\2\u037a\u0362\3\2\2\2\u037a\u0368\3\2"+
		"\2\2\u037a\u036e\3\2\2\2\u037a\u0374\3\2\2\2\u037b\u037e\3\2\2\2\u037c"+
		"\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d+\3\2\2\2\u037e\u037c\3\2\2\2"+
		"\u037f\u0383\7\6\2\2\u0380\u0382\7\u00af\2\2\u0381\u0380\3\2\2\2\u0382"+
		"\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0386\3\2"+
		"\2\2\u0385\u0383\3\2\2\2\u0386\u0387\5.\30\2\u0387\u038b\7\7\2\2\u0388"+
		"\u038a\7\u00af\2\2\u0389\u0388\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u03b5\3\2\2\2\u038d\u038b\3\2\2\2\u038e"+
		"\u0392\7\6\2\2\u038f\u0391\7\u00af\2\2\u0390\u038f\3\2\2\2\u0391\u0394"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0399\7\u0091\2\2\u0396\u0398\7\u00af\2\2\u0397\u0396"+
		"\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u039c\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u03a7\5\f\7\2\u039d\u039f\7\u00af"+
		"\2\2\u039e\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u03a3\3\2\2\2\u03a2\u03a4\5\f\7\2\u03a3\u03a2\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5\u039e\3\2\2\2\u03a6"+
		"\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03ab\3\2"+
		"\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ac\5.\30\2\u03ab\u03aa\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03b1\7\7\2\2\u03ae\u03b0\7\u00af"+
		"\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4\u037f\3\2"+
		"\2\2\u03b4\u038e\3\2\2\2\u03b5-\3\2\2\2\u03b6\u03b7\7\u00a6\2\2\u03b7"+
		"\u03bc\7\u00ad\2\2\u03b8\u03b9\7\3\2\2\u03b9\u03bb\7\u00ad\2\2\u03ba\u03b8"+
		"\3\2\2\2\u03bb\u03be\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd"+
		"\u03c2\3\2\2\2\u03be\u03bc\3\2\2\2\u03bf\u03c1\7\u00af\2\2\u03c0\u03bf"+
		"\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3"+
		"/\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5\u03c9\7\6\2\2\u03c6\u03c8\7\u00af"+
		"\2\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03e1\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03d0\t%"+
		"\2\2\u03cd\u03cf\7\u00af\2\2\u03ce\u03cd\3\2\2\2\u03cf\u03d2\3\2\2\2\u03d0"+
		"\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03d0\3\2"+
		"\2\2\u03d3\u03de\5\f\7\2\u03d4\u03d6\7\u00af\2\2\u03d5\u03d4\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2"+
		"\2\2\u03d9\u03db\5\f\7\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03d5\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2"+
		"\2\2\u03de\u03df\3\2\2\2\u03df\u03e2\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1"+
		"\u03cc\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e6\3\2\2\2\u03e3\u03e5\7\u00af"+
		"\2\2\u03e4\u03e3\3\2\2\2\u03e5\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03eb\5."+
		"\30\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u0401\3\2\2\2\u03ec"+
		"\u03f0\t&\2\2\u03ed\u03ef\7\u00af\2\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2"+
		"\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2"+
		"\u03f0\3\2\2\2\u03f3\u03fe\5\f\7\2\u03f4\u03f6\7\u00af\2\2\u03f5\u03f4"+
		"\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03fb\5\f\7\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2"+
		"\2\2\u03fb\u03fd\3\2\2\2\u03fc\u03f5\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2"+
		"\2\2\u0401\u03ec\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0406\3\2\2\2\u0403"+
		"\u0405\7\u00af\2\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406\u0404"+
		"\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0409\3\2\2\2\u0408\u0406\3\2\2\2\u0409"+
		"\u040d\7\7\2\2\u040a\u040c\7\u00af\2\2\u040b\u040a\3\2\2\2\u040c\u040f"+
		"\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e\61\3\2\2\2\u040f"+
		"\u040d\3\2\2\2\u0410\u0414\7\6\2\2\u0411\u0413\7\u00af\2\2\u0412\u0411"+
		"\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415"+
		"\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u041b\7\u0091\2\2\u0418\u041a"+
		"\7\u00af\2\2\u0419\u0418\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2"+
		"\2\u041b\u041c\3\2\2\2\u041c\u041e\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u0429"+
		"\5\f\7\2\u041f\u0421\7\u00af\2\2\u0420\u041f\3\2\2\2\u0421\u0422\3\2\2"+
		"\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\3\2\2\2\u0424\u0426"+
		"\5\f\7\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427"+
		"\u0420\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2"+
		"\2\2\u042a\u042c\3\2\2\2\u042b\u0429\3\2\2\2\u042c\u0430\7\7\2\2\u042d"+
		"\u042f\7\u00af\2\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e"+
		"\3\2\2\2\u0430\u0431\3\2\2\2\u0431\63\3\2\2\2\u0432\u0430\3\2\2\2\u009b"+
		"8<AIPS[ahjnsvz\u0081\u008e\u0095\u009d\u00a5\u00aa\u00af\u00b2\u00b6\u00ba"+
		"\u00ca\u00df\u00e2\u00e5\u00f1\u00f5\u00fa\u0100\u0106\u010c\u0112\u0118"+
		"\u011e\u0124\u012a\u0130\u0133\u0135\u013e\u0147\u014b\u0150\u0153\u015d"+
		"\u0164\u016a\u0170\u0194\u01a3\u01ad\u01ba\u01c1\u01cd\u01db\u01de\u01e3"+
		"\u01ea\u01ee\u01fd\u0204\u020b\u020e\u0212\u0219\u021e\u0227\u022f\u023b"+
		"\u0240\u0243\u0247\u0250\u0257\u026b\u0275\u027c\u0285\u028c\u0293\u029f"+
		"\u02a2\u02ab\u02b1\u02b6\u02be\u02c1\u02c7\u02cd\u02d4\u02dc\u02e1\u02e6"+
		"\u02eb\u02ee\u02f7\u02fd\u0301\u0315\u0318\u031b\u0327\u032a\u0332\u033b"+
		"\u0342\u0347\u034d\u0353\u0359\u035f\u0365\u036b\u0371\u0377\u037a\u037c"+
		"\u0383\u038b\u0392\u0399\u03a0\u03a3\u03a7\u03ab\u03b1\u03b4\u03bc\u03c2"+
		"\u03c9\u03d0\u03d7\u03da\u03de\u03e1\u03e6\u03ea\u03f0\u03f7\u03fa\u03fe"+
		"\u0401\u0406\u040d\u0414\u041b\u0422\u0425\u0429\u0430";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}