package com.terrykwon;

public class Main {

    public static void main(String[] args) {

        int[] inputs = InputGenerator.generateUniqueNumbers(10);
        InputGenerator.print(inputs);

        InputGenerator.knuthRandomShuffle(inputs);
        InputGenerator.print(inputs);

    }
}
