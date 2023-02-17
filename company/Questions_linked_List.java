package com.company;
/*                      <----PALINDROME OF A LINKED LIST:---->
public class Questions_linked_List {
    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data=data;
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
     static boolean Palindrome(Node head){
        if (head==null){
            return true;
        }
        Node mid=middle(head);
        Node last =reverse(mid);
        Node cur=head;
        while (last!=null){
            if (last.data!=cur.data){
                return false;
            }
            last=last.next;
            cur=cur.next;
        }
        return true;
    }
   static Node middle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node n1=new Node("B");
        Node n2=new Node("B");
        Node n3=new Node("B");
       // Node n4=new Node("D");
        Node head=n1;
        head.next=n2;
        n1.next=n3;
        n3.next=null;
       // n4.next=null;
        boolean k=Palindrome(head);
        if (k==true){
            System.out.println(k+" , It is a Palindrome..");
        }
        else {
            System.out.println("It is not a Palindrome...");
        }
    }
}
 */

/*                              <----DETECT CYCLE IN A LINKED LIST:--->
public class Questions_linked_List {
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
    static Node detectCycle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return slow;
            }
        }
        return null;
    }
    static Node detectFirstNode(Node head){
        Node meet=detectCycle(head);
        Node start =head;
        while (start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return start;
    }
    public static Node removeCycle(Node head){
        Node ptr=detectCycle(head);
        ptr.next.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n3;
        Node k=detectFirstNode(head);
        System.out.println(k.data);
        Node h=removeCycle(head);
        //traverse(h);
        }
    }
 */
                         //   <---CREATE DUPLICATE LINKED LIST WITH RANDOM POINTER:-->
class Node{
    int data;
    Node next;
    Node random;
    Node(int data){
        this.data=data;
    }
}
public class Questions_linked_List {
    static void traverse(Node head){
        Node cur=head;
        while (cur!=null){
            System.out.print("Data ="+cur.data+",Random ="+cur.random.data);
            System.out.println();
            cur=cur.next;
        }
    }
    public static Node duplicate(Node head){
        Node cur=head;
        while (cur!=null){
            Node temp=cur.next;
            cur.next=new Node(cur.data);
            cur.next.next=temp;
            cur=temp;
        }
        cur=head;
        while (cur!=null){
            if (cur.next!=null){
                cur.next.random=(cur.random!= null)?
                        cur.random.next:null;
            }
            cur=cur.next.next;
        }
        Node org=head;
        Node copy=head.next;
        Node temp=copy;
        while (org!=null){
            org.next=org.next.next;
            copy.next=(copy.next!=null)?
                    copy.next.next:copy.next;
            org=org.next;
            copy=copy.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node head=n1;
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        n2.random=n1;
        n1.random=n3;
        n3.random=n2;
        n4.random=n3;
        traverse(head);
        Node k=duplicate(head);
        System.out.println();
        traverse(k);
    }
}