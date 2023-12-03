package org.example.validanagram


import spock.lang.Specification

class ValidAnagramSpec extends Specification {

    def solution = new ValidAnagram()

    def "should valid anagram"() {

        expect:
        solution.isAnagram(s, t) == result

        where:
        s            | t            || result
        'anagram'    | 'nagaram'    || true
        'rat'        | 'car'        || false
        'listen'     | 'silent'     || true
        'heart'      | 'earth'      || true
        'debit card' | 'bad credit' || true
        'triangle'   | 'integral'   || true
        'restful'    | 'fluster'    || true
        'hello'      | 'world'      || false
        'happy'      | 'sad'        || false
        'apple'      | 'orange'     || false
    }
}
