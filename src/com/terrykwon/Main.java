package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs1 = InputGenerator.generateAscendingNums(51);
        print(inputs1);
        int[] inputs2 = InputGenerator.generateNumsWithDuplicates(51);
        print(inputs2);
        int[] inputs4 = InputGenerator.generateDescendingNums(51);
        print(inputs4);
        int[] inputs5 = InputGenerator.generatePipeOrganNums(51);
        print(inputs5);

        InputGenerator.knuthShuffle(inputs1);
        print(inputs1);

        System.out.println();

        TunedQuickSort.sort(inputs5);
        print(inputs5);
}

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
