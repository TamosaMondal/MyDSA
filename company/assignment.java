package com.company;

import java.util.Scanner;
/*
public class assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the day..");
        int day= sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Sunday..");
                break;
            case 2:
                System.out.println("Monday..");
                break;
            case 3:
                System.out.println("Tuesday..");
                break;
            case 4:
                System.out.println("Wednesday..");
                break;
            case 5:
                System.out.println("Thursday..");
                break;
            case 6:
                System.out.println("Friday..");
                break;
            case 7:
                System.out.println("Saturday..");
                break;
            default:
                System.out.println("Invalid choice..");
        }
    }
}
 */
/*
public class assignment {
    static int fib(int n){
        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number..");
        int n= sc.nextInt();
        System.out.println("Series upto "+n);
        for (int i=0;i<n;i++){
            System.out.println(fib(i));
        }
    }
}

 */
public class assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first Number");
        int a=sc.nextInt();
        System.out.println("Input Second Number");
        int b= sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        double x=Double.parseDouble(args[0]);
    }
}