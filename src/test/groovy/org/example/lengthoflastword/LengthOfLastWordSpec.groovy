package org.example.lengthoflastword


import spock.lang.Specification

class LengthOfLastWordSpec extends Specification {

    def solution = new LengthOfLastWord()

    def "should return the length of the last word in the string"() {

        expect:
        solution.lengthOfLastWord(s) == result

        where:
        s                             || result
        'Hello World'                 || 5
        '   fly me   to   the moon  ' || 4
        'luffy is still joyboy'       || 6
    }
}