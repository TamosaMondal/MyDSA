package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Implementation {
    public static void main(String[] args) {
        /*
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
         */
        /*
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
         */
        Deque<Integer> dq=new ArrayDeque<>();
        dq.offerFirst(10);
        dq.offerFirst(20);
        dq.offerLast(100);
        dq.offerLast(200);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println( dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}
