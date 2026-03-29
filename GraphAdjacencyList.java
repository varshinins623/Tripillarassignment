package com.tripillarAssignment5;
import java.util.*;

public class GraphAdjacencyList {
    public static void main(String[] args) {
        int vertices = 4;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);

        System.out.println(graph);
    }
}