package org.example.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanValues.get(s.charAt(i));
            if (currentValue >= prevValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }

            prevValue = currentValue;
        }
        return result;
    }
}
