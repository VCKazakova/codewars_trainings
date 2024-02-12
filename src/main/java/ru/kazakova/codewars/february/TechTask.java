package ru.kazakova.codewars.february;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TechTask {

    /**
     * Kata.triangle("B") == 'B'
     * Kata.triangle("GB") == 'R'
     * Kata.triangle("RRR") == 'R'
     * Kata.triangle("RGBG") == 'B'
     * Kata.triangle("RBRGBRB") == 'G'
     * Kata.triangle("RBRGBRBGGRRRBGBBBGG") == 'G'
     * <p>
     * <p>
     * R R G B R G B B
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
        // повторить с 1 пункта пока не останется 1 буква
        if (row.isBlank() || 1 == row.length()) {
            return row.charAt(0);
        }
        // получила массив
        String[] splitRow = row.split("");
        List<String> listForGenerateColours = Arrays.stream(splitRow).toList();

        List<String> listOfColours = generateListColours(listForGenerateColours);

        while (listOfColours.size() != 1) {
            listOfColours = generateListColours(listOfColours);
        }
        return listOfColours.get(0).charAt(0);
    }

    private static List<String> generateListColours(List<String> splitRow) {
        // итерация
        List<String> listOfColours = new ArrayList<>();
        for (int i = 0; i < splitRow.size() - 1; i++) {
            // генерация нужной буквы по условию
            String result = generateLetter(splitRow.get(i), splitRow.get(i + 1));
            // записывать получившиеся буквы в массив
            listOfColours.add(result);
        }
        return listOfColours;
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
        throw new RuntimeException("Неожиданное поведение");
    }


}
