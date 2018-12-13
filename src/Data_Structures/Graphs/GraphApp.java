package Data_Structures.Graphs;

public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdges(0, new Integer[]{1,2});
        graph.addEdges(1, new Integer[]{3,2,0});
        graph.addEdges(2, new Integer[]{4,1,0});
        graph.addEdges(3, new Integer[]{1,4});
        graph.addEdges(4, new Integer[]{3,2,5});
        graph.addEdges(5, new Integer[]{4,6});
        graph.addEdges(6, new Integer[]{5});

        graph.showConnections();
    }
}
