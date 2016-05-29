package com.terrykwon;

/**
 * Created by Terry Kwon on 5/28/2016.
 */
public class KnuthShellSort {

    private KnuthShellSort() {

    }

    static void sort(int[] inputs) {
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
