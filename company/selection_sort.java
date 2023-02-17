package com.company;

public class selection_sort {
    static void selection(int a[],int n){
        for (int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (a[j]<a[min]){
                    min=j;
                }
            }
            if (min!=i){
                swap(a,min,i);
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
        selection(arr,n);
        System.out.println("After the selection sort sorted array is :");
        printArray(arr,n);
    }
}
