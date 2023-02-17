package com.company;
class NodeD {
    NodeD left, right;
    int data;
    public NodeD(int data) {
        this.data = data;
    }
}
public class BTree_To_DLL {
    NodeD root;
    NodeD head=null;
   static NodeD prov=null;
   void convertToDll(NodeD root){
       if (root==null){
           return;
       }
       convertToDll(root.left);
       if (prov==null){
           head=root;
       }
       else {
           root.left=prov;
           prov.right=root;
       }
       prov=root;
       convertToDll(root.right);
   }
    void printList(NodeD node){
       while (node!=null){
           System.out.print(node.data+"  ");
           node=node.right;
       }
    }
    public static void main(String[] args) {
        BTree_To_DLL dl=new BTree_To_DLL();
        dl.root=new NodeD(3);
        dl.root.left=new NodeD(5);
        dl.root.right=new NodeD(2);
        dl.root.right.left=new NodeD(1);
        dl.root.right.left.left=new NodeD(4);
        dl.root.right.left.right=new NodeD(6);
        dl.convertToDll(dl.root);
        dl.printList(dl.head);
    }
}
