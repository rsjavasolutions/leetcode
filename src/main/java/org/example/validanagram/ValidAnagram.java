package org.example.validanagram;

import java.util.Map;
import java.util.TreeMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        return countOccurrences(s).equals(countOccurrences(t));

    }

    private static Map<Character, Integer> countOccurrences(String s) {
        Map<Character, Integer> occurrences = new TreeMap<>();
        for (char c : s.toCharArray()) {
            occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
        }
        return occurrences;
    }
}
