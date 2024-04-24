import java.util.ArrayList;

public class EdgeList {

    ArrayList<Edge>[] graph;
    int vertex;

    @SuppressWarnings("unchecked")
    public EdgeList(int v) {
        vertex = v;

        graph = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(int u, int v) {
        graph[u].add(new Edge(u, v));
        graph[v].add(new Edge(v, u));
    }

    public void addWeightedEdge(int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }

    public void print() {
        int i = 0;
        for (ArrayList<Edge> arrayList : graph) {
            System.out.print(i++ + " -> ");
            System.out.println(arrayList);
        }
    }

}
