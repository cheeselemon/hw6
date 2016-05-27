package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs1 = InputGenerator.generateAscendingNums(50);
        print(inputs1);
        int[] inputs2 = InputGenerator.generateNumsWithDuplicates(50);
        print(inputs2);
        int[] inputs4 = InputGenerator.generateDescendingNums(50);
        print(inputs4);
        int[] inputs5 = InputGenerator.generatePipeOrganNums(50);
        print(inputs5);

//        InputGenerator.knuthShuffle(inputs);
//        print(inputs);
//
//        Sorter.shellSortKnuth(inputs);
//        print(inputs);
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
