package com.company;

public class quick_sort {
    static int partition(int arr[],int l,int h){
        int pivot=arr[l];
        int i=l;
        int j=h;
        while (i<j){
            while (arr[i]<=pivot){
                i++;
            }
            while (arr[j]>pivot){
                j--;
            }
            if (i<j)
                swap(arr,i,j);
        }
        swap(arr,j,l);
        return j;
    }
    static void swap(int arr[], int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void QuickS(int []arr,int l,int h){
        if (l<h){
            int pivot=partition(arr,l,h);
            QuickS(arr,l,pivot-1);
            QuickS(arr,pivot+1,h);
        }
    }
    static void printArray(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={66,5,4,6,3,70,20,10,15};
        int n= arr.length;
        QuickS(arr,0,n-1);
        System.out.println("After the Quick sort sorted array is :");
        printArray(arr,n);
    }
}
