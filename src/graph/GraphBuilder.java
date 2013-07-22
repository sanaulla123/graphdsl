package graph;

import graph.dsl.GraphBaseListener;
import graph.dsl.GraphLexer;
import graph.dsl.GraphParser;
import java.io.IOException;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 * GraphBuilder builds the graph object and populates the data from 
 * that present in the DSL script.
 * @author msanaull
 */
public class GraphBuilder {
  
  /**
   * Populates the Graph object with the data in the script.
   * @param scriptName name of the DSL script. The script has to be present in the 
   * resource package.
   * @return the graph object populated with the data in DSL
   * @throws IOException 
   */
  public Graph buildGraph(String scriptName) throws IOException{
    
    //Reading the DSL script
    InputStream is = 
            ClassLoader.getSystemResourceAsStream("resources/"+scriptName);
    
    //Loading the DSL script into the ANTLR stream.
    CharStream cs = new ANTLRInputStream(is);
    
    //Passing the input to the lexer to create tokens
    GraphLexer lexer = new GraphLexer(cs);
    
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    
    //Passing the tokens to the parser to create the parse trea. 
    GraphParser parser = new GraphParser(tokens);
   
    //Semantic model to be populated
    Graph g = new Graph();
    //Adding the listener to facilitate walking through parse tree. 
    parser.addParseListener(new MyGraphBaseListener(g));
    
    //invoking the parser. 
    parser.graph();
    
    return g;
  }
}
/**
 * Listener used for walking through the parse tree.
 */
class MyGraphBaseListener extends GraphBaseListener {

  private Graph g;

  public MyGraphBaseListener(Graph g) {
    this.g = g;
  }
  
  @Override
  public void exitEdge(GraphParser.EdgeContext ctx) {
    //Once the edge rule is exited the data required for the edge i.e 
    //vertices and the weight would be available in the EdgeContext
    //and the same can be used to create an instance of Edge class.
    String fromVertex = ctx.vertex(0).ID().getText();
    String toVertex = ctx.vertex(1).ID().getText();
    double weight = Double.parseDouble(ctx.weight().NUM().getText());
    Edge e = new Edge(fromVertex, toVertex, weight);
    g.addEdge(e);
  }
  
  
  @Override 
  public void exitVertex(GraphParser.VertexContext ctx) { 
    Vertex vertex = new Vertex(ctx.ID().getText());
    g.addVertice(vertex);
  }
  
  
}
