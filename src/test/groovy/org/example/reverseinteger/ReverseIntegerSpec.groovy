package org.example.reverseinteger


import spock.lang.Specification

class ReverseIntegerSpec extends Specification {

    def integerService = new ReverseInteger();

    def "should return reversed integer"() {

        expect:
        integerService.reverse(number as int) == result

        where:
        number     || result
        121        || 121
        -121       || -121
        10         || 1
        123        || 321
        -123       || -321
        120        || 21
        9646324351 || 0
    }
}
