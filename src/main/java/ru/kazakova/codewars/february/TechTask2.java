package ru.kazakova.codewars.february;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class TechTask2 {

    /**
     * Kata.triangle("B") == 'B'
     * Kata.triangle("GB") == 'R'
     * Kata.triangle("RRR") == 'R'
     * Kata.triangle("RGBG") == 'B'
     * Kata.triangle("RBRGBRB") == 'G'
     * Kata.triangle("RBRGBRBGGRRRBGBBBGG") == 'G'
     * <p>
     * <p>
     * R R G B R G B B 1 R B R G B R B
     * R B R G B R B
     * G G B R G G
     * G R G B G
     * B B R R
     * B G R
     * R B
     * G
     * <p>
     * <p>
     * <p>
     * Colour here:            G G        B G        R G        B R
     * Becomes colour here:     G          R          B          G
     */

    public static void main(String[] args) {
        System.out.println(triangle("B"));
        System.out.println(triangle("GB"));
        System.out.println(triangle("RRR"));
        System.out.println(triangle("RGBG"));
        System.out.println(triangle("RBRGBRB"));
        System.out.println(triangle("RBRGBRBGGRRRBGBBBGG"));

    }

    public static char triangle(final String row) {
        if (row.isBlank() || 1 == row.length()) {
            return row.charAt(0);
        }
        // сплит строки
        // привести к нужной структуре данных
        Deque<Character> characters = Arrays.stream(row.split(""))
                .map(str -> str.charAt(0))
                .collect(Collectors.toCollection(LinkedList::new));
        Character divide = '1';
        // вытаскивать по-порядку, удаляя использованный элемент
        characters.addLast(divide);
        while (characters.size() !=2) {
            if (characters.getFirst().equals(divide)) {
                characters.pollFirst();
                characters.addLast(divide);
            }
            Character first = characters.pollFirst();
            Character second = characters.peekFirst();
            String resultStr = generateLetter(first.toString(), second.toString());
            characters.addLast(resultStr.charAt(0));
        }
        return characters.getLast();
    }


    private static String generateLetter(String letter1, String letter2) {
        // составить условия:
        // если b g -> r
        // если r g -> b
        // если b  r -> g

        // если letter1.eq(letter2)
        if (letter1.equals(letter2)) {
            return letter1;
        } else if (("B".equals(letter1) && "G".equals(letter2)) || ("B".equals(letter2) && "G".equals(letter1))) {
            return "R";
        } else if (("R".equals(letter1) && "G".equals(letter2)) || ("R".equals(letter2) && "G".equals(letter1))) {
            return "B";
        } else if (("B".equals(letter1) && "R".equals(letter2)) || ("B".equals(letter2) && "R".equals(letter1))) {
            return "G";
        }
        throw new RuntimeException("Неожиданное поведение " + letter1 + " " + letter2);
    }


}
