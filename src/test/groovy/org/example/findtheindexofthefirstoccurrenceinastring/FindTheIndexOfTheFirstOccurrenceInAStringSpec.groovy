package org.example.findtheindexofthefirstoccurrenceinastring


import spock.lang.Specification

class FindTheIndexOfTheFirstOccurrenceInAStringSpec extends Specification {

    def solution = new FindTheIndexOfTheFirstOccurrenceInAString();

    def "should find the index of the first occurrence in a string"() {

        expect:
        solution.strStr(haystack, needle) == result

        where:
        haystack    | needle  || result
        'sadbutsad' | "sad"   || 0
        'leetcode'  | "leeto" || -1
    }
    }