package com.company;
public class Majority_element {
    public static  int majorityElement(int []arr) {
        int ansIndex = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                ansIndex = arr[i];
                count = 1;
            } else {
                if (arr[i] == ansIndex)
                    count++;
                else
                    count--;
            }
        }

        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ansIndex)
                count++;
        }
        if (count > (arr.length / 2))
            return ansIndex;
        return -1;
    }
    public static void main(String[] args) {
        int a[]={2,2,2, 1, 2, 3, 4};
        int majority=majorityElement(a);
        System.out.println("The majority element is : "+majority);
    }
}
