package io.shiel.codility.lesson2;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void simple_example_test() {
        int[] input = {3, 8, 9, 7, 6};
        int numRotations = 3;
        int[] expected = {9, 7, 6, 3, 8};

        Assert.assertArrayEquals("Incorrect Rotation", expected,
                new CyclicRotation().solution(input, numRotations));
    }

    @Test
    public void simple_example_test2() {
        int[] input = {0, 0, 0};
        int numRotations = 1;
        int[] expected = {0, 0, 0};

        Assert.assertArrayEquals("Incorrect Rotation", expected,
                new CyclicRotation().solution(input, numRotations));
    }

    @Test
    public void simple_example_test3() {
        int[] input = {1, 2, 3, 4};
        int numRotations = 4;
        int[] expected = {1, 2, 3, 4};

        Assert.assertArrayEquals("Incorrect Rotation", expected,
                new CyclicRotation().solution(input, numRotations));
    }

}

