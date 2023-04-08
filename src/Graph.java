import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    public Graph() {
        // Hash Maps require an initial size...
        // make room for "1024" keys
        adjacencyList = new HashMap< Vertex, LinkedList<Vertex>>(1024);
    }
    public int numVertices() {
        return adjacencyList.size();
    }

    public void addVertex( Vertex v ) {
        if (!adjacencyList.containsKey( v )) { // you can query a hashmap to see if contains a key
            // add a key to the hash map
            // with the put function, takes a key followed by a value
            adjacencyList.put(v, new LinkedList<Vertex>());
        }
    }

    public void addEdge( Vertex srcV, Vertex dstV ) {

        // first, does srcV exist???
        if ( adjacencyList.containsKey(srcV) ) {
            // get the "value" or the LinkedList<Vertex> at key: srcV
            adjacencyList.get( srcV ).add( dstV );
        }
    }

    public int outDegree(Integer v) {
        return adjacencyList.get( v ).size();
    }

    public int getNumEdges() {
        int edgeSum = 0;
        // range based for loops for hashmaps are different...
        // need to iterate over the entries in the hashmap..
        for (HashMap.Entry<Vertex,LinkedList<Vertex>> hEntry : adjacencyList.entrySet() ) {
            edgeSum = edgeSum + hEntry.getValue().size();
        }
        return edgeSum;
    }





    // Create the adjacency list that the graph will use  to represent vertices
    // and edges



    //version 1
    //private ArrayList< LinkedList< Integer > > adjacencyList;




    // HashMap< Key, Value > templated container
    // We want to look up the linked list of "edges" associated with a vertex object
    //version 2
    final HashMap< Vertex, LinkedList< Vertex > > adjacencyList;

    // final HashMap< Vertex, LinkedList< Edge > > adjacencyList;



    // private ArrayList<LinkedList<Integer>> adjacencyList;
}