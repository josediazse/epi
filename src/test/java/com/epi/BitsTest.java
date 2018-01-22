package com.epi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void parityCached() {
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

    @Test
    public void reverseBitsBF() {
        long expected = (long) Math.pow(2, 63);
        System.out.println(Long.MAX_VALUE);
        System.out.println(expected);
        long actual = bits.reverseBitsBF(1);
        System.out.println(actual);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void reverseDigitsBF(){
        long expected = 345;
        long actual = bits.reverseDigitsBF(543);
        Assert.assertTrue(actual == expected);
    }

    @Test
    public void reverseDigits(){
        long expected = 345;
        long actual = bits.reverseDigits(543);
        Assert.assertTrue(actual == expected);
        expected = -341;
        actual = bits.reverseDigits(-143);
        Assert.assertTrue(actual == expected);
    }
}