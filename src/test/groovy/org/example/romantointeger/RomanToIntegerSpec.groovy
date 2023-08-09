package org.example.romantointeger


import spock.lang.Specification

class RomanToIntegerSpec extends Specification {

    def solution = new RomanToInteger()

    def "should convert string to integer"() {

        expect:
        solution.romanToInt(number) == result

        where:
        number    || result
        "I"       || 1
        "III"     || 3
        "XI"      || 11
        "MCMXCIV" || 1994
    }
}
