package main.java.com.sindhuk.graph;

import java.util.LinkedList;

/**
 * Created by asraful on 1/11/2018.
 */
class Graph {
    public int numberOfNodes;
    public LinkedList<Integer> adjacencyList[];

    public Graph(int numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        adjacencyList = new LinkedList[numberOfNodes];
        for (int i = 0; i < numberOfNodes; ++i)
            adjacencyList[i] = new LinkedList();
    }

    public void addEdge(int nodeVarOne, int nodeVarTwo) {
        adjacencyList[nodeVarOne].add(nodeVarTwo);
    }
}
