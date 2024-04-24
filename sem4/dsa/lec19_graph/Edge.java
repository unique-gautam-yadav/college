public class Edge {

    int src;
    int dest;
    int weight;

    public Edge(int u, int v) {
        this.src = u;
        this.dest = v;
    }

    public Edge(int u, int v, int w) {
        this.src = u;
        this.dest = v;
        this.weight = w;
    
}
    @Override
    public String toString() {
        return "(" + src + "," + dest + "," + weight + ")";
    }
}
