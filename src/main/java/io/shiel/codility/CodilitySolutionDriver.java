package io.shiel.codility;

import io.shiel.codility.lesson1.BinaryGap;

import java.util.Arrays;

public class CodilitySolutionDriver {

    public static void main(String[] args) {
        System.out.println("Starting Codility Solution: " + Arrays.toString(args));

        Integer x = 328;
        int[] input = {1, 5, 2, 1, 4, 0};


        System.out.println(new BinaryGap().solution(x));

    }

}
