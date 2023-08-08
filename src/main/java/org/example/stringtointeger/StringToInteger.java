package org.example.stringtointeger;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        Pattern pattern = Pattern.compile("^[+-]?\\d+");
        Matcher matcher = pattern.matcher(s);

        if (matcher.find()) {
            try {
                BigInteger result = new BigInteger(matcher.group());
                if (result.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0) {
                    return Integer.MAX_VALUE;
                } else if(result.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE))) < 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return result.intValue();
                }
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }
}