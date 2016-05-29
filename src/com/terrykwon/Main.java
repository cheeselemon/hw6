package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs1 = InputGenerator.generateAscendingNums(10000);
        print(inputs1);
        int[] inputs2 = InputGenerator.generateNumsWithDuplicates(51);
        print(inputs2);
        int[] inputs4 = InputGenerator.generateDescendingNums(51);
        print(inputs4);
        int[] inputs5 = InputGenerator.generatePipeOrganNums(51);
        print(inputs5);

        System.out.println();

        InputGenerator.knuthShuffle(inputs1);
        print(inputs1);

        System.out.println();

        TunedRecursiveMergeSort.sort(inputs1);
        print(inputs1);
}

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("not sorted");
                return false;
            }
        }
        return true;
    }

}
