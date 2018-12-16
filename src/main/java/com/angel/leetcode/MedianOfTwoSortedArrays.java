package com.angel.leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0d;
        int[] merged = mergeArrays(nums1, nums2);
        int mergedLength = merged.length;

        if(mergedLength % 2 == 0) {
            result = merged[(mergedLength / 2) - 1] + merged[mergedLength / 2];
            result = result / 2;
        } else {
            result = merged[(mergedLength / 2)];
        }

        return result;
    }

    int[] mergeArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] merged = new int[length1 + length2];

        int index1 = 0;
        int index2 = 0;
        int mergedIndex = 0;

        while(index1 < length1 && index2 < length2) {
            if(nums1[index1] < nums2[index2]) {
                merged[mergedIndex] = nums1[index1];
                index1++;
            } else {
                merged[mergedIndex] = nums2[index2];
                index2++;
            }
            mergedIndex++;
        }

        if(index1 < length1) {
            for(int i = index1; i < length1; i++) {
                merged[mergedIndex] = nums1[i];
                mergedIndex++;
            }
        }

        if(index2 < length2) {
            for(int i = index2; i < length2; i++) {
                merged[mergedIndex] = nums2[i];
                mergedIndex++;
            }
        }

        return  merged;
    }
}
