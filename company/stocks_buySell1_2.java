package com.company;

public class stocks_buySell1_2 {
    public static int maxProfit(int []a){
        /*                   <---(1 BUY & 1 SELL):-->
        int maxP=0;
        int minSoFar=a[0];
        for (int i=0;i<a.length;i++){
            minSoFar=Math.min(minSoFar,a[i]);
            int profit=a[i]-minSoFar;
            maxP=Math.max(maxP,profit);
        }
        return maxP;
         */
 //                               <---(MULTIPLE BUY & SELL):-->
        int profit=0;
        for (int i=1;i<a.length;i++){
            if (a[i]>a[i-1]){
                profit+=(a[i]-a[i-1]);
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        int a[]={5,2,6,1,4,7,3,6};
        System.out.println("Maximum Profit is : "+maxProfit(a));
    }
}
