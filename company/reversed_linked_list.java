package com.company;
/*
public class reversed_linked_list {
    static Node head;

    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
        }
    }
    void printList(Node node){
        while (node!=null){
            System.out.println(node.data+ " ");
            node=node.next;
        }
    }

   static Node reverse(Node head){
        Node cur=head;
        Node previous =null;
        while (cur!=null){
            Node temp= cur.next;
            cur.next=previous;
            previous=cur;
            cur=temp;
        }
        return previous;
    }
    public static void main(String[] args) {
        reversed_linked_list rl=new reversed_linked_list();
        rl.head=new Node(52);
        rl.head.next=new Node(53);
        rl.head.next.next=new Node(54);
        rl.head.next.next.next=new Node(55);
        System.out.println("Given Linked List is : ");
        rl.printList(head);
        head=rl.reverse(head);
        System.out.println(" ");
        System.out.println("The reversed Linked List is :");
        rl.printList(head);
    }
}
 */
public class reversed_linked_list {
    static Node head;

    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
        }
    }
    void printList(Node node){
        while (node!=null){
            System.out.println(node.data+ " ");
            node=node.next;
        }
    }
    public Node reverseRecursive(Node head){
        if (head ==null || head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    public static void main(String[] args) {
        reversed_linked_list rl= new reversed_linked_list();
        rl.head=new Node(52);
        rl.head.next=new Node(53);
        rl.head.next.next=new Node(54);
        rl.head.next.next.next=new Node(55);
        System.out.println("Given Linked List is : ");
        rl.printList(head);
        head=rl.reverseRecursive(head);
        System.out.println(" ");
        System.out.println("The reversed Linked List is :");
        rl.printList(head);

    }
}
