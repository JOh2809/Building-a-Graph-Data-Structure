import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


//public class Main {
//    public static void main(String[] args) {
//        Graph g = new Graph();
//        Vertex v0 = new Vertex("v0");
//        Vertex v1 = new Vertex("v1");
//        Vertex v2 = new Vertex("v2");
//        Vertex v3 = new Vertex("v3");
//        Vertex v4 = new Vertex("v4");
//        Vertex v5 = new Vertex("v5");
//        g.addVertex(v0);
//        g.addVertex(v1);
//        g.addVertex(v2);
//        g.addVertex(v3);
//        g.addVertex(v4);
//        g.addVertex(v5);
//        g.addEdge(v0, v1);
//        g.addEdge(v1, v3);
//        g.addEdge(v0, v2);
//        g.addEdge(v2, v4);
//        g.addEdge(v2, v0);
//        g.addEdge(v4, v5);
//        g.addEdge(v5, v3);
//        g.addEdge(v5, v4);
//        g.addEdge(v3, v5);
//
//        // Print graph
//        LinkedList<Vertex> vertices = g.getVertices();
//        for (Vertex v : vertices) {
//            System.out.print(v.getLabel() + " -> ");
//            LinkedList<Vertex> neighbors = g.getNeighbors(v);
//            for (Vertex n : neighbors) {
//                System.out.print(n.getLabel() + ", ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Total number of edges in the graph: " + g.getNumEdges());
//
//        // Perform BFS search from start vertex
//        BFS bfs = new BFS(g.getAdjacencyList());
//        Vertex startVertex = g.getVertices().get(0);
//        bfs.search(startVertex);
//
//        // Perform DFS search from start vertex
//        DFS dfs = new DFS(g.getAdjacencyList());
//        LinkedList<Vertex> visited = dfs.search(g, startVertex);
//
//        // Print visited vertices
//        System.out.println("Visited vertices:");
//        for (Vertex v : visited) {
//            System.out.print(v.getLabel() + " ");
//        }
//        System.out.println();
//    }
//}
////public class Main {
//
//    public static void main(String[] args) {
//        // Create graph
//        Graph g = new Graph();
//
//        // Create vertices
//        Vertex v0 = new Vertex("v0");
//        Vertex v1 = new Vertex("v1");
//        Vertex v2 = new Vertex("v2");
//        Vertex v3 = new Vertex("v3");
//        Vertex v4 = new Vertex("v4");
//        Vertex v5 = new Vertex("v5");
//
//        // Add vertices to graph
//        g.addVertex(v0);
//        g.addVertex(v1);
//        g.addVertex(v2);
//        g.addVertex(v3);
//        g.addVertex(v4);
//        g.addVertex(v5);
//
//        // Add edges to graph
//        g.addEdge(v0, v1);
//        g.addEdge(v0, v2);
//        g.addEdge(v1, v3);
//        g.addEdge(v2, v0);
//        g.addEdge(v2, v4);
//        g.addEdge(v3, v5);
//        g.addEdge(v4, v5);
//        g.addEdge(v5, v3);
//
//        // Perform BFS search from start vertex
//        BFS bfs = new BFS(g.getAdjacencyList());
//        Vertex startVertex = v0;
//        LinkedList<Vertex> bfsVisited = bfs.search(startVertex);
//
//        // Perform DFS search from start vertex
//        DFS dfs = new DFS(g.getAdjacencyList());
//        LinkedList<Vertex> dfsVisited = dfs.search(g, startVertex);
//
//        // Print visited vertices for BFS
//        System.out.println("Visited vertices for BFS:");
//        for (Vertex v : bfsVisited) {
//            System.out.print(v.getLabel() + " ");
//        }
//        System.out.println();
//
//        // Print visited vertices for DFS
//        System.out.println("Visited vertices for DFS:");
//        for (Vertex v : dfsVisited) {
//            System.out.print(v.getLabel() + " ");
//        }
//        System.out.println();
//    }
//}
public class Main {
    public static void main(String[] args) {
        // Create graph
        Graph g = new Graph();

        // Create vertices
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");

        // Add vertices to graph
        g.addVertex(v0);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);

        // Add edges to graph
        g.addEdge(v0, v1);
        g.addEdge(v0, v2);
        g.addEdge(v1, v3);
        g.addEdge(v2, v0);
        g.addEdge(v2, v4);
        g.addEdge(v3, v5);
        g.addEdge(v4, v5);
        g.addEdge(v5, v3);
        LinkedList<Vertex> vertices = g.getVertices();
        for (Vertex v : vertices) {
            System.out.print(v.getLabel() + " -> ");
            LinkedList<Vertex> neighbors = g.getNeighbors(v);
            for (Vertex n : neighbors) {
                System.out.print(n.getLabel() + ", ");
            }
            System.out.println();
        }

        // Perform BFS search from start vertex
        BFS bfs = new BFS(g.getAdjacencyList());
        Vertex startVertex = v0;
        LinkedList<Vertex> bfsVisited = bfs.search(startVertex);

//        // Perform DFS search from start vertex
//        DFS dfs = new DFS(g.getAdjacencyList());
//        LinkedList<Vertex> dfsVisited = dfs.search(startVertex);

        // Print visited vertices for BFS
        System.out.println("Visited vertices for BFS:");
        if (bfsVisited != null) {
            for (Vertex v : bfsVisited) {
                System.out.print(v.getLabel() + " ");
            }
        }
        System.out.println();

        System.out.println("Visited vertices for DFS:");
        // Perform DFS search from start vertex
        DFS dfs = new DFS(g.getAdjacencyList());
        LinkedList<Vertex> dfsVisited = dfs.search(startVertex);

        // Print visited vertices for DFS
        if (dfsVisited != null) {
            for (Vertex v : dfsVisited) {
                System.out.print(v.getLabel() + " ");
            }
        }
        System.out.println();

    }

}





