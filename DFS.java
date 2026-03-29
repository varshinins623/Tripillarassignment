package com.tripillarAssignment5;
public class DFS {

    static void dfs(int node, boolean visited[]) {
        visited[node] = true;
        System.out.print(node + " ");
    }

    public static void main(String[] args) {
        boolean visited[] = new boolean[5];
        dfs(0, visited);
    }
}