package io.shiel.codility.lesson3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermMissingElemTest {

    @Test
    public void simple_examples_test() {
        int[] input = {2, 3, 1, 5};
        Integer expected = 4;
        Integer actual = new PermMissingElem().solution(input);
        assertEquals("Incorrect PermMissingElem Value", expected, actual);
    }

    @Test
    public void simple_examples_test2() {
        int[] input = {2};
        Integer expected = 1;
        Integer actual = new PermMissingElem().solution(input);
        assertEquals("Incorrect PermMissingElem Value", expected, actual);
    }

}
