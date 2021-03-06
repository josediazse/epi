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
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfBitsBF() {
        short expected = 4;
        short actual = bits.numOfBitsBF(15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parityBF() {
        short expected = 1;
        short actual = bits.parity(7);
        Assert.assertTrue(actual == expected);
        expected = 0;
        actual = bits.parityBF(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parity() {
        short expected = 1;
        short actual = bits.parity(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parityCached() {
        short expected = 1;
        short actual = bits.parityCached(7);
        Assert.assertEquals(expected, actual);
        expected = 0;
        actual = bits.parityBF(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parityByShifts() {
        short expected = 1;
        short actual = bits.parityByShifts(7);
        Assert.assertEquals(expected, actual);
        expected = 0;
        actual = bits.parityBF(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void swapBits() {
        long expected = 3;
        long actual = bits.swapBits(10, 3, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseBitsBF() {
        long expected = (long) Math.pow(2, 63);
        System.out.println(Long.MAX_VALUE);
        System.out.println(expected);
        long actual = bits.reverseBitsBF(1);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void closestIntSameBitCount() {
        long expected = 5;
        long actual = bits.closestIntSameBitCount(6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sumBF() {
        long expected = 9;
        long actual = bits.sumBF(4, 5);
        Assert.assertEquals(expected, actual);
        expected = 55;
        actual = bits.sumBF(33, 22);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sum() {
        long expected = 9;
        long actual = bits.sum(4, 5);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reverseDigitsBF() {
        long expected = 345;
        long actual = bits.reverseDigitsBF(543);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigits() {
        long expected = 345;
        long actual = bits.reverseDigits(543);
        Assert.assertEquals(expected, actual);
        expected = -341;
        actual = bits.reverseDigits(-143);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isNumberPalindrome() {
        boolean expected = true;
        boolean actual = bits.isNumberPalindrome(3234323);
        Assert.assertEquals(expected, actual);
    }
}