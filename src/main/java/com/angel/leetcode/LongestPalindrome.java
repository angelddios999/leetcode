package com.angel.leetcode;

import java.util.Objects;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        if(Objects.nonNull(s)) {
            if(s.length() == 1) {
                return s;
            } else {
                int palindromeSize = s.length();

                while(palindromeSize > 0) {
                    for(int i = 0; i + palindromeSize <= s.length(); i++) {
                        String subString = s.substring(i, i + palindromeSize);
                        if(isPalindrome(subString)) {
                            return subString;
                        }
                    }
                    palindromeSize--;
                }
            }
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        for(int i = 0, j = word.length() - 1; i < j; i++, j--) {
            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
