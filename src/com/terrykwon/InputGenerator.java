package com.terrykwon;

/**
 * Created by Terry Kwon on 5/26/2016.
 */
public class InputGenerator {


    /* Prevents instantiation.
     */
    private InputGenerator() {
    }

    /**
     * Input type 1
     * Generate incremental integers from 0 to (size - 1).
     */
    static int[] generateUniqueNumbers(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i ++) {
            arr[i] = i;
        }

        return arr;
    }

    /**
     * Input type 2
     * Lots of duplicates.
     */
    static int[] generateNumsWithDuplicates(int size) {
        int arr[] = new int[size];

        int i = 0;

        while (i < size / 3) {
            arr[i] = 1;
            i++;
        }
        while (i < size * 2 / 3) {
            arr[i] = 2;
            i++;
        }
        while (i < size) {
            arr[i] = i;
            i++;
        }

        return arr;
    }


    /**
     * Knuth Shuffle given array of integers.
     */
    static void knuthShuffle(int[] inputs) {
        int N = inputs.length;

        for (int j = 0; j < N; j++) {
            int r = j + (int) (Math.random() * (N - j));
            int swap = inputs[r];
            inputs[r] = inputs[j];
            inputs[j] = swap;
        }
    }


}
