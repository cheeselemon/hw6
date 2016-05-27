package com.terrykwon;

/**
 * Created by Terry Kwon on 5/26/2016.
 */
public class Sorter {

    /**
     * Prevent instantiation.
     */
    private Sorter() {

    }

    /**
     * 3
     */
    static void insertionSort(int[] inputs) {
        int i, j, key;

        for (j = 1; j < inputs.length; j++) {
            key = inputs[j];

            for (i = j - 1; i >= 0 && (inputs[i] > key); i--) {
                inputs[i + 1] = inputs[i];
            }

            inputs[i + 1] = key;
        }

    }


    /**
     * 6
     */
    static void shellSortKnuth(int[] inputs) {
        int N = inputs.length;
        int interval = 1;

        while (interval < N / 3) {
            interval = interval * 3 + 1;
        }

        while (interval >= 1) {
            for (int i = interval; i < N; i++) {
                for (int j = i; j >= interval && inputs[j] < inputs[j - interval]; j -= interval) {
                    int swap = inputs[j];
                    inputs[j] = inputs[j - interval];
                    inputs[j - interval] = swap;
                }
            }
            interval /= 3;
        }
    }



}
