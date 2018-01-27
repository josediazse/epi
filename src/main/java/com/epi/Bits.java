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
        int[] preComputedResults = getPreComputedParities();
        return (short) (preComputedResults[(int) ((n >>> (3 * MASK_SIZE)) & BIT_MASK)] ^
                preComputedResults[(int) ((n >>> (2 * MASK_SIZE)) & BIT_MASK)] ^
                preComputedResults[(int) ((n >>> (MASK_SIZE)) & BIT_MASK)] ^
                preComputedResults[(int) (n & BIT_MASK)]);
    }

    private int[] getPreComputedParities() {
        int limit = (int) Math.pow(2, 16);
        int[] result = new int[limit];
        for (int i = 0; i < limit; i++) {
            result[i] = parity(i);
        }
        return result;
    }

    public short parityByShifts(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 0x1);
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

    // 4.03
    public long reverseBitsBF(long n) {
        for (int i = 0, j = Long.SIZE - 1; i < 32; i++, j--) {
            n = swapBits(n, i, j);
        }
        return n;
    }

    // 4.05
    public long sumBF(long a, long b) {
        long result = 0, carry = 0, temp;
        long tempA, tempB;
        short count = 0;
        while (a != 0 || b != 0) {
            tempA = a & 1;
            tempB = b & 1;
            temp = tempA ^ tempB ^ carry;
            result |= (temp << count);
            carry = (tempA & tempB) | (carry & tempA) | (carry & tempB);
            a >>>= 1;
            b >>>= 1;
            count++;
        }
        return result | (carry << count);
    }

    public long sum(int a, int b) {
        long sum = 0, carryin = 0, k = 1, tempA = a, tempB = b;
        while (tempA != 0 || tempB != 0) {
            long ak = a & k, bk = b & k;
            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
            sum |= (ak ^ bk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            tempA >>>=1;
            tempB >>>=1;
        }
        return sum | carryin;
    }

    // 4.8
    public long reverseDigitsBF(int x) {
        long result = 0;
        while (x > 9) {
            int mod = x % 10;
            result = (result * 10) + (mod * 10);
            x /= 10;
        }
        return result + x;
    }

    public long reverseDigits(int x) {
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0) {
            result = (result * 10) + (xRemaining % 10);
            xRemaining /= 10;
        }
        return x < 0 ? -result : result;
    }

    // 4.9
    public boolean isNumberPalindrome(int x) {
        if (x <= 0) {
            return x == 0;
        }
        int numOfDigits = (int) Math.log10(x) + 1;
        int mask = (int) Math.pow(10, numOfDigits - 1);
        for (int i = 0; i < (numOfDigits / 2); i++) {
            if ((x / mask) != x % 10) {
                return false;
            }
            x %= mask;
            x /= 10;
            mask /= 100;
        }
        return true;
    }
}
