import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

//public class DFS {
//    private HashMap<Vertex, LinkedList<Vertex>> adjacencyList;
//
//    public DFS(HashMap<Vertex, LinkedList<Vertex>> adjacencyList) {
//        this.adjacencyList = adjacencyList;
//    }
//
//    public LinkedList<Vertex> search(Vertex startVertex) {
//        Stack<Vertex> stack = new Stack<>(); // Create a stack for DFS
//        HashMap<Vertex, Boolean> visited = new HashMap<>(); // Keep track of visited vertices
//        for (Vertex v : adjacencyList.keySet()) {
//            visited.put(v, false); // Initialize all vertices as not visited
//        }
//
//        stack.push(startVertex); // Push the starting vertex onto the stack
//
//        while (!stack.isEmpty()) {
//            Vertex currentVertex = stack.pop(); // Pop a vertex from stack
//            if (!visited.get(currentVertex)) {
//                visited.put(currentVertex, true); // Mark the vertex as visited
//                System.out.print(currentVertex.getLabel() + " "); // Print the visited vertex label
//
//                // Get all adjacent vertices of the popped vertex
//                LinkedList<Vertex> neighbors = adjacencyList.get(currentVertex);
//
//                // Traverse through all adjacent vertices, if not visited, push onto stack
//                for (Vertex neighbor : neighbors) {
//                    if (!visited.get(neighbor)) {
//                        stack.push(neighbor);
//                    }
//                }
//            }
//        }
//        System.out.println(); // Print a new line after all vertices have been visited
//        return null;
//    }
//
//    public LinkedList<Vertex> search(Graph g, Vertex startVertex) {
//        return  null;
//    }
//}
public class DFS {
    private HashMap<Vertex, LinkedList<Vertex>> adjacencyList;

    public DFS(HashMap<Vertex, LinkedList<Vertex>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

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

    public LinkedList<Vertex> search(Graph g, Vertex startVertex) {
        BFS bfs = new BFS(g.getAdjacencyList());
        return bfs.search(startVertex);
    }
}
