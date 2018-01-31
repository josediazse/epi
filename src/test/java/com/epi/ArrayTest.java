package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    private Array array;

    @Before
    public void setUp() {
        array = new Array();
    }

    @Test
    public void evenOdd() {
        List<Integer> expected = Arrays.asList(8, 2, 4, 6, 15, 11, 13, 9, 1);
        List<Integer> input = Arrays.asList(1, 2, 4, 11, 15, 6, 8, 13, 9);
        array.evenOdd(input);
        Assert.assertTrue(expected.equals(input));
    }
}
