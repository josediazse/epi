package com.epi;

public class Bits {
    public short numOfBitsBF(int n) {
        short numOfBits = 0;
        while (n != 0) {
            numOfBits += (n & 1);
            n >>>= 1;
        }
        return numOfBits;
    }

    public short numOfBits(int n) {
        short numOfBits = 0;
        while (n != 0) {
            numOfBits++;
            n &= (n - 1);
        }
        return numOfBits;
    }

    // 4.01
    public short parityBF(int n) {
        short parity = 0;
        while (n != 0) {
            parity ^= (n & 1);
            n >>>= 1;
        }
        return parity;
    }

    public short parity(int n) {
        short parity = 0;
        while (n != 0) {
            parity ^= 1;
            n &= (n - 1);
        }
        return parity;
    }
}
