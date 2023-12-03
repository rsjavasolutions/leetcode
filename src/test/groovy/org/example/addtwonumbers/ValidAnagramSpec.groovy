package org.example.addtwonumbers

import spock.lang.Specification

class ValidAnagramSpec extends Specification {

    def solution = new Solution();

    def "should add the two numbers and return the sum as a linked list."() {

        expect:
        solution.addTwoNumbers(node1, node2) == result

        where:
        node1                                             | node2                                             || result
        new ListNode(2, new ListNode(4, new ListNode(3))) | new ListNode(5, new ListNode(6, new ListNode(4))) || new ListNode(7, new ListNode(0, new ListNode(8)))
        new ListNode(0)                                   | new ListNode(0)                                   || new ListNode(0)
        new ListNode(1, new ListNode(1, new ListNode(1))) | new ListNode(1, new ListNode(1, new ListNode(1))) || new ListNode(2, new ListNode(2, new ListNode(2)))

    }
}

