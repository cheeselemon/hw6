package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs = InputGenerator.generateUniqueNumbers(10);
        print(inputs);

        InputGenerator.knuthShuffle(inputs);
        print(inputs);

        Sorter.insertionSort(inputs);
        print(inputs);
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
