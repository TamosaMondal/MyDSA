package com.company;

import java.util.Scanner;

class Node22 {
    Node22 left, right;
    int data;
    public Node22(int data) {
        this.data = data;
    }
}
public class Binary_Tree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node22 root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
    }
    static Node22 createTree() {
        Node22 root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if(data == -1) return null;
        root = new Node22(data);
        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for "+ data);
        root.right = createTree();
        return root;
    }
    static void inOrder(Node22 root) {
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void preOrder(Node22 root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node22 root) {
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
