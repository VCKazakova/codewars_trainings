package ru.kazakova.codewars.january;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureTester {

    /**
     * https://www.codewars.com/kata/526dbd6c8c0eb53254000110/train/java
     * In this example you have to validate if a user input string is alphanumeric.
     * The given string is not nil/null/NULL/None, so you don't have to check that.
     * <p>
     * The string has the following conditions to be alphanumeric:
     * <p>
     * At least one character ("" is not valid)
     * Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
     * No whitespaces / underscore
     */

    public static boolean alphanumeric(String s) {
        if (s.isBlank()) {
            return false;
        }
        String reg = "^[a-zA-Z0-9]*$";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(alphanumeric("_=udb"));
        System.out.println(alphanumeric("YT89io"));
    }

}
