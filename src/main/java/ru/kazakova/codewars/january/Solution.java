package ru.kazakova.codewars.january;

import java.util.Stack;

public class Solution {

    /**
     * https://www.codewars.com/kata/5a793fdbfd8c06d07f0000d5/train/java
     * Consider the following expansion:
     *
     * solve("3(ab)") = "ababab"     -- because "ab" repeats 3 times
     * solve("2(a3(b))") = "abbbabbb" -- because "a3(b)" == "abbb", which repeats twice.
     * Given a string, return the expansion of that string.
     *
     * Input will consist of only lowercase letters and numbers (1 to 9) in valid parenthesis.
     * There will be no letters or numbers after the last closing parenthesis.
     *
     * More examples in test cases.
     *
     * Good luck!
     *
     * Please also try Simple time difference
     */

    public static String solve(String s) {

//        Инициализация: Создайте пустой стек для хранения символов.
//        Обход строки: Пройдитесь по каждому символу во входной строке.
//                Обработка символов:
//        Если текущий символ - буква, добавьте её во временную строку.
//        Если текущий символ - цифра, обновите повторяющуюся подстроку.
//        Если текущий символ - открывающая скобка, положите текущую временную строку и повторяющуюся подстроку в стек,
//        затем сбросьте временную строку и повторяющуюся подстроку.
//        Если текущий символ - закрывающая скобка, извлеките последнюю временную строку и повторяющуюся подстроку из стека,
//        затем обновите временную строку.
//        Формирование результата: Сформируйте итоговую строку на основе временной строки и повторяющейся подстроки.

        Stack<String> stack = new Stack<>();
        StringBuilder notConstantString = new StringBuilder();
        StringBuilder repeatableString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char elem = s.charAt(i);
            if (Character.isAlphabetic(elem)) {
                notConstantString.append(elem);
            } else if (Character.isDigit(elem)) {

            }
        }
        return s;
    }

    public static void main(String[] args) {
        solve("k(a3(b(a2(c))))");
    }

}
