package io.shiel.codility.lesson1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BinaryGapTest {

    @Parameterized.Parameters(name = "{index}: longest_binary_gap({0})={1}")
    public static Collection<Integer[]> data() {
        return asList(new Integer[][]{
                {9, 2}, {529, 4}, {20, 1}, {15, 0}
        });
    }

    private Integer input;
    private Integer expected;

    public BinaryGapTest(Integer input, Integer expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void simple_examples_test() {
        Integer actual = new BinaryGap().solution(input);
        assertEquals("Incorrect Binary Gap Value", expected, actual);
    }

}
