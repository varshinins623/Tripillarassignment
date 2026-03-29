package com.tripillarAssignment5;
import java.util.*;

public class ConnectedComponents {

    static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(3).add(4);
        graph.get(4).add(3);

        boolean visited[] = new boolean[vertices];
        int count = 0;

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited, graph);
                count++;
            }
        }

        System.out.println("Connected Components = " + count);
    }
}
