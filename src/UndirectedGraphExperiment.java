import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * A quick experiment with undirected graphs.
 */
public class UndirectedGraphExperiment {

  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    Graph g = new UndirectedGraph();

    // Add a few edges
    g.addEdge("a", "b", 1);
    g.addEdge("a", "c", 3);
    g.addEdge("a", "d", 3);
    g.addEdge("b", "c", 2);
    g.addEdge("b", "e", 4);
    g.addEdge("c", "d", 2);
    g.addEdge("d", "e", 1);
    g.addEdge("e", "f", 5);
    g.dumpWithNames(pen);
    
    // // Change an edge, in the backwards direction
    // pen.println("Changing edge b-a");
    // g.addEdge("b", "a", 4);
    // g.dumpWithNames(pen);

    // // Remove a vertex
    // pen.println("Removing b");
    // g.removeVertex("b");
    // g.dumpWithNames(pen);
    
    // // Add another vertex
    // pen.println("Adding an edge from a to d");
    // g.addEdge("a", "d", 5);
    // g.dumpWithNames(pen);
    
    // // Remove an edge
    // pen.println("Removing the edge from c to a");
    // g.removeEdge("c", "a");
    // g.dumpWithNames(pen);

    ArrayList<Edge> mst = g.primsAlgorithm();
    for(Edge e : mst){
      pen.println(e.toString());
    }
  } // main(String[])

} // class UndirectedGraphExperiment
