package com.angel.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x <= 9) {
            return true;
        }

        char[] digits = Integer.toString(x).toCharArray();
        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            if (digits[i] != digits[j]) {
                return false;
            }
        }

        return true;
    }
}
