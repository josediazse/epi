package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BitsTest {
    private Bits bits;

    @Before
    public void setUp() {
        bits = new Bits();
    }

    @Test
    public void numOfBits() throws Exception {
        short expected = 3;
        short actual = bits.numOfBits(7);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void numOfBitsBF() {
        short expected = 4;
        short actual = bits.numOfBitsBF(15);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void parityBF() {
        short expected = 1;
        short actual = bits.parity(7);
        Assert.assertTrue(actual == expected);
        expected = 0;
        actual = bits.parityBF(10);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void parity() {
        short expected = 1;
        short actual = bits.parity(7);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void parityCached() throws Exception {
        short expected = 1;
        short actual = bits.parityCached(7);
        Assert.assertTrue(actual == expected);
        expected = 0;
        actual = bits.parityBF(10);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void swapBits() {
        long expected = 3;
        long actual = bits.swapBits(10, 3, 0);
        Assert.assertTrue(actual == expected);
    }
}