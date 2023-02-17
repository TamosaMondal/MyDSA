package com.company;

import java.util.Queue;

class Nodee{
    int data;
    Nodee next;
    public Nodee(int data){
        this.data=data;
    }
}
public class Queue_using_linkedList {
    Nodee front,rear;
    void enqueue(int data){
        Nodee newNode=new Nodee(data);
        if (front==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public int dequeue()throws Exception{
        if (front==null){
            throw new Exception("Queue is Empty..");
        }
        int result=front.data;
        front=front.next;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Queue_using_linkedList q=new Queue_using_linkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println("Queue front : "+q.front.data);
        System.out.println("Queue rear : "+q.rear.data);
    }
}
