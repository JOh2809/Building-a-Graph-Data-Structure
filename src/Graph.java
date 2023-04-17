import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    public Graph() {
        // Hash Maps require an initial size...
        // make room for "1024" keys
        adjacencyList = new HashMap<Vertex, LinkedList<Vertex>>(1024);
    }

    public int numVertices() {
        return adjacencyList.size();
    }


    public boolean addVertex(Vertex v) {
        if (!adjacencyList.containsKey(v)) {
            // add a key to the hash map
            // with the put function, takes a key followed by a value
            adjacencyList.put(v, new LinkedList<Vertex>());
            return true; // vertex added successfully
        }
        return false; // vertex already exists
    }

    //    }
    public boolean addEdge(Vertex srcV, Vertex dstV) {
        if (adjacencyList.containsKey(srcV)) {
            adjacencyList.get(srcV).add(dstV);
            if (adjacencyList.containsKey(dstV)) {
                adjacencyList.get(dstV).add(srcV);
            } else {
                adjacencyList.put(dstV, new LinkedList<Vertex>());
                adjacencyList.get(dstV).add(srcV);
            }
            return true; // edge added successfully
        }
        return false; // failed to add edge
    }

    public int outDegree(Integer v) {
        return adjacencyList.get(v).size();
    }

    public int getNumEdges() {
        int edgeCount = 0;
        // Iterate over the entries in the hashmap
        for (HashMap.Entry<Vertex, LinkedList<Vertex>> entry : adjacencyList.entrySet()) {
            // Add the size of the LinkedList (the number of adjacent vertices) to the edge count
            edgeCount += entry.getValue().size();
        }
        // Divide the edge count by 2 since each edge is counted twice (once for each endpoint vertex)
        return edgeCount / 2;
    }


    public HashMap<Vertex, LinkedList<Vertex>> getAdjacencyList() {
        return adjacencyList;
    }


    // Create the adjacency list that the graph will use  to represent vertices
    // and edges


    //version 1
    //private ArrayList< LinkedList< Integer > > adjacencyList;


    // HashMap< Key, Value > templated container
    // We want to look up the linked list of "edges" associated with a vertex object
    //version 2
    final HashMap<Vertex, LinkedList<Vertex>> adjacencyList;

    public LinkedList<Vertex> getNeighbors(Vertex v) {
        LinkedList<Vertex> neighbors = adjacencyList.get(v);
        if (neighbors == null) {
            throw new IllegalArgumentException("Vertex not found in graph!");
        }
        return neighbors;

        //final HashMap< Vertex, LinkedList< Edge > > adjacencyList;{
        //     return egde;
        // };


        // private ArrayList<LinkedList<Integer>> adjacencyList;
    }

    // function that returns list of vertices
    public LinkedList<Vertex> getVertices() {
        LinkedList<Vertex> vertices = new LinkedList<>();// allocate linked list of vertex
        for (HashMap.Entry<Vertex, LinkedList<Vertex>> hEntry : adjacencyList.entrySet()) {
            // for all entries in my
            vertices.add(hEntry.getKey());
        }
        return vertices;
    }

    public void getNeighbors(Integer v) {
        LinkedList<Vertex> vertices = new LinkedList<>();
        return;
    }

    public int outDegree(Vertex v) {
        if (adjacencyList.containsKey(v)) {
            return adjacencyList.get(v).size();
        }
        return 0;
    }
}