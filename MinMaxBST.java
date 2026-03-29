package com.tripillarAssignment5;
public class MinMaxBST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    int min(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    int max(Node root) {
        while (root.right != null)
            root = root.right;
        return root.data;
    }

    public static void main(String[] args) {
        MinMaxBST tree = new MinMaxBST();
        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);

        System.out.println("Minimum: " + tree.min(root));
        System.out.println("Maximum: " + tree.max(root));
    }
}