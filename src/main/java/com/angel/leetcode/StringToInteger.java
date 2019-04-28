package com.angel.leetcode;

public class StringToInteger {
    public int myAtoi(String str) {
        char[] input = str.toCharArray();
        boolean negative = false;
        boolean numberStarted = false;
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (c == ' ') {
                // Spaces
                if (numberStarted) {
                    break;
                } else {
                    continue;
                }
            } else if (c <= '9' && c >= '0') {
                // Numbers
                int value = c - '0';
                if (inBounds((result * 10L) + value)) {
                    result = (result * 10) + value;
                    numberStarted = true;
                } else {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            } else if (c  == '-' || c == '+') {
                // Signs
                if (numberStarted) {
                    break;
                }
                if (c  == '-') {
                    negative = true;
                }
                numberStarted = true;
            } else {
                // Any other character
                if (numberStarted) {
                    break;
                } else {
                    return 0;
                }
            }
        }

        return negative ? result * -1 : result;
    }

    private boolean inBounds(long value) {
        return value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE;
    }
}
