import java.util.LinkedList;

public class Main {
    public static void Main(String[] args, Vertex[] vertices) {
        System.out.println("Hello world!");

        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");
        g.addVertex(v0);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);
        g.addEdge(v0, v1);
        g.addEdge(v0, v2);
        g.addEdge(v1, v2);
        g.addEdge(v1, v1);
        g.addEdge(v2, v3);
        g.addEdge(v2, v4);
        g.addEdge(v2, v1);
        g.addEdge(v2, v5);
        g.addEdge(v2, v0);
        g.addEdge(v4, v0);
        g.addEdge(v5, v1);
        g.addEdge(v5, v3);
        g.addEdge(v3, v5);

        for (Vertex v : vertices) {
            System.out.print(v + " -> ");
            LinkedList<Vertex> neighbors = g.getNeighbors(v);
            for (Vertex n : neighbors) {
                System.out.print(n + ", ");
            }
            System.out.println();
        }
        System.out.println("Total number of edges in the graph: " + g.getNumEdges());
    }
}
// refacotr to hashmap and