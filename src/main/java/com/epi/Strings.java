package com.epi;

public class Strings {
    public boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // 6.01
    public String intToString(int num) {
        boolean isNegative = num < 0;
        StringBuilder sb = new StringBuilder();
        do {
            sb.append((char)('0' + Math.abs(num % 10)));
            num /= 10;
        } while (num != 0);
        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }
}
