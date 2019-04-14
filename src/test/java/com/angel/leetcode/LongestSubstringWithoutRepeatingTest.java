package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingTest {
    @Test
    public void testLengthOfLongestSubstring() {
        LongestSubstringWithoutRepeating lswr = new LongestSubstringWithoutRepeating();
        String input = "abcabcbb";
        Assert.assertEquals(3, lswr.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringSpace() {
        LongestSubstringWithoutRepeating lswr = new LongestSubstringWithoutRepeating();
        String input = " ";
        Assert.assertEquals(1, lswr.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringDoubleSpace() {
        LongestSubstringWithoutRepeating lswr = new LongestSubstringWithoutRepeating();
        String input = "  ";
        Assert.assertEquals(1, lswr.lengthOfLongestSubstring(input));
    }

    @Test
    public void testLengthOfLongestSubstringSpecial() {
        LongestSubstringWithoutRepeating lswr = new LongestSubstringWithoutRepeating();
        String input = "aabaab!bb";
        Assert.assertEquals(3, lswr.lengthOfLongestSubstring(input));
    }
}
