package com.angel.leetcode;

import java.util.Arrays;

public class RegExMatching {
    public boolean isMatch(String s, String p) {
        char[][] tokens = getTokens(p);
        char[] word = s.toCharArray();
        int tokensIndex = 0;
        int wordIndex = 0;
        char lastWildcard = '\u0000';
        char lastCharacter = '\u0000';

        while (wordIndex < word.length) {
            // If the regex ended but the word contains more characters
            if (tokensIndex >= tokens.length) {
                return false;
            }
            char c = word[wordIndex];
            char t = tokens[tokensIndex][0];
            boolean isWildcard = tokens[tokensIndex][1] == '*';

            if (t == c || t == '.') {
                if (!isWildcard) {
                    tokensIndex++;
                }
                wordIndex++;
            } else {
                if (isWildcard) {
                    tokensIndex++;
                } else {
                    return false;
                }
            }

            if (isWildcard) {
                lastWildcard = t;
            }

            lastCharacter = c;
        }

        // If there are tokens left
        for (int i = tokensIndex; i < tokens.length; i++) {
            char t = tokens[i][0];
            boolean isWildcard = tokens[i][1] == '*';

            // False if the token is not wildcard AND doesn't match the last character or there were no wildcards
            if (!isWildcard) {
                if ((t == '.' || t != lastWildcard) && t != lastCharacter || lastWildcard == '\u0000') {
                    return false;
                }
            }
        }

        return true;
    }

    private char[][] getTokens(String p) {
        char[] regex = p.toCharArray();
        char[][] tokens = new char[p.length()][2];
        int tokensIndex = 0;
        for (int i = 0; i < regex.length; i++) {
            tokens[tokensIndex][0] = regex[i];
            if (i < regex.length - 1 && regex[i + 1] == '*') {
                tokens[tokensIndex][1] = '*';
                i++;
            }
            tokensIndex++;
        }
        tokens = Arrays.copyOf(tokens, tokensIndex);
        return tokens;
    }
}
