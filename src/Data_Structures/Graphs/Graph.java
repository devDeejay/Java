package Data_Structures.Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    int numberOfVertex;
    int numberOfEdges;

    ArrayList<ArrayList<Integer>> vertex = new ArrayList();

    void addVertex(Integer value) {
        vertex.add(new ArrayList<>());
        vertex.get(value).add(value);
    }

    void addEdge(Integer vertex1, Integer vertex2) {
        vertex.get(vertex1).add(vertex2);
    }

    void addEdges(Integer vertex1, Integer[] arrayOfVertices) {
        vertex.get(vertex1).addAll(Arrays.asList(arrayOfVertices));
    }

    void showConnections() {
        for (ArrayList<Integer> listOfVertex : vertex) {
            for (Integer vertex : listOfVertex) {
                System.out.print(vertex + " --> ");
            }
            System.out.println();
        }
    }
}
