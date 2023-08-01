package org.example.longestpalindromicsubstring;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        Set<String> palindromes = new HashSet<>();

        String basicWord;

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length + 1; j++) {
                basicWord = s.substring(i, j);
                if (isPalindrome(basicWord)) {
                    palindromes.add(basicWord);
                }
            }
        }

        return palindromes.stream()
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    private boolean isPalindrome(String word) {

        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
