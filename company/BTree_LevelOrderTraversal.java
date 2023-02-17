package com.company;

import java.util.LinkedList;
import java.util.Queue;

class Nodel {
    Nodel left, right;
    int data;
    public Nodel(int data) {
        this.data = data;
    }
}
public class BTree_LevelOrderTraversal {
    Nodel root;
    void printLevelOrder(){
        Queue<Nodel> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            Nodel cur=q.poll();
            if (cur==null){
                if (q.isEmpty())
                    return;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(cur.data);
            if (cur.left!=null){
                q.add(cur.left);
            }
            if (cur.right!=null){
                q.add(cur.right);
            }
        }
    }
    public static void main(String[] args) {
        BTree_LevelOrderTraversal b=new BTree_LevelOrderTraversal();
        b.root=new Nodel(1);
        b.root.left=new Nodel(2);
        b.root.right=new Nodel(3);
        b.root.left.left=new Nodel(4);
        b.root.left.right=new Nodel(5);
        System.out.println("Level order of a Binary Tree ");
        b.printLevelOrder();
    }
}
