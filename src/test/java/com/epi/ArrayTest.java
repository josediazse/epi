package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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
        final Integer[] expected = new Integer[]{2, 4, 6, 8, 9, 11, 1, 13, 15};
        List<Integer> input = Arrays.asList(1, 2, 4, 11, 15, 6, 8, 13, 9);
        array.evenOdd(input);
        for (Integer integer : input) {
            System.out.println(integer);
        }
        Assert.assertTrue(Arrays.equals(expected, input.toArray()));
    }
}
