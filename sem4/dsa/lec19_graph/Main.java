public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        // graph.addEdge(3, 0);

        System.out.println(graph.hasLoop(0));

        // AdjacencyList graph = new AdjacencyList(5);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);

        // graph.addEdge(1, 2);
        // graph.addEdge(1, 3);

        // graph.addEdge(2, 4);

        // graph.addEdge(4, 3);

        // System.out.println("BFS");
        // graph.bfs(1);
        // System.out.println("DFS");
        // graph.dfs(1);
        // System.out.println(graph.hasLoop(0));
    }

    // public static void main(String[] args) {
    // EdgeList graph = new EdgeList(5);
    // graph.addEdge(0, 1);
    // graph.addEdge(0, 2);

    // graph.addEdge(1, 2);
    // graph.addEdge(1, 3);

    // graph.addEdge(2, 4);

    // graph.addEdge(4, 3);

    // graph.print();

    // }
}

/**
 * 0 : 1 2
 * 1 : 0 2 3
 * 2 : 0 1
 * 3 :
 */