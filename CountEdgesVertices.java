package com.tripillarAssignment5;
import java.util.*;

public class CountEdgesVertices {

    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        int edges = 0;

        for (int i = 0; i < vertices; i++) {
            edges += graph.get(i).size();
        }

        edges = edges / 2;

        System.out.println("Vertices = " + vertices);
        System.out.println("Edges = " + edges);
    }
}