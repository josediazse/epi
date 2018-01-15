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
    public short parityBF(long n) {
        short parity = 0;
        while (n != 0) {
            parity ^= (n & 1);
            n >>>= 1;
        }
        return parity;
    }

    public short parity(long n) {
        short parity = 0;
        while (n != 0) {
            parity ^= 1;
            n &= (n - 1);
        }
        return parity;
    }

    // Use a cache of pre-computed results
    public short parityCached(long n) {
        final int BIT_MASK = 0xffff;
        final int MASK_SIZE = 16;
        int [] preComputedResults = getPreCompuntedParities();
        return (short) (preComputedResults[(int) ((n >>> (3 * MASK_SIZE)) & BIT_MASK)] ^
                        preComputedResults[(int) ((n >>> (2 * MASK_SIZE)) & BIT_MASK)] ^
                        preComputedResults[(int) ((n >>> (MASK_SIZE)) & BIT_MASK)] ^
                        preComputedResults[(int) (n & BIT_MASK)]);
    }

    private int[] getPreCompuntedParities() {
        int limit = (int) Math.pow(2, 16);
        int[] result = new int[limit];
        for(int i = 0; i < limit; i++) {
            result[i] = parity(i);
        }
        return result;
    }

    // 4.02
    public long swapBits(long n, int i, int j) {
        // check if bits are different equal
        if ((1 & (n >>> i)) != (1 & (n >>> j))) {
            long mask = (1L << i) | (1L << j);
            n ^= mask;
        }
        return n;
    }
}
