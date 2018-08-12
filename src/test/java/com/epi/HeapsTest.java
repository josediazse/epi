package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class HeapsTest {

    private Heaps heaps;

    @Before
    public void setup() {
        heaps = new Heaps();
    }

    @Test
    public void heapSort() {
        var expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        var actual = heaps.heapSort(List.of(10, 9, 8, 7, 1, 2, 4, 5, 6, 3));
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void kLargest() {
        var expected = List.of(7, 8, 9, 10);
        var actual = heaps.kLargest(4, List.of(2, 4, 6, 8, 10, 1, 3, 5, 7, 9));
        Collections.sort(actual);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void kSmallest() {
        var expected = List.of(1,2,3,4);
        var actual = heaps.kSmallest(4, List.of(2, 4, 6, 8, 10, 1, 3, 5, 7, 9));
        Collections.sort(actual);
        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void mergeSortedLists() {
        var expected = List.of(0, 0, 3, 5, 6, 6, 7, 28);
        var actual = heaps.mergeSortedLists(List.of(List.of(3, 5, 7), List.of(0, 6), List.of(0, 6, 28)));
        System.out.println(actual);
        Assert.assertTrue(expected.equals(actual));
    }
}