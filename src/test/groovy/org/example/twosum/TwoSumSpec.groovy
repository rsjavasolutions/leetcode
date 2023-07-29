package org.example.twosum

import spock.lang.Specification

class TwoSumSpec extends Specification {

    def calculator = new TwoSum();

    def "should find indices of the two numbers such that they add up to target"() {

        expect:
        calculator.twoSum(nums, target) == result

        where:
        nums                          | target || result
        [2, 7, 11, 15] as int[]       | 9      || [0, 1] as int[]
        [3, 2, 4] as int[]            | 6      || [1, 2] as int[]
        [3, 2, 4] as int[]            | 6      || [1, 2] as int[]
        [3, 3] as int[]               | 6      || [0, 1] as int[]
        [-1, -2, -3, -4, -5] as int[] | -8     || [2, 4] as int[]
    }
}
