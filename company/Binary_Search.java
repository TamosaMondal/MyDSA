package com.company;

public class Binary_Search {
    /*                             <---ITERATIVE-->
static int binaryS(int []a,int key){
    int low=0;
    int high=a.length-1;
    while (low<=high){
        int mid=(low+high)/2;
        if (a[mid]==key){
            return mid;
        }
        else if (key>a[mid]){
            low=mid+1;
        }
        else {
            high=mid-1;
        }
    }
    return -1;
}
     */
   static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-2,-1,1,3,4};
        //System.out.println("The element found at position : "+binaryS(a,12));

        //int arr[] = { -11,2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = -1;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+ result);
    }
}
