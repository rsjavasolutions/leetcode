package org.example.longestsubstringwithoutrepeating


import spock.lang.Specification

class LongestSubstringWithoutRepeatingCharactersSpec extends Specification {

    def computer = new LongestSubstringWithoutRepeatingCharacters();

    def "should find find the length of the longest substring without repeating characters."() {

        expect:
        computer.lengthOfLongestSubstring(s) == result

        where:
        s          || result
        'abcabcbb' || 3
        'bbbbb'    || 1
        'pwwkew'   || 3
    }
}
