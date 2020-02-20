package io.shiel.codility.lesson3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FrogJmpTest {

    @Parameterized.Parameters(name = "{index}: longest_binary_gap({0})={1}")
    public static Collection data() {
        return asList(new Integer[][] {
                {10,85,30,3}
        });
    }

    private Integer x;
    private Integer y;
    private Integer d;

    private Integer expected;

    public FrogJmpTest(Integer x, Integer y, Integer d, Integer expected) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.expected = expected;
    }

    @Test
    public void simple_examples_test() {
        Integer actual = new FrogJmp().solution(x, y, d);
        assertEquals("Incorrect FrogJmp Value", expected, actual);
    }

}
