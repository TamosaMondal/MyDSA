package com.company;
class Queue{
    int a[];
    int capacity;
    int rear;
    public Queue(int n){
        capacity=n;
        a=new int[n];
        rear=-1;
    }
    void enqueue(int data)throws Exception{
        if (rear==capacity-1){
            throw new Exception("OverFlow..");
        }
        rear++;
        a[rear]=data;
    }
    public int dequeue() throws Exception {
        if (rear==-1){
            throw new Exception("Empty Queue..");
        }
        int result=a[0];
        for (int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear--;
        return result;
    }
    public int getFront() throws Exception {
        if (rear==-1){
            throw new Exception("Empty Queue..");
        }
        return a[0];
    }
}
public class Queue_using_Array {
    public static void main(String[] args) throws Exception {
    Queue q=new Queue(6);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.dequeue();
    System.out.println(q.getFront());


    }
}
