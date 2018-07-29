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
    public void isPalindrome() {
        boolean expected = true;
        boolean actual = strings.isPalindrome("hannah");
        assertEquals(expected, actual);
    }

    @Test
    public void intToString() {
        String expected = "321";
        String actual = strings.intToString(321);
        assertEquals(expected, actual);

        expected = "-321";
        actual = strings.intToString(-321);
        assertEquals(expected, actual);

        expected = "0";
        actual = strings.intToString(0);
        assertEquals(expected, actual);
    }

    @Test
    public void stringToInt() {
        int expected = 321;
        int actual = strings.stringToInt("321");
        assertEquals(expected, actual);

        expected = -321;
        actual = strings.stringToInt("-321");
        assertEquals(expected, actual);

        expected = 0;
        actual = strings.stringToInt("0");
        assertEquals(expected, actual);
    }

}