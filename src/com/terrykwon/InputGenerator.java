package com.terrykwon;

/**
 * Created by Terry Kwon on 5/26/2016.
 */
public class InputGenerator {


    /* Prevents instantiation.
     */
    private InputGenerator() {
    }

    static int[] generateUniqueNumbers(int size) {
        int arr[] = new int[size];

        for (int i = 0; i < size; i ++) {
            arr[i] = i;
        }

        return arr;
    }


    static void knuthRandomShuffle(int[] inputs) {
        int N = inputs.length;

        for (int j = 0; j < N; j++) {
            int r = j + (int) (Math.random() * (N - j));
            int swap = inputs[r];
            inputs[r] = inputs[j];
            inputs[j] = swap;
        }
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }


}
