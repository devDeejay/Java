package Java.Data_Structures.Graphs;

// Idea 3 Implementation of Graphs using Adjacency List

public class Graph {

    private final int toalNumberOfVertices;  // Number of Vertices
    private Bag<Integer>[] adjacencyBag;  // Array of bags which hold adjacent nodes to each vertex

    public Graph(int toalNumberOfVertices) {
        this.toalNumberOfVertices = toalNumberOfVertices;
        adjacencyBag = new Bag[toalNumberOfVertices]; // We need toalNumberOfVertices bags for toalNumberOfVertices nodes

        for (int vertex = 0; vertex < toalNumberOfVertices; vertex++) {
            adjacencyBag[vertex] = new Bag<>(); // Initializing bags for all vertices
        }
    }

    public void addEdge (int startNode, int endNode) {
        adjacencyBag[startNode].add(endNode);
        adjacencyBag[endNode].add(startNode);
    }

    public Iterable<Integer> getAdjacentNodesForVertex (int vertex) {
        return adjacencyBag[vertex].getList();
    }

}
