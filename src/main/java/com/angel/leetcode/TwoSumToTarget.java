package com.angel.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumToTarget {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if(numsMap.containsKey(compliment)) {
                return new int[]{numsMap.get(compliment), i};
            }
            numsMap.put(nums[i], i);
        }

        return null;
    }
}
