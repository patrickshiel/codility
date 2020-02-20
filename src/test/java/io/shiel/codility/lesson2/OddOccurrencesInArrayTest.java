package io.shiel.codility.lesson2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddOccurrencesInArrayTest {

    @Test
    public void simple_example_test() {
        int[] input = {9, 3, 9, 3, 9, 7, 9};
        Integer expected = 7;
        Integer output = new OddOccurrencesInArray().solution(input);
        assertEquals("Incorrect OddOccurrencesInArray", expected, output);
    }

    @Test
    public void odd_example_test() {
        int[] input = {9,5,9,6,5,7,7,7,7,6,1};
        Integer expected = 1;
        Integer output = new OddOccurrencesInArray().solution(input);
        assertEquals("Incorrect OddOccurrencesInArray", expected, output);
    }

    @Test
    public void odd_example_test2() {
        int[] input = {9};
        Integer expected = 9;
        Integer output = new OddOccurrencesInArray().solution(input);
        assertEquals("Incorrect OddOccurrencesInArray", expected, output);
    }

}

