package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BST_findPair {
    public static int isPairPresent(BNode root,int target){
        Set<Integer> set=new HashSet<>();
        boolean ans=util(root,target,set);
        return ans ? 1:0;
    }
    public static boolean util(BNode root,int sum,Set<Integer> set){
        if (root==null)
            return false;
        if (util(root.left,sum,set)==true)
            return true;
        if (set.contains(sum-root.data))
            return true;
        set.add(root.data);
        return util(root.right,sum,set);
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
        System.out.println(isPairPresent(m,22));
    }
}
