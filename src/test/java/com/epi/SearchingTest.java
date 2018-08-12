package com.epi;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SearchingTest {
    Searching searching;

    @Before
    public void setup() {
        searching = new Searching();
    }

    @Test
    public void binarySearch() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(0, searching.binarySearch(1, list));
        assertEquals(3, searching.binarySearch(4, list));
        assertEquals(9, searching.binarySearch(10, list));
        assertEquals(-1, searching.binarySearch(12, list));
    }

    @Test
    public void searchFirstOfK() {
        List<Integer> list = List.of(1, 3, 3, 3, 4, 5, 7, 7, 7, 9);
        assertEquals(6, searching.searchFirstOfK(7, list));
        assertEquals(1, searching.searchFirstOfK(3, list));
    }
}