package ru.kazakova.codewars.january;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scramblies {

    /**
     * https://www.codewars.com/kata/55c04b4cc56a697bb0000048/train/java
     * Complete the function scramble(str1, str2) that returns true if a portion of str1
     * characters can be rearranged to match str2, otherwise returns false.
     * <p>
     * Notes:
     * <p>
     * Only lower case letters will be used (a-z). No punctuation or digits will be included.
     * Performance needs to be considered.
     * Examples
     * scramble('rkqodlw', 'world') ==> True
     * scramble('cedewaraaossoqqyt', 'codewars') ==> True
     * scramble('katas', 'steak') ==> False
     */

    public static boolean scramble(String str1, String str2) {
        // str2 должна содержаться в str1
        // сплитуем строку поиска и смотрим, что каждая буква есть в строке
        List<Character> characters = new ArrayList<>();
        for (char c : str1.toCharArray()) {
            characters.add(c);
        }
        for (char c : str2.toCharArray()) {
            if (!characters.remove(Character.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    // с оптимизацией
    public static boolean scramble2(String str1, String str2) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Заполняем Map для каждого символа в str1
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Пытаемся уменьшить счетчики для каждого символа в str2
        for (char c : str2.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return false; // Символа нет в str1
            }
            charCount.put(c, count - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("scriptjavx", "javascript"));
    }


}
