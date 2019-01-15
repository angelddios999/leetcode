package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {

    @Test
    public void testLongestPalindrome() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        Assert.assertEquals("a", longestPalindrome.longestPalindrome("ac"));
    }
}
