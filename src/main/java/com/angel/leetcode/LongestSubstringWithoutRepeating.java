package com.angel.leetcode;

import java.util.HashSet;
import java.util.Objects;

public class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        int longestSubstring  = 0;

        if(Objects.nonNull(s)) {
            int length = s.length();
            HashSet<Character> characters = new HashSet<>();

            int index = 0;
            int subIndex = 0;
            while(index < length) {
                char c = s.charAt(index);
                if(characters.contains(c)) {
                    if(characters.size() > longestSubstring) {
                        longestSubstring = characters.size();
                    }
                    characters = new HashSet<>();
                    index = subIndex;
                    subIndex++;
                } else {
                    characters.add(c);
                }

                index++;
            }
            if(characters.size() > longestSubstring) {
                longestSubstring = characters.size();
            }
        }

        return longestSubstring;
    }
}
