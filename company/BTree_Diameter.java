package com.company;
class NodeDia {
    NodeDia left, right;
    int data;
    public NodeDia(int data) {
        this.data = data;
    }
}
/*
public class BTree_Diameter {
    NodeDia root;
     int diameter(NodeDia root){
        if (root==null)
            return 0;
        int dl=diameter(root.left);
        int dr=diameter(root.right);
        int cur=height(root.left)+height(root.right)+1;
        return Math.max(cur,Math.max(dl,dr));
    }
    int diameter(){
         return diameter(root);
    }
   static int height(NodeDia root){
        if (root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void main(String[] args) {
        BTree_Diameter dia=new BTree_Diameter();
        dia.root=new NodeDia(1);
        dia.root.left=new NodeDia(2);
        dia.root.right=new NodeDia(3);
        dia.root.left.left=new NodeDia(4);
        dia.root.left.right=new NodeDia(5);
        System.out.println("Diameter is: "+dia.diameter());

    }
}
 */
    //IMPLEMENT HEIGHT FUNCTION:--->
class Height{
    int h;
}
    public class BTree_Diameter {
    NodeDia root;
        int diameterOpt(NodeDia root, Height height) {
            Height lh = new Height(), rh = new Height();
            if (root == null) {
                height.h = 0;
                return 0;
            }
            int ldiameter = diameterOpt(root.left, lh);
            int rdiameter = diameterOpt(root.right, rh);
            height.h = Math.max(lh.h, rh.h) + 1;
            return Math.max(lh.h + rh.h + 1 ,
                    Math.max(ldiameter, rdiameter));
        }
        int diameter() {
            Height height = new Height();
            return diameterOpt(root, height);
        }
        static int height(NodeDia node) {
            if (node == null)
                return 0;
            return (1 + Math.max(height(node.left),height(node.right)));
        }
        public static void main(String args[]) {
            BTree_Diameter tree = new BTree_Diameter();
            tree.root = new NodeDia(1);
            tree.root.left = new NodeDia(2);
            tree.root.right = new NodeDia(3);
            tree.root.left.left = new NodeDia(4);
            tree.root.left.right = new NodeDia(5);
            System.out.println("The diameter of given binary tree is : " + tree.diameter());
        }
    }


