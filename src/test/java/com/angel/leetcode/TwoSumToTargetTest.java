package com.angel.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumToTargetTest {

    @Test
    public void testTwoSumToTarget() {
        TwoSumToTarget twoSumToTarget = new TwoSumToTarget();
        int[] numbers = new int[]{2, 15, 11, 7};
        int[] result = twoSumToTarget.twoSum(numbers, 9);
        assertEquals(0, result[0]);
        assertEquals(3, result[1]);
    }
}
