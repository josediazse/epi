package com.epi;

import java.util.List;

public class Searching {

    public int binarySearch(Integer t, List<Integer> A) {
        int L = 0, U = A.size() - 1;
        while (L <= U) {
            int M = L + (U - L) / 2;
            if (t > A.get(M)) {
                L = M + 1;
            } else if (t == A.get(M)) {
                return M;
            } else {
                U = M - 1;
            }
        }
        return -1;
    }

    // 11.01
    public int searchFirstOfK(Integer t, List<Integer> A) {
        int found = -1, L = 0, U = A.size() - 1;
        while (L <= U) {
            int M = L + (U - L) / 2;
            if (t > A.get(M)) {
                L = M + 1;
            } else {
                if (t == A.get(M)) found = M;
                U = M - 1;
            }
        }
        return found;
    }
}
