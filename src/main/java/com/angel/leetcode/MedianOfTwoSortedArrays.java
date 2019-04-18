package com.angel.leetcode;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int half = (nums1.length + nums2.length) / 2 + 1;
        boolean evenLength = ((nums1.length + nums2.length) % 2) == 0;
        double median = 0d;
        int current = 0, i = 0, j = 0;

        while (i < half && j < half) {
            int left = i < nums1.length ? nums1[i] : Integer.MAX_VALUE;
            int right = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;

            int previous = current;
            if (left < right) {
                current = left;
                i++;
            } else {
                current = right;
                j++;
            }

            if (i + j == half) {
                if (evenLength) {
                    median = (current + previous) / 2d;
                } else {
                    median = current;
                }
                break;
            }
        }

        return median;
    }
}
