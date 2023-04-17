import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedList;

public class BFSTest {

    @Test
    void testSearch() {
        // Create a graph
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
        g.addEdge(v1, v3);
        g.addEdge(v1, v4);
        g.addEdge(v2, v4);
        g.addEdge(v3, v5);
        g.addEdge(v4, v5);

        // Create a BFS object and run the search
        BFS bfs = new BFS(g.getAdjacencyList());
        LinkedList<Vertex> visited = bfs.search(v0);

        // Check if the order of visited vertices is correct
        assertEquals(v0, visited.get(0));
        assertEquals(v1, visited.get(1));
        assertEquals(v2, visited.get(2));
        assertEquals(v3, visited.get(3));
        assertEquals(v4, visited.get(4));
        assertEquals(v5, visited.get(5));
    }
}