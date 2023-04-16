//import org.junit.jupiter.api.Test;
//import java.util.HashMap;
//import java.util.LinkedList;
//import static org.junit.jupiter.api.Assertions.*;
//
//class GraphBFSTest {
//
//    @Test
//    void bfs() {
//        HashMap<Vertex, LinkedList<Vertex>> adjacencyList = new HashMap<>();
//
//        // Create vertices
//        Vertex v1 = new Vertex("1");
//        Vertex v2 = new Vertex("2");
//        Vertex v3 = new Vertex("3");
//        Vertex v4 = new Vertex("4");
//        Vertex v5 = new Vertex("5");
//
//        // Add edges
//        LinkedList<Vertex> v1_neighbors = new LinkedList<>();
//        v1_neighbors.add(v2);
//        v1_neighbors.add(v3);
//        adjacencyList.put(v1, v1_neighbors);
//
//        LinkedList<Vertex> v2_neighbors = new LinkedList<>();
//        v2_neighbors.add(v1);
//        v2_neighbors.add(v4);
//        v2_neighbors.add(v5);
//        adjacencyList.put(v2, v2_neighbors);
//
//        LinkedList<Vertex> v3_neighbors = new LinkedList<>();
//        v3_neighbors.add(v1);
//        adjacencyList.put(v3, v3_neighbors);
//
//        LinkedList<Vertex> v4_neighbors = new LinkedList<>();
//        v4_neighbors.add(v2);
//        adjacencyList.put(v4, v4_neighbors);
//
//        LinkedList<Vertex> v5_neighbors = new LinkedList<>();
//        v5_neighbors.add(v2);
//        adjacencyList.put(v5, v5_neighbors);
//
//        BFS graph = new BFS(adjacencyList);
//
//        // Test BFS traversal starting from vertex v1
//        String expectedOutput = "1 2 3 4 5 ";
//        assertEquals(expectedOutput, getBFSOutput(graph, v1));
//    }
//
//    private String getBFSOutput(BFS graph, Vertex start) {
//        StringBuilder output = new StringBuilder();
//        graph.bfs(start, v -> output.append(v.getLabel()).append(" "));
//        return output.toString();
//    }
//}