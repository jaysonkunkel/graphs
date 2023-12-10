import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;

/**
 * A quick experiment with graphs.
 */
public class GraphExperiment {

  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    // A small graph so that we can force it to expand.
    Graph g = new Graph(2);
    g.addVertex("a");
    g.addVertex("b");
    g.addVertex("c");
    g.addVertex("d");
    g.addVertex("e");
    g.addVertex("f");
    // g.dump(pen);

    // // Add a few edges
    // g.addEdge("a", "b", 1);
    // g.addEdge("a", "c", 2);
    // g.addEdge("b", "c", 3);
    // g.addEdge("b", "a", 4);
    // g.dump(pen);
    
    // // Remove a vertex
    // g.removeVertex("b");
    // g.dump(pen);
    
    // // Add another vertex
    // g.addVertex("d");
    // g.addEdge("a", "d", 5);
    // g.addEdge("d", "a", 6);
    // g.dump(pen);
    
    // // And another (hopefully, this will replace the old b)
    // g.addVertex("e");
    // g.addEdge("e", "a", 7);
    // g.dump(pen);
    
    // // And another (hopefully, this will expand the graph again)
    // g.addVertex("f");
    // g.addEdge("c", "f", 8);
    // g.addEdge("f", "c", 9);
    // g.dump(pen);
    
    // // Add an invalid edge
    // try {
    //   g.addEdge("c",  "g", 0);
    //   pen.println("Surprisingly, added an edge from c to nonexistant g");
    // } catch (Exception e) {
    //   pen.println("Correctly failed to add an edge from c to g.");
    // }
    
    // // Add/replace a bunch of edges
    // for (int i = 1; i <= 4; i++) {
    //   g.addEdge(0,i,i*10);
    // } // for
    // g.dump(pen);
    
    // // Remove an edge
    // g.removeEdge("a", "c");
    // g.dump(pen);

    // List<Integer> reachable = g.reachableFrom("a");

    g.addEdge(0, 1, 1);
    g.addEdge(0, 2, 3);
    g.addEdge(0, 3, 3);
    g.addEdge(1, 2, 2);
    g.addEdge(2, 1, 0);
    g.addEdge(1, 4, 4);
    g.addEdge(2, 3, 2);
    g.addEdge(3, 4, 1);
    g.addEdge(4, 5, 5);
    g.dump(pen);

    // ArrayList<Edge> mst = g.primsAlgorithm();
    // for(Edge e : mst){
    //   pen.println(e.toString());
    // }

    g.reachableFrom(4);
    // for (Integer integer : reachable) {
    //   pen.println(integer);
    // }
    
  } // main(String[])

} // class GraphExperiment
