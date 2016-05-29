package com.terrykwon;

/**
 * Todo: Ninther, CUT_SIZE.
 */
public class TunedQuickSort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 9
     */
    static void sort(int[] inputs) {
        sort(inputs, 0, inputs.length - 1);
    }

    private static void sort(int[] inputs, int low, int high) {
        if (high <= low) return;
        int median = findMedian(inputs, low, (high - low) / 2, high);
        swap(inputs, low, median);
        int j = partition(inputs, low, high);
        sort(inputs, low, j - 1);
        sort(inputs, j + 1, high);
    }

    /**
     * @param i Index of arr.
     * @param j Index of arr.
     * @param k Index of arr.
     * @return Index of median value.
     */
    private static int findMedian(int[] arr, int i, int j, int k) {
        if (arr[i] <= arr[j]) {
            if (arr[j] <= arr[k]) {
                return j;
            } else if (arr[i] <= arr[k]){
                return k;
            } else {
                return i;
            }
        } else {
            if (arr[j] >= arr[k]) {
                return j;
            } else if (arr[i] >= arr[k]){
                return k;
            } else {
                return i;
            }
        }
    }

    private static int partition(int[] inputs, int low, int high) {
        int i = low;
        int j = high + 1;
        int v = inputs[low];
        do {
            do i++; while (inputs[i] < v);
            do j--; while (v < inputs[j]);
            if (i < j) {
                swap(inputs, i, j);
            }
        } while (i < j);
        swap(inputs, low, j);

        return j;
    }

}
