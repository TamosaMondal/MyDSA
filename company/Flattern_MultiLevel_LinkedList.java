package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
/*
//  FLATTEN A MULTILEVEL LINKED LIST USING QUEUE:-->
class Node12{
    int data;
    Node12 next,child;
    Node12(int data,Node12 next,Node12 child){
        this.data=data;
        this.next=next;
        this.child=child;
    }
}
public class Flattern_MultiLevel_LinkedList {
    public static Node12 covertList(Node12 head){
        Node12 cur=head;
        Queue<Node12> q =new ArrayDeque<>();
        while (cur!=null){
            if (cur.next==null){
                cur.next=q.poll();
            }
            if (cur.child!=null){
                q.add(cur.child);
            }
            cur=cur.next;
        }
        return head;
    }
    public static void printList(Node12 head){
        Node12 ptr=head;
        while (ptr!=null){
            System.out.print(ptr.data+" -> ");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
    public static Node12 createHorizontalList(int[]input){
        Node12 head=null;
        for (int i=input.length-1;i>=0;i--){
            head=new Node12(input[i], head,null);
        }
        return head;
    }
    public static void main(String[] args) {
        Node12 head=createHorizontalList(new int[]{1,2,3,4,5});
        head.child=createHorizontalList(new int[]{6,7});
        head.next.next.child=createHorizontalList(new int[]{8,9});
        head.child.next.child=createHorizontalList(new int[]{10,11});
        head.child.next.child.child=createHorizontalList(new int[]{12});
        covertList(head);
        printList(head);
    }
}
 */
//  FLATTEN A MULTILEVEL LINKED LIST USING LINKED LIST:-->
class Node12 {
    int data;
    Node12 next;
    Node12 down;
    Node12(int data) {
        this.data = data;
    }
}
public class Flattern_MultiLevel_LinkedList {
    public static void printOriginalList(Node12 head) {
        if (head == null) {
            return;
        }
        System.out.print(" " + head.data + " ");
        if (head.down != null) {
            System.out.print("[");
            printOriginalList(head.down);
            System.out.print("]");
        }
        printOriginalList(head.next);
    }
    public static void printFlattenedList(Node12 head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static Node12 flattenList(Node12 head) {
        if (head == null) {
            return null;
        }
        Node12 next = head.next;
        head.next = flattenList(head.down);
        Node12 tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = flattenList(next);
        return head;
    }
    public static void main(String[] args) {
        Node12 one = new Node12(1);
        Node12 two = new Node12(2);
        Node12 three = new Node12(3);
        Node12 four = new Node12(4);
        Node12 five = new Node12(5);
        Node12 six = new Node12(6);
        Node12 seven = new Node12(7);
        Node12 eight = new Node12(8);
        Node12 nine = new Node12(9);
        Node12 ten = new Node12(10);
        Node12 eleven = new Node12(11);
        Node12 twelve = new Node12(12);
        Node12 thirteen = new Node12(13);
        Node12 fourteen = new Node12(14);
        Node12 fifteen = new Node12(15);
        Node12 head = one;
        one.next = four;
        four.next = fourteen;
        fourteen.next = fifteen;
        five.next = nine;
        nine.next = ten;
        seven.next = eight;
        eleven.next = thirteen;

        one.down = two;
        two.down = three;
        four.down = five;
        five.down = six;
        six.down = seven;
        ten.down = eleven;
        eleven.down = twelve;

        System.out.println("The original list is :");
        printOriginalList(head);

        head = flattenList(head);
        System.out.println("\n\nThe flattened list is :");
        printFlattenedList(head);
    }
}
