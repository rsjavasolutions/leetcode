package org.example.validparentheses


import spock.lang.Specification

class ValidParenthesesSpec extends Specification {

    def solution = new ValidParentheses()

    def "should determine if the input string is valid"() {

        expect:
        solution.isValid(brackets) == result

        where:
        brackets || result
        "()"     || true
        "()[]{}" || true
        "(]"     || false
    }
}