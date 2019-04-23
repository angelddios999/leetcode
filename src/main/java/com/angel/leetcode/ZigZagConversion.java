package com.angel.leetcode;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows<2 || s.length() <= numRows) {
            return s;
        } else {
            int length = s.length();
            char[] chars = s.toCharArray();
            char[] swapped = new char[length];
            int leap = (numRows - 1) * 2;
            int mainIndex = 0;

            for (int rowNumber = 0; rowNumber < numRows; rowNumber++) {
                int innerIndex = rowNumber;

                if(rowNumber == 0 || rowNumber == numRows - 1) {
                    while(innerIndex < length && mainIndex < length) {
                        swapped[mainIndex] = chars[innerIndex];
                        mainIndex++;
                        innerIndex+=leap;
                    }
                } else {
                    int leap2 = leap - (rowNumber * 2);
                    int leap3 = leap - leap2;
                    while(innerIndex < length  && mainIndex < length) {
                        swapped[mainIndex] = chars[innerIndex];
                        mainIndex++;
                        innerIndex+=leap2;
                        if (innerIndex < length) {
                            swapped[mainIndex] = chars[innerIndex];
                            mainIndex++;
                            innerIndex+=leap3;
                        }
                    }
                }
            }
            return new String(swapped);
        }
    }
}
