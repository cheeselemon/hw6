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

}
