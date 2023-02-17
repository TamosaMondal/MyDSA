package com.company;

import java.util.Scanner;

public class heap {
    public static int insert(int arr[],int n,int value){
        n=n+1;
        arr[n]=value;
        int i=n;
        while (i>1){
            int parent=i/2;
            if (arr[parent]<arr[i]){
                swap(arr,i,parent);
                i=parent;
            }else {
                break;
            }
        }
        return n;
    }
    public static int delete(int arr[],int n){
        arr[1]=arr[n];
        n=n-1;
        int i=1;
        while (i<n){
            int l=2*i;
            int r=2*i+1;
            int left=arr[2*i];
            int right=arr[2*i+1];
            int larger;
            if (l>n && r>n){
                break;
            }
            if (left>right){
                larger=2*i;
            }
            else {
                larger=2*i+1;
            }
            if (arr[i]<arr[larger]){
                swap(arr,i,larger);
                i=larger;
            }
            else {
                break;
            }
        }
        return n;
    }
    public static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

   public static void printArray(int arr[],int n){
       //System.out.println("Heap is: ");
        for (int i=1;i<=n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=100;
        int [] arr=new int[max];
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array :");
        for (int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }
        int k=insert(arr,n,15);
        printArray(arr,k);
        System.out.println();
        int m=delete(arr,k);
        printArray(arr,m);
        }
}