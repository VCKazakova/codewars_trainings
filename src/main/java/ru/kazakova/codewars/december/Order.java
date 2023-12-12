package ru.kazakova.codewars.december;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {

    /**
     * Your task is to sort a given string. Each word in the string will contain a single number.
     * This number is the position the word should have in the result.
     * <p>
     * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
     * <p>
     * If the input string is empty, return an empty string.
     * The words in the input String will only contain valid consecutive numbers.
     * <p>
     * Examples
     * "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
     * "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
     * ""  -->  ""
     */

    // на вход даны слова с цифрами
    // расставить слова в соответствии с последовательностью
    // если строка пустая - вернуть ее
    // сплитануть строку на слова - массив слов
    // сделать стрим из массива
    // отсортировать элементы массива по цифрам в слове
    // записать слова в мапу? ключ - цифра, значение строка
    public static String order(String words) {
        if (words.isBlank()) {
            return words;
        }
        String[] s = words.split(" ");
        Map<Integer, String> stringStorages = new HashMap<>();
        for (String value : s) {
            Pattern pattern = Pattern.compile("\\d{1,}");
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                String foundNumber = matcher.group(0);
                stringStorages.put(Integer.valueOf(foundNumber), value);
            }
        }
        return String.join(" ", stringStorages.values());
    }

    public static void main(String[] args) {
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
    }

}
