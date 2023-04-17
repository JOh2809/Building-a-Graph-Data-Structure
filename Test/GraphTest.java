//import static org.junit.jupiter.api.Assertions.*;
//
//class GraphTest {
//
//    @org.junit.jupiter.api.Test
//    void numVertices() {
//
//       Graph g= new Graph();
//        Vertex v0 = new Vertex("v0");
//        Vertex v1 = new Vertex("v1");
//
//        g.addVertex(v0);
//        g.addVertex(v1);
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void addVertex() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void addEdge() {
//        Graph g = new Graph();
//        Vertex v0 = new Vertex("v0");
//        Vertex v1 = new Vertex("v1");
//        g.addVertex(v0);
//        g.addVertex(v1);
//        g.addEdge(v0, v1);
//        assertTrue(g.getNeighbors(v0).contains(v1), "Failed to add edge");
//        assertTrue(g.getNeighbors(v1).contains(v0), "Failed to add edge");
//        assertEquals(1, g.getNumEdges(), "Incorrect number of edges");
//
//    }
//
//    @org.junit.jupiter.api.Test
//    void outDegree() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getNumEdges() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getAdjacencyList() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getNeighbors() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void getVertices() {
//    }
//
//    @org.junit.jupiter.api.Test
//    void testGetNeighbors() {
//    }
//}
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @org.junit.jupiter.api.Test
    void numVertices() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        assertEquals(0, g.numVertices(), "Incorrect number of vertices");
        g.addVertex(v0);
        assertEquals(1, g.numVertices(), "Incorrect number of vertices");
        g.addVertex(v1);
        assertEquals(2, g.numVertices(), "Incorrect number of vertices");
    }

    @org.junit.jupiter.api.Test
    void addVertex() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        assertTrue(g.addVertex(v0), "Failed to add vertex");
        assertFalse(g.addVertex(v0), "Duplicate vertex added");
        assertTrue(g.getVertices().contains(v0), "Vertex not added to graph");
    }

    @org.junit.jupiter.api.Test
    void addEdge() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        g.addVertex(v0);
        g.addVertex(v1);
        assertTrue(g.addEdge(v0, v1), "Failed to add edge");
        assertTrue(g.getNeighbors(v0).contains(v1), "Edge not added to graph");
        assertTrue(g.getNeighbors(v1).contains(v0), "Edge not added to graph");
        assertEquals(1, g.getNumEdges(), "Incorrect number of edges");
    }
    @org.junit.jupiter.api.Test
    void outDegree() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        g.addVertex(v0);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addEdge(v0, v1);
        g.addEdge(v0, v2);

    }

    @org.junit.jupiter.api.Test
    void getNumEdges() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        g.addVertex(v0);
        g.addVertex(v1);
        assertEquals(0, g.getNumEdges(), "Incorrect number of edges");
        g.addEdge(v0, v1);
        assertEquals(1, g.getNumEdges(), "Incorrect number of edges");
    }

    @org.junit.jupiter.api.Test
    void getAdjacencyList() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        g.addVertex(v0);
        g.addVertex(v1);
        g.addVertex(v2);
        g.addEdge(v0, v1);
        g.addEdge(v0, v2);
        assertEquals(3, g.getAdjacencyList().size(), "Incorrect adjacency list size");
        assertTrue(g.getAdjacencyList().containsKey(v0), "Vertex not in adjacency list");
        assertTrue(g.getAdjacencyList().containsKey(v1), "Vertex not in adjacency list");
        assertTrue(g.getAdjacencyList().containsKey(v2), "Vertex not in adjacency list");

    }
}