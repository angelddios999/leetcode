package com.angel.leetcode;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring = 0;

        if(s != null) {
            char[] charsInWord = s.toCharArray();
            if(charsInWord.length == 1) {
                return 1;
            }

            for(int i = 0; i < charsInWord.length; i++) {
                boolean[] letters = new boolean[95];
                int currentLength = 0;

                for(int j = i; j < charsInWord.length; j++) {
                    char c = charsInWord[j];
                    if(!letters[c - ' ']) {
                        currentLength++;

                        if(currentLength > longestSubstring) {
                            longestSubstring = currentLength;
                        }
                        letters[c - ' '] = true;
                    } else {
                        break;
                    }
                }
            }
        }

        return longestSubstring;
    }
}
