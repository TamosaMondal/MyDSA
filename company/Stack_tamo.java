package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/*                      <----:STACK USING ARRAY:--->
class MyStack{
    int a[];
    int top;
    int capacity;
    public MyStack(int capacity){
        this.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }
    void push(int data) throws Exception{
        if (top==capacity-1){
            throw new Exception(" Stack Overflow..");
        }
        top++;
        a[top]=data;
    }
    int pop() throws Exception{
        if (top==-1){
            throw new Exception("Stack Underflow..");
        }
        int res=a[top];
        top--;
        return res;
    }
    int peek() throws Exception{
        if (top==-1){
            throw new Exception("Underflow..");
        }
        return a[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    void show() throws Exception {
        while(!isEmpty()){
            System.out.println(a[top]);
            pop();
        }
    }
}
public class Stack_tamo {
    public static void main(String[] args)throws Exception {
        MyStack st=new MyStack(6);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //st.push(50);
//        ms.show();

        int k=st.pop();
        System.out.printf("%d is deleted.",k);
        System.out.println();

        int m=st.peek();
        System.out.printf("peeked element:%d",m);
        System.out.println();

        System.out.println(st.isEmpty());
        st.show();
    }
}
 */
/*                              <------:STACK USING LINKED LIST:----->
class Node{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
    }
}
class MyStack{
    Node head;
    int size;
    public MyStack(){
        head=null;
        size=0;
    }
    void push(int data){
        Node temp=new Node(data);
        temp.next=head;
        size++;
        head=temp;
    }
    int pop()throws Exception{
        if(head==null){
            throw new Exception("UnderFlow!!");
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }
    int peek()throws Exception{
        if(head==null){
            throw new Exception("Underflow");
        }
        return head.data;
    }
    boolean isEmpty(){
        return head==null;
    }
    int Size(){
        return size;
    }
}
public class Stack_tamo {
    public static void main(String[] args) throws Exception {
        MyStack ms=new MyStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);

        int k=ms.pop();
        System.out.printf("%d element is popped.",k);
        System.out.println();

        int l=ms.peek();
        System.out.printf("%d element is peeked.",l);
        System.out.println();

        System.out.println(ms.isEmpty());
        int s=ms.Size();
        System.out.println(s);
    }
}

 */
//                         <----:STACK USING LIBRARY FUNCTION:--->
public class Stack_tamo {
    public static void main(String[] args) {
       // Stack<Integer> s=new Stack<>();
        Deque <Integer> s=new ArrayDeque<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.size());
    }
}
