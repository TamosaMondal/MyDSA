package com.company;
class Nodeh {
    Nodeh left, right;
    int data;
    public Nodeh(int data) {
        this.data = data;
    }
}
public class BinaryTree_Height_Size_Max {
    Nodeh root;
    int height(Nodeh node){
        if (node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }
    int size(Nodeh node){
        if (node==null){
            return 0;
        }
        return (size(node.left)+size(node.right))+1;
    }
    int maximum(Nodeh node){
        if (node==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(node.data,Math.max(maximum(node.left),maximum(node.right)));
    }
    public static void main(String[] args) {
        BinaryTree_Height_Size_Max b=new BinaryTree_Height_Size_Max();
        b.root=new Nodeh(1);
        b.root.left=new Nodeh(2);
        b.root.right=new Nodeh(3);
        b.root.left.left=new Nodeh(4);
        b.root.left.right=new Nodeh(5);
        System.out.println("height of a Binary Tree "+b.height(b.root));
        System.out.println("Size of a Binary Tree "+b.size(b.root));
        System.out.println("Maximum of a Binary Tree "+b.maximum(b.root));
    }
}
