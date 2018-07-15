package com.epi;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
        assertTrue(expected.equals(input));
    }

    @Test
    public void quickSort() {
        int[] expected = new int[]{1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        int[] actual = new int[]{9, 10, 1, 3, 6, 7, 2, 6, 8, 1, 2, 5, 4};
        array.quickSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void dutchNationalFlagPartition() {
        int[] expected = new int[]{2, 3, 4, 7, 7, 10, 9, 11};
        int[] actual = new int[]{11, 3, 7, 9, 4, 7, 10, 2};
        array.dutchNationalFlagPartition(actual, 2);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void plusOne() {
        int[] expected = new int[]{1, 3, 0};
        int[] actual = array.plusOne(new int[]{1, 2, 9});
        assertArrayEquals(expected, actual);

        expected = new int[]{1, 0};
        actual = array.plusOne(new int[]{9});
        assertArrayEquals(expected, actual);

        expected = new int[]{4};
        actual = array.plusOne(new int[]{3});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void computeMaxProfit() {
        final int expected = 30;
        int actual = array.computeMaxProfit(new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250});
        assertEquals(expected, actual);
    }

    @Test
    public void getSubset() throws Exception {
        int[] nums = new int[]{2, 4, 8, 6, 9, 10};
        int[] actual = array.getSubset(nums, 2);
        assertTrue(Arrays.asList(nums).containsAll(Arrays.asList(actual)));
    }
}
