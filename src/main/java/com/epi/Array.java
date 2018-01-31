package com.epi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array {
    public void evenOdd(List<Integer> a) {
        int nextEven = 0, nextOdd = a.size() - 1;
        while (nextEven < nextOdd) {
            if (a.get(nextEven) % 2 == 0) {
                nextEven++;
            } else {
                Collections.swap(a, nextEven, nextOdd--);
            }
        }
    }
}
