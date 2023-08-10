package org.example.longestcommonprefix


import spock.lang.Specification

class LongestCommonPrefixSpec extends Specification {

    def solution = new LongestCommonPrefix();

    def "should find the longest common prefix string amongst an array of strings."() {

        expect:
        solution.longestCommonPrefix(s) == result

        where:
        s                                        || result
        ["flower", "flow", "flight"] as String[] || 'fl'
        ["dog", "racecar", "car"] as String[]    || ''
    }
}
