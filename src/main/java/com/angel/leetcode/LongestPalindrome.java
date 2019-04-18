package com.angel.leetcode;

import java.util.Objects;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        } else {
            int wordLength = s.length();
            char[] chars = s.toCharArray();
            for (int subWordLength = wordLength; subWordLength > 1; subWordLength--) {
                for (int leftIndex = 0; leftIndex + subWordLength <= wordLength; leftIndex++) {
                    int rightIndex = leftIndex + subWordLength;
                    if (isPalindrome(leftIndex, rightIndex - 1, chars)) {
                        return s.substring(leftIndex, rightIndex);
                    }
                }
            }
            return s.substring(0, 1);
        }
    }

    private boolean isPalindrome(int left, int right, char[] chars) {
        for (int i = left, j =right; i < j ; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }

        return true;
    }
}
