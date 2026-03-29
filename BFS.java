package com.tripillarAssignment5;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}