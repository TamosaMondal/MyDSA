package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*                      Hashset introduction In java :-->
public class hash_set {
    public static void main(String[] args) {
        HashSet<Integer> s= new HashSet<>(100);
        s.add(5);
        s.add(10);
        System.out.println(s);
        if (s.contains(10)){
            System.out.println("Present..");
        }
        else {
            System.out.println("Not Present..");
        }
        s.remove(10);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        s.clear();
    }
}
 */
/*
                         <---COUNT DISTINCT ELEMENTS:--->
public class hash_set {
    public static int countDistinct(int a[]){
         HashSet<Integer>set=new HashSet<>();
         for (int element: a){
             set.add(element);
         }
         return  set.size();
    }
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,20,10,30,10};
        System.out.println(countDistinct(arr));
    }
}
 */
/*                     <---UNION OF TWO UNSORTED ARRAY:-->
public class hash_set {
    public static int union(int a[],int b[]){
        Set<Integer>set= new HashSet<>();
        for (int x:a){
            set.add(x);
        }
        for (int x:b){
            set.add(x);
        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        int a[]=new int[]{10,20,20,10,30,10};
        int b[]=new int[]{60,40,90,100};
        System.out.println(union(a,b));
    }
}
 */
/*                       <---INTERSECTION OF TWO UNSORTED ARRAY:-->
public class hash_set {
    public static int intersection (int a[],int b[]){
        Set<Integer>set= new HashSet<>();
        Set<Integer>set1= new HashSet<>();
        int count=0;
        for (int x:a){
            set.add(x);
        }
        for (int x:b){
            if (set.contains(x)){
                set1.add(x);
                count++;
                set.remove(x);
            }
        }
        System.out.println(set1);
        return count;
    }
    public static void main(String[] args) {
        int a[]=new int[]{10,20,20,10,30,10};
        int b[]=new int[]{1,20,50,10};
        System.out.println(intersection(a,b));
    }
}
 */
/*                  <---FIND THE SUB-ARRAY WITH THE GIVEN SUM:-->
public class hash_set {
    public static void subArraySum(int a[],int n,int sum){
        int curSum=0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            curSum+=a[i];
            if (curSum-sum==0){
                start=0;
                end=i;
                break;
            }
            if (map.containsKey(curSum-sum)){
                start=map.get(curSum-sum)+1;
                end=i;
                break;
            }
            map.put(curSum,i);
        }
        if (end==-1){
            System.out.println("No subArray ");
        }
        else {
            System.out.println("sum found between index "+start+" to "+end);
        }
    }
    public static void main(String[] args) {
        int a[]={10,2,-2,-20,10};
        int n=a.length;
        int sum=-10;
        subArraySum(a,n,sum);
    }
}
 */
public class hash_set {
    public static void countDistinctElements(int a[],int k){
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        for (int i=0;i<k;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println(map.size());
        for (int i=k;i<a.length;i++){
            if (map.get(a[i-k])==1){
                map.remove(a[i-k]);
            }
            else {
                map.put(a[i-k],map.get(a[i-k])-1);
            }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            System.out.println(map.size());
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,1,3,4,2,3};
        int k=4;
        countDistinctElements(a,k);
    }
}
