package com.epi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {
    Strings strings;

    @Before
    public void setUp() {
        strings = new Strings();
    }

    @Test
    public void isPalindrome(){
        boolean expected = true;
        boolean actual = strings.isPalindrome("hannah");
        assertEquals(expected, actual);
    }

}