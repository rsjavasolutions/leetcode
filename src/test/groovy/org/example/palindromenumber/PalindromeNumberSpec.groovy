package org.example.palindromenumber


import spock.lang.Specification

class PalindromeNumberSpec extends Specification {

    def palindrome = new PalindromeNumber();

    def "should return return true if x is a palindrome and false otherwise"() {

        expect:
        palindrome.isPalindrome(number) == result

        where:
        number || result
        121    || true
        -121   || false
        10     || false
    }
}
