package ru.kazakova.codewars.december;

import java.util.Arrays;

import static java.util.Objects.nonNull;

public class StringSplit {

    /**
     * https://www.codewars.com/kata/515de9ae9dcfc28eb6000001/train/java
     * Complete the solution so that it splits the string into pairs of two characters.
     * If the string contains an odd number of characters then it should replace the missing second
     * character of the final pair with an underscore ('_').
     *
     * Examples:
     *
     * * 'abc' =>  ['ab', 'c_']
     * * 'abcdef' => ['ab', 'cd', 'ef']
     */

    public static String[] solution(String s) {
        StringBuilder builder = new StringBuilder();
        if (nonNull(s)) {
            String newStr = s;
            int sLength = s.length();
            int splitLength = 2;
            if (sLength % 2 != 0) {
                newStr = newStr + "_";
            }
            for (int i = 0; i < newStr.length(); i += splitLength) {
                int endIndex = Math.min(i + splitLength, newStr.length());
                String substring = newStr.substring(i, endIndex);
                builder.append(substring);
                builder.append("!");
            }
        }
        return builder.toString().split("!");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
    }

}
