package com.company;

import java.util.Scanner;

/*                               <--MAX OF 4 NUMBER:-->
public class clg {
    public static void main(String[] args) {
        int a=40, b=90,c=30,d=10;
        int result=0;
        if (a>b)
            if (a>c)
                if (a>d)
                    result=a;
        if (b>a)
            if (b>c)
                if (b>d)
                    result=b;
        if (c>a)
            if (c>b)
                if (c>d)
                    result=c;
        if (d>a)
            if (d>b)
                if (d>c)
                    result=d;
        System.out.println("Max of this 4 number is: "+result);
    }
}
 */
/*                        <---LEAP YEAR:-->
    public class clg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year= sc.nextInt();
        if ((year%400==0) ||(year%4==0) && (year%100!=0)){
            System.out.println(year+ " is a leap year..");
        }
        else {
            System.out.println(year+ " is not a leap year...");
        }
    }
}
 */

public class clg {
    public static void main(String[] args) {
        int c=4;
        int r=4;
        int p=14;
        if ((p-c)>(r-c)){
            System.out.println("P is outside of the circle..");
        }
        else if ((p-c)==(r-c)){
            System.out.println("P is in the circle..");
        }
        else {
            System.out.println(" P is inside of this circle..");
        }
    }
}

