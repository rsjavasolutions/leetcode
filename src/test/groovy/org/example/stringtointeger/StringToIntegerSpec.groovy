package org.example.stringtointeger


import spock.lang.Specification

class StringToIntegerSpec extends Specification {

    def solution = new StringToInteger();

    def "should convert string to integer"() {

        expect:
        solution.myAtoi(number) == result

        where:
        number                 || result
        "42"                   || 42
        "   -42"               || -42
        "4193 with words"      || 4193
        "-91283472332"         || -2147483648
        "3.14159"              || 3
        "20000000000000000000" || 2147483647
    }
}
