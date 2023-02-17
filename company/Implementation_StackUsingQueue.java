package com.company;

import java.util.ArrayDeque;
import java.util.Queue;
class MyStack{
    Queue<Integer> q1=new ArrayDeque<>();
    Queue<Integer> q2=new ArrayDeque<>();
    void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
    }
}
    int pop(){
        return q1.poll();
    }
}
public class Implementation_StackUsingQueue {
    public static void main(String[] args) {
        MyStack s=new MyStack();
        s.push(1);//LIFO
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        //s.push(5);
        System.out.println(s.pop());
    }
}
