package com.company;

import java.util.HashSet;
import java.util.Set;

public class rough {
    public boolean find(int nums[],int arr1[],int arr2[]){
        Set<Integer> Set = new HashSet<>();
        for (int element : nums) {
            Set.add(element);
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++) {
                int res=arr1[i]*arr2[j];
                if(!Set.contains(res)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        rough r=new rough();
        System.out.println(r.find(nums,arr1,arr2));
    }
}
