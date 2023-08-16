package org.example.dividetwointegers


import spock.lang.Specification

class DivideTwoIntegersSpec extends Specification {

    def solution = new DivideTwoIntegers();

    def "should  divide two integers"() {

        expect:
        solution.divide(dividend as int, divisor) == result

        where:
        dividend    | divisor || result
        10          | 3       || 3
        7           | -3      || -2
        -2147483648 | -1      || 2147483647
    }
}