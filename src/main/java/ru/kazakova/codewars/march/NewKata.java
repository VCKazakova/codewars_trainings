package ru.kazakova.codewars.march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class NewKata {

    /**
     * https://www.codewars.com/kata/52bc74d4ac05d0945d00054e/train/java
     * Write a function named first_non_repeating_letter† that takes a string input, and returns the first
     * character that is not repeated anywhere in the string.
     *
     * For example, if given the input 'stress', the function should return 't', since the letter t only
     * occurs once in the string, and occurs first in the string.
     *
     * As an added challenge, upper- and lowercase letters are considered the same character, but the function should
     * return the correct case for the initial letter. For example, the input 'sTreSS' should return 'T'.
     *
     * If a string contains all repeating characters, it should return an empty string ("");
     *
     * † Note: the function is called firstNonRepeatingLetter for historical reasons, but your function
     * should handle any Unicode character.
     */


    /**
     * вернуть первую букву, которая встречается в строке и больше не повторяется
     * 'stress' -> 't'
     */
    public static String firstNonRepeatingLetter(String s) {
        // если все буквы повторяются - вернуть ""
        // вернуть букву в том регистре, в котором она указана
        // разделить строку
        // сложить в лист
        String lowerStr = s.toLowerCase(Locale.ROOT);
        String[] splitStr = lowerStr.split("");
        List<String> listStr = new ArrayList<>(Arrays.asList(splitStr));
        Map<String, List<Integer>> letters = new LinkedHashMap<>();
        for (int i = 0; i < listStr.size(); i++) {
            List<Integer> integers = new ArrayList<>();
            if (letters.containsKey(listStr.get(i))) {
                Integer valueofOccur = letters.get(listStr.get(i)).get(0) + 1;
                integers.add(valueofOccur);
                // добавляем индекс элемента
                integers.add(i);
                letters.put(listStr.get(i), integers);
            } else {
                integers.add(1);
                integers.add(i);
                letters.put(listStr.get(i), integers);
            }
        }
        Collection<List<Integer>> values = letters.values();
        // найти лист, в котором первый элемент 1
        // по второму элементу - индексу, вернуть значение из строки
        Optional<List<Integer>> first = values.stream()
                .filter(l -> l.get(0) == 1)
                .findFirst();

        if (first.isPresent()) {
            List<Integer> listWithLetter = first.get();
            Integer indexLetterInString = listWithLetter.get(1);
            List<String> s1 = List.of(s.split(""));
            return s1.get(indexLetterInString);
        }
        return "";
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("moonmoon"));
    }

}
