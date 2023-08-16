package org.example.lengthoflastword;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String trimmedWord = s.trim();
        String[] words = trimmedWord.split("\\s+");

        return words[words.length - 1].length();
    }
}
