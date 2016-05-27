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
    static int[] generateAscendingNums(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i ++) {
            arr[i] = i + 1;
        }

        return arr;
    }

    /**
     * Input type 2
     * Lots of duplicates.
     * 1/3 of size filled with 1, 1/3 filled with 2, 1/3 filled with incremental integers.
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
            arr[i] = i + 1;
            i++;
        }

        return arr;
    }

    /**
     * Input type 4.
     * Reversely sorted integers.
     */
    static int[] generateDescendingNums(int size) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    /**
     * Input type 5.
     * "Pipe organ".
     */
    static int[] generatePipeOrganNums(int size) {
        int arr[] = new int[size];
        int i = 0;

        while (i < size / 2) {
            arr[i] = i + 1;
            i++;
        }
        while (i < size) {
            arr[i] = size - i;
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
