package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs = InputGenerator.generateNumsWithDuplicates(50);
        print(inputs);

        InputGenerator.knuthShuffle(inputs);
        print(inputs);

        Sorter.shellSortKnuth(inputs);
        print(inputs);
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
