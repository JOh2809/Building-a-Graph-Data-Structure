public class Edge {

    // Can an edge exist without vertices???
    // Should Edge() be a good choice???
    Edge( Vertex src, Vertex dst )
    {
        srcVertex = src;
        dstVertex = dst;
    }
    private Vertex srcVertex;
    private Vertex dstVertex;
}