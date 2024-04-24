import java.util.ArrayList;

public class AdjacencyList {
    ArrayList<Integer>[] graph;
    int vertex;

    @SuppressWarnings("unchecked")
    public AdjacencyList(int v) {
        graph = new ArrayList[v];
        vertex = v;

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<Integer>();
        }

    }

    /**
     * Add element in graph.
     */
    public void addEdge(int u, int v) {
        graph[u].add(v);
        graph[v].add(u); // This line for undirected graph...
    }

    /**
     * Print all elements of graph.
     * 
     * Like below
     * 
     * 0 -> [1, 2]
     * 1 -> [0, 2]
     * 2 -> [0, 1]
     */
    public void print() {
        int i = 0;
        for (ArrayList<Integer> arrayList : graph) {
            System.out.print(i++ + " -> ");
            System.out.println(arrayList);
        }
    }

}