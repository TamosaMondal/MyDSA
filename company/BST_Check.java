package com.company;

import java.util.Scanner;

class BNode{
    int data;
    BNode left,right;
    public BNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class BST_Check {

//    static boolean isBST(BNode root){
//        return isdBSTutil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
//    }
//    static boolean isdBSTutil(BNode node,int min,int max){
//        if(node==null){
//            return true;
//        }
//        if(node.data<min || node.data>max){
//            return false;
//        }
//        return (isdBSTutil(node.left,min,node.data-1)&&isdBSTutil(node.right,node.data-1,max));
//    }
    //-------------------------------------------------------
    static BNode prev=null;
    static Boolean isBST(BNode root){
        if(root!=null){
            if(!isBST(root.left)){
                return false;
            }
            if(prev!=null && root.data<= prev.data){
                return false;
            }
            prev=root;
            return(isBST(root.right));
        }
        return true;

    }

    static BNode create(){
        System.out.println("Enter data:");
        Scanner sc=new Scanner(System .in);
        int data=sc.nextInt();
        if(data==-1){
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
        BNode k=create();
        System.out.println(isBST(k));

    }
}
