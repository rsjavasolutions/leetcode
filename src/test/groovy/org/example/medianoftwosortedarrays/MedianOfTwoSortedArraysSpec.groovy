package org.example.medianoftwosortedarrays


import spock.lang.Specification

class MedianOfTwoSortedArraysSpec extends Specification {

    def calculator = new MedianOfTwoSortedArrays();

    def "should return the median of the two sorted arrays"() {

        expect:
        calculator.findMedianSortedArrays(nums1, nums2) == result

        where:
        nums1                    | nums2                    || result
        [1, 3] as int[]          | [2] as int[]             || 2.0
        [1, 2] as int[]          | [3, 4] as int[]          || 2.5
        [5, 5, 5, 5, 5] as int[] | [5, 5, 5, 5, 5] as int[] || 5.0
    }
}
