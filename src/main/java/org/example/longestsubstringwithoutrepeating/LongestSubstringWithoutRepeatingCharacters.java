package org.example.longestsubstringwithoutrepeating;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int pointerA = 0;
        int pointerB = 0;
        int max = 0;

        Set<Character> chars = new HashSet<>();

        while (pointerB < s.length()) {
            if (!chars.contains(s.charAt(pointerB))) {
                chars.add(s.charAt(pointerB));
                pointerB++;
                max = Math.max(max, pointerB - pointerA);
            } else {
                chars.remove(s.charAt(pointerA));
                pointerA++;
            }
        }
        return max;
    }
}
