package org.example.longestpalindromicsubstring


import spock.lang.Specification

class LongestPalindromicSubstringSpec extends Specification {

    def palindromicSubstring = new LongestPalindromicSubstring();

    def "should find find the length of the longest substring without repeating characters."() {

        expect:
        palindromicSubstring.longestPalindrome(s) == result

        where:
        s       || result
        'babad' || 'aba'
        'cbbd'  || 'bb'
        'a'     || 'a'
        'bb'    || 'bb'
        'abb'   || 'bb'
    }
}
