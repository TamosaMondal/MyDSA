package com.company;
import java.util.ArrayList;
class Nodev {
    Nodev left, right;
    int data;
    public Nodev(int data) {
        this.data = data;
    }
}
public class BTree_LeftRight_View {
     static Nodev root;
    Nodev node;
   static void printLeftViewUtil(Nodev root, ArrayList list, int level){
        if (root==null) return;
        if (list.get(level)==null){
            list.set(level,root);
        }
        printLeftViewUtil(root.left,list,level+1);
        printLeftViewUtil(root.right,list,level+1);
    }
     static void printLeftView(){
        ArrayList<Nodev>list=new ArrayList<>();
        printLeftViewUtil(root,list,0);
        for (Nodev cur:list){
            System.out.print(cur.data+"  ");
        }
    }
    public static void main(String[] args) {
        BTree_LeftRight_View b=new BTree_LeftRight_View();
        b.node=new Nodev(1);
        b.node.left=new Nodev(2);
        b.node.right=new Nodev(3);
        b.node.left.left=new Nodev(4);
        b.node.left.right=new Nodev(5);
        printLeftView();
    }
}
