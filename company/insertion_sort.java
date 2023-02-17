package com.company;

public class insertion_sort {
    static void insertion(int arr[],int n){
        for (int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
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
        insertion(arr,n);
        System.out.println("After insertion sorted array is :");
        printArray(arr,n);
    }
}
