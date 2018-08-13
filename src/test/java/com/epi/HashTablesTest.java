package com.epi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTablesTest {
    private HashTables hashTables;

    @Before
    public void setup() {
        hashTables = new HashTables();
    }

    @Test
    public void canFormPalindrome() {
        assertEquals(true, hashTables.canFormPalindrome("a"));
        assertEquals(true, hashTables.canFormPalindrome("abb"));
        assertEquals(true, hashTables.canFormPalindrome("aabbb"));
        assertEquals(true, hashTables.canFormPalindrome("edified"));
        assertEquals(false, hashTables.canFormPalindrome("ab"));
    }
}