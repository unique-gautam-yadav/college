import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

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

    public boolean hasLoop(int u) {
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>(graph.length);

        Stack<Integer> q = new Stack<Integer>();
        q.push(u);
        while (!q.isEmpty()) {
            Integer v = q.pop();
            if (visited.get(v) == null || !visited.get(v)) {
                visited.put(v, true);
                for (Integer i : graph[v]) {
                    boolean notVisited = visited.get(i) == null || !visited.get(i);

                    if (notVisited && q.contains(i)) {
                        return true;
                    }
                    if (notVisited) {
                        q.push(i);
                    }
                }
            }
        }
        return false;
    }

    public void bfs(int u) {
        // boolean[] isVisited = new boolean[graph.length];
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>(graph.length);
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(u);
        while (!q.isEmpty()) {
            Integer v = q.poll();
            if (visited.get(v) == null || !visited.get(v)) {
                // if (!isVisited[v]) {
                // isVisited[v] = true;
                visited.put(v, true);
                System.out.print(v + "  ");
                for (Integer i : graph[v]) {
                    if (visited.get(i) == null || !visited.get(i))
                        // if (!isVisited[i])
                        q.offer(i);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int u) {
        // boolean[] isVisited = new boolean[graph.length];
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>(graph.length);

        Stack<Integer> q = new Stack<Integer>();
        q.push(u);
        while (!q.isEmpty()) {
            Integer v = q.pop();
            if (visited.get(v) == null || !visited.get(v)) {
                // if (!isVisited[v]) {
                // isVisited[v] = true;
                visited.put(v, true);
                System.out.print(v + "  ");
                for (Integer i : graph[v]) {
                    // if (!isVisited[i])
                    if (visited.get(i) == null || !visited.get(i))
                        q.push(i);
                }
            }
        }
        System.out.println();
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