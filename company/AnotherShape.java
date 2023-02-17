package com.company;
import java.util.Scanner;
 class Shape {
        double length, breadth;
        Shape(double l, double b){
            length = l;
            breadth= b;
        }
        Shape(double len){
            length = breadth = len;
        }
        double calculate(){
            return length * breadth ;
        }
    }
    public class AnotherShape extends Shape{
        double height;
        AnotherShape(double l,double h){
            super(l);
            this.length=l;
            this.height=h;
        }
        AnotherShape(double l,double b,double h){
            super(l,b);
            this.length=l;
            this.breadth=b;
            this.height=h;
        }
        double calculate(){
            return length*breadth*height;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l=sc.nextDouble();
        double b=sc.nextDouble();
        double h=sc.nextDouble();
        AnotherShape myshape1 = new AnotherShape (l,h);
        AnotherShape myshape2 = new AnotherShape (l,b,h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2 = myshape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}
