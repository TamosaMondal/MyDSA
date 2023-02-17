package com.company;

public class Merge_Sort {
    public static int[] MergeS(int a[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            MergeS(a, l, mid);
            MergeS(a, mid + 1, r);
            merge(a, l, mid, r);
        }
        return a;
    }

    public static void merge(int[] a, int l, int mid, int r) {
        int b[] = new int[a.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int a[] = {64, 34, 25, 12, 22, 11, 90};
        int k[] = MergeS(a, 0, a.length - 1);
        System.out.println("After Sorting: ");
        for (int i=0;i<k.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }
}