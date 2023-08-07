package org.example.reverseinteger;

public class ReverseInteger {

    public int reverse(int x) {
        try {
            if (x < 0) {
                int reversedNumber = Math.abs(reverseNumber(Math.abs(x)));
                return reversedNumber *= -1;
            }
            return Math.abs(reverseNumber(x));
        }catch (NumberFormatException e){
            return 0;
        }
    }

    private int reverseNumber(int number) {

        StringBuilder stringBuilder = new StringBuilder();

        return Integer.parseInt(stringBuilder.append(number).reverse().toString());
    }
}
