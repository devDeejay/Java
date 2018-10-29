package Data_Structures.Graphs;

import java.io.InputStreamReader;

public class GraphAPI {

    GraphAPI(int V) {

    }

    GraphAPI(InputStreamReader in) {

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

        return "DJ's GraphAPI";
    }

    public static int degree(Data_Structures.Graphs.GraphAPI G, int V) {

        /*
         *
         * Calculates number of Connections of a particular Vertex 'V' in a GraphAPI 'G'
         *
         * */

        int degree = 0;

        for (int connection : G.adj(V)) {

            // For each connection of this node, we increment the degree value

            degree++;
        }

        return degree;

    }

    public static int maxDegree(Data_Structures.Graphs.GraphAPI G) {

        /*
         * Returns the degree of node which has maximum value of Degree in GraphAPI 'G'
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

    public static double averageDegree(Data_Structures.Graphs.GraphAPI G) {

        /*
         * Formula for calculating averageDegree is  ( 2 * E / V )
         * */

        return 2.0 * G.E() / G.V();

    }

    public static double countSelfLoops(Data_Structures.Graphs.GraphAPI G) {

        /*
         * Counts the number of Self Loops existing for all vertex 'V' of GraphAPI 'G'
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
