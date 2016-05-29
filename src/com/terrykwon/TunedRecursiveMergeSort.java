package com.terrykwon;

/**
 * Created by Terry Kwon on 5/29/2016.
 */
public class TunedRecursiveMergeSort {

    private TunedRecursiveMergeSort() {

    }

    static void sort(int[] inputs) {
        int[] sorted = new int[inputs.length];
        sort(inputs, sorted, 0, inputs.length - 1);
    }

    private static void sort(int[] a, int[] b, int low, int high) {
        if (high <= low) return;
        int mid = low + (high - low) / 2;
        sort(a, b, low, mid);
        sort(a, b, mid + 1, high);

        if (a[mid + 1] > a[mid] ) return;
        merge(a, b, low, mid, high);
    }

    private static void merge(int[] a, int[] b, int low, int mid, int high) {

        for (int k = low; k <= high; k++) {
            b[k] = a[k];
        }

        int i = low, j = mid + 1;

        for (int k = low; k <= high; k++) {
            if (i > mid) a[k] = b[j++];
            else if (j > high) a[k] = b[i++];
            else if (b[j] < b[i]) a[k] = b[j++];
            else a[k] = b[i++];
        }
    }
}
