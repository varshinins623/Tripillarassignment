package com.tripillarAssignment5;
public class ValidBST {

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        ValidBST tree = new ValidBST();

        Node root = tree.new Node(50);
        root.left = tree.new Node(30);
        root.right = tree.new Node(70);

        System.out.println(tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}