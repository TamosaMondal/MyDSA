package com.company;

public class findElement_bs {
    /*                  SEARCH AN ELEMENT IN AN INFINITE SORTED ARRAY:-->
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

    static int SearchInfinite(int []arr,int key){
        int low=0;
        int high=1;
        while (arr[high]<key){
            low=high;
                high=2*high;
        }
        return binarySearch(arr,low,high,key);
    }
     */

    //                              SEARCH AN ELEMENT IN A SORTED AND ROTATED ARRAY:-->
    static int RotatedS(int []a,int key){
        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (a[mid]==key){
                return mid;
            }
            if (a[low]<a[mid]){
                if (key>=a[low] && key<a[mid]){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            else {
                if (key>a[mid] && key<=a[high]){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       // int arr[] = new  int[]{-2,-1,1,3,4,8,10,20,30,40,50,60,70,80,90,91,92,99,100};
        //int ans=SearchInfinite(arr,-1);

        int arr[] = new  int[]{70,80,90,91,92,99,100,-2,-1,1,3,4,8,10,20,30,40,50,60};
        int ans=RotatedS(arr,1);
        if (ans == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+ ans);

    }
}


