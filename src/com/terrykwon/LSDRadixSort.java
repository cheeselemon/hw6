package com.terrykwon;

import java.util.LinkedList;
import java.util.Queue;


public class LSDRadixSort {

    private LSDRadixSort() {

    }

//    public static void sort(int[] a, int W) {
//        int N = a.length;
//        int R = 256;   // extend ASCII alphabet size
//        int[] aux = new int[N];
//
//        for (int d = W-1; d >= 0; d--) {
//            // sort by key-indexed counting on dth character
//
//            // compute frequency counts
//            int[] count = new int[R+1];
//            for (int i = 0; i < N; i++)
//                count[a[i].charAt(d) + 1]++;
//
//            // compute cumulates
//            for (int r = 0; r < R; r++)
//                count[r+1] += count[r];
//
//            // move data
//            for (int i = 0; i < N; i++)
//                aux[count[a[i].charAt(d)]++] = a[i];
//
//            // copy back
//            for (int i = 0; i < N; i++)
//                a[i] = aux[i];
//        }
//    }

    static void sort(int[] arr)
    {
        Queue<Integer>[] buckets = new Queue[256];
        for (int i = 0; i < 256; i++)
            buckets[i] = new LinkedList<Integer>();

        boolean sorted = false;
        int expo = 1;

        while ( ! sorted) {
            sorted = true;

            for (int item : arr) {
                int bucket = (item / expo) % 256;
                if (bucket > 0) sorted = false;
                buckets[bucket].add(item);
            }

            expo *= 256;
            int index = 0;

            for (Queue<Integer> bucket : buckets)
                while ( ! bucket.isEmpty())
                    arr[index++] = bucket.remove();
        }
    }


}
