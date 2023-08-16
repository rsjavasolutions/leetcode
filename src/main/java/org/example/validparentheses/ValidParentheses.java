package org.example.validparentheses;

public class ValidParentheses {
    public boolean isValid(String s) {

        if (s == null || isOdd(s.length())) {
            return false;
        }

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        }

        return s.isEmpty();
    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
