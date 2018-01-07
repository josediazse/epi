package com.epi;

public class Bits {
    public short parity(int n) {
        short parity = 0;
        while (n != 0) {
            parity ^= 1;
            n &= (n - 1);
        }
        return parity;
    }
}
