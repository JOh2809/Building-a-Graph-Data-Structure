import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @org.junit.jupiter.api.Test
    void numVertices() {

       Graph g= new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");

        g.addVertex(v0);
        g.addVertex(v1);

    }

    @org.junit.jupiter.api.Test
    void addVertex() {
    }

    @org.junit.jupiter.api.Test
    void addEdge() {
        Graph g = new Graph();
        Vertex v0 = new Vertex("v0");
        Vertex v1 = new Vertex("v1");
        g.addVertex(v0);
        g.addVertex(v1);
        g.addEdge(v0, v1);
        assertTrue(g.getNeighbors(v0).contains(v1), "Failed to add edge");
        assertTrue(g.getNeighbors(v1).contains(v0), "Failed to add edge");
        assertEquals(1, g.getNumEdges(), "Incorrect number of edges");

    }

    @org.junit.jupiter.api.Test
    void outDegree() {
    }

    @org.junit.jupiter.api.Test
    void getNumEdges() {
    }

    @org.junit.jupiter.api.Test
    void getAdjacencyList() {
    }

    @org.junit.jupiter.api.Test
    void getNeighbors() {
    }

    @org.junit.jupiter.api.Test
    void getVertices() {
    }

    @org.junit.jupiter.api.Test
    void testGetNeighbors() {
    }
}