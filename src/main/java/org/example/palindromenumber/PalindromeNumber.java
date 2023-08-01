package org.example.palindromenumber;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        String reverseNumber = new StringBuilder(number).reverse().toString();

        return reverseNumber.equals(number);
    }
}
