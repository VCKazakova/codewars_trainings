package ru.kazakova.codewars.december;

import java.util.HashMap;
import java.util.Map;

public class ConsonantValue {

    /**
     * https://www.codewars.com/kata/59c633e7dcc4053512000073/train/java
     *
     * Given a lowercase string that has alphabetic characters only and no spaces,
     * return the highest value of consonant substrings.
     * Consonants are any letters of the alphabet except "aeiou".
     *
     * We shall assign the following values: a = 1, b = 2, c = 3, .... z = 26.
     *
     * For example, for the word "zodiacs", let's cross out the vowels. We get: "z o d ia cs"
     *
     * -- The consonant substrings are: "z", "d" and "cs" and the values are z = 26, d = 4 and cs = 3 + 19 = 22.
     * The highest is 26.
     * solve("zodiacs") = 26
     *
     * For the word "strength", solve("strength") = 57
     * -- The consonant substrings are: "str" and "ngth" with values "str" = 19 + 20 + 18 = 57 and
     * "ngth" = 14 + 7 + 20 + 8 = 49. The highest is 57.
     * For C: do not mutate input.
     *
     * More examples in test cases. Good luck!
     *
     * If you like this Kata, please try:
     *
     * Word values
     *
     * Vowel-consonant lexicon
     */

    /**
     * Согласные буквы - это любые буквы алфавита, кроме "aeiou".
     * Каждой букве присвоено определенное значение: a = 1, b = 2, c = 3, ..., z = 26.
     * <p>
     * Пример:
     * <p>
     * Для слова "zodiacs" уберем гласные буквы и получим: "z o d ia cs".
     * Согласные подстроки: "z", "d" и "cs", и их значения равны соответственно 26, 4 и 22. Максимальное значение - 26.
     * <p>
     * Функция solve("zodiacs") должна вернуть 26.
     * <p>
     * Для слова "strength" согласные подстроки: "str" и "ngth" с соответствующими значениями 57 и 49.
     * Максимальное значение - 57.
     * <p>
     * Функция solve("strength") должна вернуть 57.
     */

    // для каждой буквы определить число - мапа?
    // из строки убрать гласные
    // найти подстроки с максимальной суммой в строке
    public static int solve(final String s) {

        // определили мапу с числами
        Map<String, Integer> letterMap = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            char consonant = alphabet.charAt(i);
            int position = i + 1;
            letterMap.put(String.valueOf(consonant), position);
        }

        // понять какие числа есть в строке
        // сплит строки на подстроки по гласным
        String[] split = s.split("[aeiouAEIOU]+");
        // перебираем подстроки и находим суммы для каждой
        // создаем мапу, в которую складываем - подстроку и сумму
        Map<String, Integer> stringSums = new HashMap<>();
        for (String e : split) {
            if (e.length() == 1) {
                stringSums.put(e, letterMap.get(e));
            } else {
                // ключ - подстрока
                // значение - сумма букв
//                Integer sum = 0;
//                e.chars()
//                        .map(r -> sum.)
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        solve("zodiacs");
    }

}
