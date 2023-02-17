package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class priority_Queue {
    public static int  kthLargest(int a[],int n,int k){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for (int i=0; i<k;i++){
            pq.add(a[i]);
        }
        for (int i=k;i<a.length;i++){
            if (a[i]>pq.peek()){
                pq.poll();
                pq.add(a[i]);
            }
        }
       return pq.peek();
    }
    static int minCost(int a[],int n){
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for (int i=0;i<a.length;i++){
           pq.add(a[i]);
       }
       int ans=0;
       while (pq.size()>1){
           int first=pq.poll();
           int second=pq.poll();
           int sum=first+second;
           ans+=sum;
           pq.add(sum);
       }
       return ans;
    }
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap=new PriorityQueue<>();
    public void insertNum(int num){
        if (maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }
        else {
            minHeap.add(num);
        }
        if (maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if (maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    public double findMedian(){
        if (maxHeap.size()==minHeap.size()){
            return maxHeap.peek()/2.0 +minHeap.peek()/2.0;
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        /*                <----CREATION:--->
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
         */
        //      <----KTH LARGEST ELEMENTS:---->
        /*
        int a[]={10,20,30,40,50,60};
        int n=a.length;
        System.out.println("kth Largest Element is : "+kthLargest(a,n-1,3));
         */

        /*              <----CONNECT N ROPES WITH MINIMUM COST:---->
        int arr[]={4,3,2,6};
        int n=arr.length;
        System.out.println("Total Cost For Connecting rope is :"+minCost(arr,n));
         */

        //             <----FIND MEDIAN OF RUNNING STRING OF INTEGERS:---->
        priority_Queue pq=new priority_Queue();
        pq.insertNum(3);
        pq.insertNum(1);
        System.out.println("The median is :"+pq.findMedian());
        pq.insertNum(5);
        System.out.println("The median is :"+pq.findMedian());
        pq.insertNum(4);
        System.out.println("The median is :"+pq.findMedian());
    }
}
