import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class DFSTest {


    @Test
    void testSearch() {
        // Create graph
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
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v2, v4);
        g.addEdge(v4, v5);

        // Perform DFS
        DFS dfs = new DFS(g.getAdjacencyList());
        LinkedList<Vertex> visitedVertices = dfs.search(v1);

        // Check visited vertices
        ArrayList<Vertex> expectedVisitedVertices = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5));
//        Assertions.assertArrayEquals(expectedVisitedVertices.toArray(), visitedVertices.toArray());
    }
}