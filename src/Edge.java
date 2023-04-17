//public class Edge {
//
//    // Can an edge exist without vertices???
//    // Should Edge() be a good choice???
//
//   private Vertex srcVertex;
//
//   private Vertex dstVertex;
//
//    Edge(Vertex src, Vertex dst) {
//         srcVertex = src;
//        dstVertex = dst;
//    }// Add edges to the graph
//
//
//
//    }
//
public class Edge {

    private Vertex srcVertex;

    private Vertex dstVertex;

    Edge(Vertex src, Vertex dst) {
        srcVertex = src;
        dstVertex = dst;
    }

    public Vertex getSrcVertex() {
        return srcVertex;
    }

    public Vertex getDstVertex() {
        return dstVertex;
    }
}