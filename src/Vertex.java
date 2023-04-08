public class Vertex {

    public Vertex() {
        vertexLabel = "Unassigned";
        visitedStatus = false;
    }

    public Vertex( String label ) {
        vertexLabel = label;
        visitedStatus = false;
    }
    private String vLabel;
    public String getLabel() {
        return vLabel;
    }
    public String getVertexLabel() {
        return vertexLabel;
    }

    public boolean getVisitStatus() {
        return visitedStatus;
    }
    public void setVisitStatus( boolean s ) {
        visitedStatus = s;
    }
    public void resetVisitStatus() {
        visitedStatus = false;
    }

    private String vertexLabel;
    private boolean visitedStatus;
}
