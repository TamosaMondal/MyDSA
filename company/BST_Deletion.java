package com.company;

import java.util.Scanner;

public class BST_Deletion {
    public static BNode deleteNode(BNode root, int key){
        if (root==null){
            return root;
        }
        if (key<root.data){
            root.left=deleteNode(root.left,key);
        }
        else if (key>root.data){
            root.right=deleteNode(root.right,key);
        }
        else {
            if (root.left==null){
                return root.right;
            }
            else if (root.right==null){
                return root.left;
            }
            root.data=minValue(root.right);
            root.right=deleteNode(root.right,root.data);
        }
        return root;
    }
    static int minValue(BNode root){
        int minV= root.data;
        while (root.left!=null){
            minV=root.left.data;
            root=root.left;
        }
        return minV;
    }
    static void inorder(BNode root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    static BNode create(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data:");
        int data=sc.nextInt();
        if (data == -1) {
            return null;
        }
        BNode root=new BNode(data);
        System.out.println("Enter left for "+data);
        root.left=create();
        System.out.println("Enter right for "+data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        BNode m=create();
        BNode k=deleteNode(m,22);
        inorder(k);
    }
}
