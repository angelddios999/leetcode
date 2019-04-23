package com.angel.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        if (Math.abs(x / 10) > 0) {
            int reversed = x % 10;
            x = x / 10;

            while (Math.abs(x) > 0) {
                int mod = x % 10;
                if (inBounds(reversed * 10L + mod)) {
                    reversed *= 10;
                    reversed += mod;
                    x = x / 10;
                } else {
                    return 0;
                }
            }

            return reversed;
        }

        return x;
    }

    private boolean inBounds(long value) {
        return value < Integer.MAX_VALUE && value > Integer.MIN_VALUE;
    }
}
