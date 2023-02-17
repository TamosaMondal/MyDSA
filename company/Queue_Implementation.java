package com.company;

import java.util.*;
import java.util.Queue;

public class Queue_Implementation {
    public static void main(String[] args) {
       // Queue<Integer>q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.poll();
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
