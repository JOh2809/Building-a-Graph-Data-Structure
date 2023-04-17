
/**
 Represents a vertex in a graph.
 */
public class Vertex {
    private String label; // Label of the vertex
    private boolean visited; // Indicates whether the vertex has been visited

    /**

     Constructs a new vertex with the given label.
     @param label the label of the vertex
     */
    public Vertex(String label) {
        this.label = label;
        this.visited = false;
    }
    /**

     Returns the label of the vertex.
     @return the label of the vertex
     */
    public String getLabel() {
        return label;
    }
    /**

     Sets the label of the vertex to the given value.
     @param label the new label for the vertex
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**

     Returns true if the vertex has been visited, false otherwise.
     @return true if the vertex has been visited, false otherwise
     */
    public boolean isVisited() {
        return visited;
    }
    /**

     Sets the visited status of the vertex to the given value.
     @param visited the new visited status for the vertex
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    /**

     Returns an array of vertices that are adjacent to this vertex.
     @return an array of vertices that are adjacent to this vertex
     */
    public Vertex[] getNeighbors() {
        return new Vertex[0];
    }
}