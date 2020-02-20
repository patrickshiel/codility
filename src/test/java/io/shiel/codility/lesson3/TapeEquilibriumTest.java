package io.shiel.codility.lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TapeEquilibriumTest {

    //@Test
    public void simple_examples_test() {
        int[] input = {3, 1, 2, 4, 3};
        Integer expected = 4;
        Integer actual = new TapeEquilibrium().solution(input);
        assertEquals("Incorrect TapeEquilibrium Value", expected, actual);
    }

    @Test
    public void simple_examples_test2() {
        int[] input = {3,4};
        Integer expected = 1;
        Integer actual = new TapeEquilibrium().solution(input);
        assertEquals("Incorrect TapeEquilibrium Value", expected, actual);
    }


}
