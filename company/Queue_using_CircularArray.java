package com.company;
class CircularArrayQueue{
    int a[];
    int n;
    int front=-1,rear=-1;
    public CircularArrayQueue(int n){
        this.n=n;
        a=new int[n];
    }
    void enqueue(int data){
        if ((rear+1)%n==front){
            return;
        }
        if (front==-1){
            front=0;
            rear=(rear+1)%n;
            a[rear]=data;
        }
    }
    public int dequeue() throws Exception {
        if (front==-1){
            throw new Exception("Empty Queue..");
        }
        int result=a[front];
        if (front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%n;
        }
        return result;
    }
}
public class Queue_using_CircularArray {
    public static void main(String[] args) throws Exception {
        CircularArrayQueue cq=new CircularArrayQueue(6);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        //cq.enqueue(40);
        cq.dequeue();
        //cq.dequeue();

    }
}
