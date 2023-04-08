import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args, HashMap<Object, Object> adjacencyList) {
        System.out.println("Hello world!");

        Graph g = new Graph();
        Vertex v0 = new Vertex( "v0" );
        Vertex v1 = new Vertex( "v1" );
        Vertex v2 = new Vertex( "v2" );
        Vertex v3 = new Vertex( "v3" );
        Vertex v4 = new Vertex( "v4" );
        Vertex v5 = new Vertex( "v5" );
        g.addVertex(v0);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);  // version `
        // this is version 1 with the hashmap
        // Vertex v0 = new Vertex( "v0" );
        // g.addVertex(v0);
        // Vertex v1 = new Vertex("v1");
        // g.addVertex(v1);
     //   g.addVertex(v0);
        //g.addVertex();

        // version 2
      //  g.addEdge(0, 1) ;
        g.addEdge(v0, v1);
        g.addEdge(v0, v2);
        g.addEdge(v1, v3);
        g.addEdge(v2, v3);
        g.addEdge(v3, v4);
        g.addEdge(v4, v5);
        // g.addEdge(v0, v1);
       // g.addEdge(0, 2);

       // g.printGraph();

        Map<Vertex, List<Vertex>> adjacencyList = g.getAdjacencyList();
        for (Map.Entry<Vertex, List<Vertex>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            System.out.println(entry.getValue());

        System.out.println("Total number of edges in the graph: " + edgeSum);
    }
} // refacotr to hashmap and