package com.company;

import java.util.Stack;

public class Previous_Smaller_Element {
     static void PSE(int a[]){
        Stack<Integer> s=new Stack<>();
        for (int i=0;i<a.length;i++){
            while (!s.isEmpty() && s.peek()>=a[i]){
                s.pop();
            }
            if (s.isEmpty()){
                System.out.println(-1);
            }
            else {
                System.out.println(s.peek());
            }
            s.push(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={4,10,5,8,3,12,7};
        PSE(a);
    }
}
