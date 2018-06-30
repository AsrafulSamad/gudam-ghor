package main.java.com.sindhuk.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by asraful on 9/28/2017.
 */

/**
 * Time Complexity: O(N+E) where N is number of vertices in the graph and E is number of edges in the graph.
 */

public class BFS {
    private Graph graph;
    private int parent[];
    private boolean visited[];

    public BFS(Graph graph){
        this.graph = graph;
    }

    public void init(){
        visited = new boolean[graph.numberOfNodes];     // Mark all the vertices as not visited(By default set as false)
        parent = new int[graph.numberOfNodes];          // To keep the parent nodes

        for(int i=0; i<graph.numberOfNodes; i++){
            parent[i] = -1;
        }
    }

    // prints BFS traversal from a given source s
    public void doBFS(int startingNode) {
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[startingNode]=true;
        queue.add(startingNode);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            startingNode = queue.poll();
            System.out.print(startingNode+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = graph.adjacencyList[startingNode].listIterator();
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

    public static void main(String args[]) {
        Graph graph = new Graph(4);

        // Undirected Graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        BFS bfs     = new BFS(graph);

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");
        bfs.init();
        bfs.doBFS(2);
    }

}
