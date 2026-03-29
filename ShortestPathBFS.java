package com.tripillarAssignment5;
import java.util.*;

public class ShortestPathBFS {

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);

        int distance[] = new int[vertices];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        distance[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : graph.get(node)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        System.out.println("Shortest distance to node 3 = " + distance[3]);
    }
}