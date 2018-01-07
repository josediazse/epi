package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitsTest {
    private Bits bits;

    @Before
    public void setUp(){
        bits = new Bits();
    }

    @Test
    public void testParity() {
        short expected = 1;
        short actual = bits.parity(7);
        Assert.assertTrue(Short.compare(actual, expected) == 0);
    }

}