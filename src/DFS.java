import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;


/**
 * This class implements Depth-First Search algorithm on a graph.
 */
public class DFS {
    /**
     * The adjacency list representation of the graph.
     */
    private HashMap<Vertex, LinkedList<Vertex>> adjacencyList;

    /**
     * The map to keep track of parent vertices.
     */
    private HashMap<Vertex, Vertex> parentMap;

    /**
     * Creates a new DFS object with the given adjacency list.
     *
     * @param adjacencyList the adjacency list representation of the graph
     */
    public DFS(HashMap<Vertex, LinkedList<Vertex>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    /**
     * Searches the graph starting from the given vertex using Depth-First Search algorithm.
     *
     * @param startVertex the starting vertex of the search
     * @return a linked list containing the visited vertices in the order they were visited
     */
    public LinkedList<Vertex> search(Vertex startVertex) {
        Stack<Vertex> stack = new Stack<>(); // Create a stack for DFS
        HashMap<Vertex, Boolean> visited = new HashMap<>(); // Keep track of visited vertices
        for (Vertex v : adjacencyList.keySet()) {
            visited.put(v, false); // Initialize all vertices as not visited
        }

        stack.push(startVertex); // Push the starting vertex onto the stack

        while (!stack.isEmpty()) {
            Vertex currentVertex = stack.pop(); // Pop a vertex from stack
            if (!visited.get(currentVertex)) {
                visited.put(currentVertex, true); // Mark the vertex as visited
                System.out.print(currentVertex.getLabel() + " "); // Print the visited vertex label

                // Get all adjacent vertices of the popped vertex
                LinkedList<Vertex> neighbors = adjacencyList.get(currentVertex);

                // Traverse through all adjacent vertices, if not visited, push onto stack
                for (Vertex neighbor : neighbors) {
                    if (!visited.get(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println(); // Print a new line after all vertices have been visited
        return null;
    }

    /**
     * Searches the graph starting from the given vertex using Breadth-First Search algorithm.
     * This method is provided for convenience and delegates the search to a BFS object.
     *
     * @param g the graph to search
     * @param startVertex the starting vertex of the search
     * @return a linked list containing the visited vertices in the order they were visited
     */
    public LinkedList<Vertex> search(Graph g, Vertex startVertex) {
        return search(startVertex);
    }
}