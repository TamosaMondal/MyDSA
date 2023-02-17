package com.company;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class practice
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int i=0;
        while(i<t)
        {
            int N=sc.nextInt();
            int K=sc.nextInt();
/*
            if(X>Y)
                System.out.println(X-Y);
            else
                System.out.println(Y-X);
         */
            /*
            System.out.println(N*M);
             */
            /*
            if (Y>X){
                System.out.println(Y-X);
            }
            else {
                System.out.println(0);
            }
             */
            if ((N+1)>K){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            i++;
        }
        // your code goes here

        }

    }
