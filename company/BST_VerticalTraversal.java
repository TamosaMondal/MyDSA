package com.company;

import java.util.*;
import java.util.Queue;

public class BST_VerticalTraversal {
    static ArrayList<Integer> verticalOrder(BNode root){
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair cur=q.poll();
            if (map.containsKey(cur.hd)){
                map.get(cur.hd).add(cur.node.data);
            }else {
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(cur.node.data);
                map.put(cur.hd,temp);
            }
            if (cur.node.left!=null){
                q.add(new Pair(cur.hd-1,cur.node.left));
            }
            if (cur.node.right!=null){
                q.add(new Pair(cur.hd+1,cur.node.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            ans.addAll(entry.getValue());
        }
        return ans;
    }
    static class Pair{
        int hd;
        BNode node;
        public Pair(int hd,BNode node){
            this.node=node;
            this.hd=hd;
        }
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
        System.out.println(verticalOrder(m));
    }
}
