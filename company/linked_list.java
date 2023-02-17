package com.company;

public class linked_list {
     static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
        }
    }
   static void traverse(Node head){
         Node cur=head;
         while (cur!=null){
             System.out.println(cur.data);
             cur=cur.next;
         }
    }
    public static void insert(int data,Node head,int pos){
         Node toAdd=new Node(data);
         if (pos==0){
             toAdd.next=head;
             head=toAdd;
             return;
         }
         Node previous=head;
         for (int i=0;i<pos-1;i++){
             previous=previous.next;
         }
         toAdd.next=previous.next;
         previous.next=toAdd;
    }
    public static void delete(Node head,int pos){
         if (pos==0){
             head=head.next;
             return;
         }
         Node previous=head;
         for (int i=0;i<pos-1;i++){
             previous=previous.next;
         }
         previous.next=previous.next.next;
    }
    public static void main(String[] args) {
        Node n1=new Node(40);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=null;
        //traverse(head);
        insert(99,head,2);
        //traverse(head);
        delete(head,2);
        traverse(head);
    }
}
