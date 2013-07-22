// Generated from Graph.g4 by ANTLR 4.0
package graph.dsl;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GraphListener extends ParseTreeListener {
	void enterWeight(GraphParser.WeightContext ctx);
	void exitWeight(GraphParser.WeightContext ctx);

	void enterEdge(GraphParser.EdgeContext ctx);
	void exitEdge(GraphParser.EdgeContext ctx);

	void enterGraph(GraphParser.GraphContext ctx);
	void exitGraph(GraphParser.GraphContext ctx);

	void enterVertex(GraphParser.VertexContext ctx);
	void exitVertex(GraphParser.VertexContext ctx);
}