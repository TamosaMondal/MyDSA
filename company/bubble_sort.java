package com.company;

public class bubble_sort {
     static void bubble(int arr[],int n){
        for (int i=0;i<n-1;i++){
            boolean swapped=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j+1]<arr[j]){
                    swapped=true;
                    swap(arr,j+1,j);
                }
            }
            if (swapped!=true){
                break;
            }
        }
    }
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
   static void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={64,34,25,12,22,11,90};
        int n= arr.length;
        bubble(arr,n);
        System.out.println("sorted array :");
        printArray(arr,n);
    }
}
