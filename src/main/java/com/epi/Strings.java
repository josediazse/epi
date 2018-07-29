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
            sb.append((char) ('0' + Math.abs(num % 10)));
            num /= 10;
        } while (num != 0);
        if (isNegative) sb.append('-');
        return sb.reverse().toString();
    }

    public int stringToInt(String num) {
        boolean isNegative = num.charAt(0) == '-';
        int result = 0;
        for (int i = isNegative ? 1 : 0; i < num.length(); i++) {
            final int digit = num.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return isNegative ? -result : result;
    }
}
