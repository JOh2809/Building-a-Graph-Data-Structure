import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * This class represents a Breadth-First Search (BFS) algorithm to traverse a graph.
 */
//public class BFS {
//
//    private HashMap<Vertex, LinkedList<Vertex>> adjacencyList; // The graph adjacency list
//    private Vertex[] visitedVertices;
//
//    /**
//     * Constructs a new instance of BFS algorithm with the given graph adjacency list.
//     *
//     * @param adjacencyList The graph adjacency list.
//     */
//    public BFS(HashMap<Vertex, LinkedList<Vertex>> adjacencyList) {
//        this.adjacencyList = adjacencyList;
//    }
//
//    /**
//     * Traverses the graph in breadth-first order starting from the specified vertex.
//     *
//     * @param startVertex The starting vertex of the traversal.
//     * @return
//     */
//    public LinkedList<Vertex> search(Vertex startVertex) {
//        Queue<Vertex> queue = new LinkedList<>(); // Create a queue for BFS
//        HashMap<Vertex, Boolean> visited = new HashMap<>(); // Keep track of visited vertices
//        for (Vertex v : adjacencyList.keySet()) {
//            visited.put(v, false); // Initialize all vertices as not visited
//        }
//
//        queue.add(startVertex); // Enqueue the starting vertex
//        visited.put(startVertex, true); // Mark the starting vertex as visited
//
//        while (!queue.isEmpty()) {
//            Vertex currentVertex = queue.poll(); // Dequeue a vertex from queue
//            System.out.print(currentVertex.getLabel() + " "); // Print the visited vertex label
//
//            // Get all adjacent vertices of the dequeued vertex
//            LinkedList<Vertex> neighbors = adjacencyList.get(currentVertex);
//
//            // Traverse through all adjacent vertices, if not visited, enqueue and mark as visited
//            for (Vertex neighbor : neighbors) {
//                if (!visited.get(neighbor)) {
//                    visited.put(neighbor, true);
//                    queue.add(neighbor);
//                }
//            }
//        }
//        System.out.println(); // Print a new line after all vertices have been visited
//        return null;
//    }
//
//    public Vertex[] getVisitedVertices() {
//        return visitedVertices;
//    }
//    public LinkedList<Vertex> search(Graph g, Vertex startVertex) {
//        return search(startVertex);
//    }
//}
public class BFS {
    private HashMap<Vertex, LinkedList<Vertex>> adjacencyList;

    public BFS(HashMap<Vertex, LinkedList<Vertex>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public LinkedList<Vertex> search(Vertex startVertex) {
        Queue<Vertex> queue = new LinkedList<>(); // Create a queue for BFS
        HashMap<Vertex, Boolean> visited = new HashMap<>(); // Keep track of visited vertices
        LinkedList<Vertex> visitedVertices = new LinkedList<>(); // Keep track of visited vertices in order
        for (Vertex v : adjacencyList.keySet()) {
            visited.put(v, false); // Initialize all vertices as not visited
        }

        queue.add(startVertex); // Add the starting vertex to the queue

        while (!queue.isEmpty()) {
            Vertex currentVertex = queue.remove(); // Remove a vertex from queue
            if (!visited.get(currentVertex)) {
                visited.put(currentVertex, true); // Mark the vertex as visited
                visitedVertices.add(currentVertex); // Add the visited vertex to the list

                // Get all adjacent vertices of the removed vertex
                LinkedList<Vertex> neighbors = adjacencyList.get(currentVertex);

                // Traverse through all adjacent vertices, if not visited, add to queue
                for (Vertex neighbor : neighbors) {
                    if (!visited.get(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }

        return visitedVertices;
    }

    public LinkedList<Vertex> search(Graph g, Vertex startVertex) {
        return search(startVertex);
    }
}