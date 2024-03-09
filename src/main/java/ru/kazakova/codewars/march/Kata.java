package ru.kazakova.codewars.march;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.nonNull;

public class Kata {


    /**
     * https://www.codewars.com/kata/52efefcbcdf57161d4000091/train/java
     * The main idea is to count all the occurring characters in a string.
     * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
     * <p>
     * What if the string is empty? Then the result should be empty object literal, {}.
     */


    public static Map<Character, Integer> count(String str) {
        // посчитать количество каждой буквы в строке
        // разделить строку на буквы
        // пройтись по буквам и посчитать
        Map<Character, Integer> lettersMap = new HashMap<>();
        if (str.length() == 0) {
            return lettersMap;
        }
        String[] letters = str.split("");
        for (int i = 0; i < letters.length; i++) {
            Integer value = lettersMap.get(letters[i].charAt(0));
            if (nonNull(value)) {
                lettersMap.put(letters[i].charAt(0), value + 1);
            } else {
                lettersMap.put(letters[i].charAt(0), 1);
            }
        }
        return lettersMap;
    }

    public static void main(String[] args) {
        System.out.println(count("accyeib"));
    }


}
