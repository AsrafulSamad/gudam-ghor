package main.java.com.sindhuk.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by asraful on 9/28/2017.
 */

public class BFS {

    class Graph {
        private int V;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists

        // Constructor
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adj[v].add(w);
        }
    }

    // Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
    // prints BFS traversal from a given source s
    void doBFS(Graph graph, int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[graph.V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = graph.adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }


    Graph g = new Graph(4);

    // Driver method to
    public static void main(String args[]) {
        BFS bfs = new BFS();

        // Undirected Graph
        bfs.g.addEdge(0, 1);
        bfs.g.addEdge(0, 2);
        bfs.g.addEdge(1, 2);
        bfs.g.addEdge(2, 0);
        bfs.g.addEdge(2, 3);
        bfs.g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        bfs.doBFS(bfs.g,2);

    }

}
