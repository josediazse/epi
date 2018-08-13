package com.epi;

import java.util.HashSet;

public class HashTables {
    // 12.01
    public boolean canFormPalindrome(String str) {
        var set = new HashSet<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
            } else {
                set.add(c);
            }
        }
        return set.size() <= 1;
    }
}
