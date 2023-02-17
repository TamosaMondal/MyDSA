package com.company;

import java.util.Arrays;

public class Duplicate_String {
    public static void main(String[] args) {
        String str="tamosa mondal";
        System.out.println("string is"+str);
        char ar[]=new char[str.length()];
        str.getChars(0,str.length(),ar,0);
        int k=0;
        for(int i=0;i<ar.length;i++){
            for (int j=0;j<i;j++){
                if (ar[i]==ar[j]){
                    break;
                }
                if (i==j){
                    ar[k++]=ar[i];
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
