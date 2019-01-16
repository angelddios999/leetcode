package com.angel.leetcode;
import java.util.Objects;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        String result = "";
        if(Objects.nonNull(s)) {
            int wordLength = s.length();
            if(wordLength == 1 || numRows == 1 || wordLength == numRows) {
                result = s;
            } else {
                StringBuilder[] sbList = new StringBuilder[numRows];
                for(int i = 0; i < numRows; i++){
                    sbList[i] = new StringBuilder();
                }
                int rowIndex = 0;
                boolean down = false;
                char[] chars = s.toCharArray();

                for(char c : chars) {
                    sbList[rowIndex].append(c);
                    if(rowIndex == 0 || rowIndex == numRows - 1) {
                        down = !down;
                    }

                    rowIndex += down ? 1 : -1;
                }

                result = getMergedString(sbList);
            }
        }

        return result;
    }

    private String getMergedString(StringBuilder[] sbList) {
        StringBuilder stringBuilder = new StringBuilder();
        for(StringBuilder sb : sbList) {
            stringBuilder.append(sb);
        }
        return stringBuilder.toString();
    }
}
