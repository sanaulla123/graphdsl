// Generated from Graph.g4 by ANTLR 4.0
package graph.dsl;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class GraphBaseListener implements GraphListener {
	@Override public void enterWeight(GraphParser.WeightContext ctx) { }
	@Override public void exitWeight(GraphParser.WeightContext ctx) { }

	@Override public void enterEdge(GraphParser.EdgeContext ctx) { }
	@Override public void exitEdge(GraphParser.EdgeContext ctx) { }

	@Override public void enterGraph(GraphParser.GraphContext ctx) { }
	@Override public void exitGraph(GraphParser.GraphContext ctx) { }

	@Override public void enterVertex(GraphParser.VertexContext ctx) { }
	@Override public void exitVertex(GraphParser.VertexContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}