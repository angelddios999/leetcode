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
}
