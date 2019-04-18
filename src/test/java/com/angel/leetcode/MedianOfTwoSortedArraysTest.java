package com.angel.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    @Test
    public void testFindMedianSortedArrays() {
        int[] input1 = new int[] {1,2,4,5};
        int[] input2 = new int[] {3};
        MedianOfTwoSortedArrays motsa = new MedianOfTwoSortedArrays();
        Assert.assertEquals(3, motsa.findMedianSortedArrays(input1, input2),0);
    }
}
