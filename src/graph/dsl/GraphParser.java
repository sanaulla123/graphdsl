// Generated from Graph.g4 by ANTLR 4.0
package graph.dsl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAPH_START=1, GRAPH_END=2, WEIGHT_START=3, WEIGHT_END=4, TO=5, ID=6, 
		NUM=7, WS=8;
	public static final String[] tokenNames = {
		"<INVALID>", "GRAPH_START", "'}'", "'('", "')'", "'->'", "ID", "NUM", 
		"WS"
	};
	public static final int
		RULE_graph = 0, RULE_edge = 1, RULE_vertex = 2, RULE_weight = 3;
	public static final String[] ruleNames = {
		"graph", "edge", "vertex", "weight"
	};

	@Override
	public String getGrammarFileName() { return "Graph.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GraphContext extends ParserRuleContext {
		public TerminalNode GRAPH_END() { return getToken(GraphParser.GRAPH_END, 0); }
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public TerminalNode GRAPH_START() { return getToken(GraphParser.GRAPH_START, 0); }
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(GRAPH_START);
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(11);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(9); edge();
					}
					break;

				case 2:
					{
					setState(10); vertex();
					}
					break;
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(15); match(GRAPH_END);
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

	public static class EdgeContext extends ParserRuleContext {
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public TerminalNode TO() { return getToken(GraphParser.TO, 0); }
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitEdge(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(17); vertex();
			}
			setState(18); match(TO);
			{
			setState(19); vertex();
			}
			setState(20); weight();
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

	public static class VertexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GraphParser.ID, 0); }
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitVertex(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vertex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(ID);
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

	public static class WeightContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GraphParser.NUM, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GraphListener ) ((GraphListener)listener).exitWeight(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(WEIGHT_START);
			setState(25); match(NUM);
			setState(26); match(WEIGHT_END);
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
		"\2\3\n\37\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16"+
		"\2\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\2\6\2\4"+
		"\6\b\2\2\34\2\n\3\2\2\2\4\23\3\2\2\2\6\30\3\2\2\2\b\32\3\2\2\2\n\r\7\3"+
		"\2\2\13\16\5\4\3\2\f\16\5\6\4\2\r\13\3\2\2\2\r\f\3\2\2\2\16\17\3\2\2\2"+
		"\17\r\3\2\2\2\17\20\3\2\2\2\20\21\3\2\2\2\21\22\7\4\2\2\22\3\3\2\2\2\23"+
		"\24\5\6\4\2\24\25\7\7\2\2\25\26\5\6\4\2\26\27\5\b\5\2\27\5\3\2\2\2\30"+
		"\31\7\b\2\2\31\7\3\2\2\2\32\33\7\5\2\2\33\34\7\t\2\2\34\35\7\6\2\2\35"+
		"\t\3\2\2\2\4\r\17";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}