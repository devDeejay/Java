package Data_Structures.Graphs;

import java.io.InputStreamReader;

public class Graph {

    Graph(int V) {

    }

    Graph(InputStreamReader in) {

    }

    int V() {

        /*
         * Return Number of Vertex
         * */

        return 0;
    }

    int E() {

        /*
         * Return Number of Edges
         * */

        return 0;
    }

    void addEdge(int v, int w) {

        /*
         * Adding a vertex v with weight w
         * */

    }

    Iterable<Integer> adj(int V) {

        /*
         * Returns all the adjacent Vertex
         * */

        return null;

    }

    @Override
    public String toString() {


        /*
         * Returning our own version of toString() method
         * */

        StringBuilder s = new StringBuilder(V() + " vertices" + E() + "edges");
        for (int v = 0; v < V(); v++) {
            s.append("");
        }

        return "DJ's Graph";
    }

    public static int degree(Graph G, int V) {

        /*
         * Calculates number of connections at a particular Vertex 'V' of a Graph 'G'
         * */

        int degree = 0;

        for (int connection : G.adj(V)) {

            // For each connection of this node, we increment the degree value

            degree++;
        }

        return degree;

    }

    public static int maxDegree(Graph G) {

        /*
         * Returns the degree of node which has maximum value of Degree in Graph 'G'
         * */

        int max = 0;
        for (int V = 0; V < G.V(); V++) {

            // For each vertex 'V' call the previously defined method degree(G,V)

            if (degree(G, V) > max) {
                max = degree(G, V);
            }
        }

        return max;

    }

    public static double averageDegree(Graph G) {

        /*
         * Formula for calculating averageDegree is  ( 2 * E / V )
         * */

        return 2.0 * G.E() / G.V();

    }

    public static double countSelfLoops(Graph G) {

        /*
         * Counts the number of Self Loops existing for all vertex 'V' of Graph 'G'
         * */

        int count = 0;
        for (int V = 0; V < G.V(); V++) {
            for (int w : G.adj(V)) {
                if (w == V) {
                    count++;
                }
            }
        }

        return count / 2;
    }

}
