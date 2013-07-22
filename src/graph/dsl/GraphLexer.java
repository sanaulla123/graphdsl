// Generated from Graph.g4 by ANTLR 4.0
package graph.dsl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GraphLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAPH_START=1, GRAPH_END=2, WEIGHT_START=3, WEIGHT_END=4, TO=5, ID=6, 
		NUM=7, WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"GRAPH_START", "'}'", "'('", "')'", "'->'", "ID", "NUM", "WS"
	};
	public static final String[] ruleNames = {
		"GRAPH_START", "GRAPH_END", "WEIGHT_START", "WEIGHT_END", "TO", "ID", 
		"NUM", "WS"
	};


	public GraphLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Graph.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 7: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\nF\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\7\7-\n\7\f\7\16\7\60\13\7"+
		"\3\b\7\b\63\n\b\f\b\16\b\66\13\b\3\b\5\b9\n\b\3\b\6\b<\n\b\r\b\16\b=\3"+
		"\t\6\tA\n\t\r\t\16\tB\3\t\3\t\2\n\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1"+
		"\17\t\1\21\n\2\3\2\t\3\"\"\4C\\c|\5\62;C\\c|\3\62;\3\60\60\3\62;\5\13"+
		"\f\17\17\"\"K\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5!\3\2\2\2\7#"+
		"\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r*\3\2\2\2\17\64\3\2\2\2\21@\3\2\2\2"+
		"\23\24\7I\2\2\24\25\7t\2\2\25\26\7c\2\2\26\27\7r\2\2\27\30\7j\2\2\30\34"+
		"\3\2\2\2\31\33\t\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7}\2\2 \4\3\2\2\2!\"\7\177\2"+
		"\2\"\6\3\2\2\2#$\7*\2\2$\b\3\2\2\2%&\7+\2\2&\n\3\2\2\2\'(\7/\2\2()\7@"+
		"\2\2)\f\3\2\2\2*.\t\3\2\2+-\t\4\2\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./"+
		"\3\2\2\2/\16\3\2\2\2\60.\3\2\2\2\61\63\t\5\2\2\62\61\3\2\2\2\63\66\3\2"+
		"\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\679\t\6\2\2"+
		"8\67\3\2\2\289\3\2\2\29;\3\2\2\2:<\t\7\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>\20\3\2\2\2?A\t\b\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2"+
		"\2\2CD\3\2\2\2DE\b\t\2\2E\22\3\2\2\2\t\2\34.\648=B";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}