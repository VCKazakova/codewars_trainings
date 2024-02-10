package ru.kazakova.codewars.february.yan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountSymbols {

    public static void main(String[] args) {
        System.out.println(countSymbols("ab", "aabbccd"));
    }

    /**
     * Даны две строки строчных латинских символов: строка J и строка S. Символы, входящие в строку J, — «драгоценности»,
     * входящие в строку S — «камни». Нужно определить, какое количество символов из S одновременно являются
     * «драгоценностями». Проще говоря, нужно проверить, какое количество символов из S входит в J.
     * Это разминочная задача, к которой мы размещаем готовые решения. Она очень простая и нужна для того,
     * чтобы вы могли познакомиться с нашей автоматической системой проверки решений.
     * Ввод и вывод осуществляется через файлы, либо через стандартные потоки ввода-вывода, как вам удобнее.
     *
     *
     * Формат ввода
     * На двух первых строках входного файла содержатся две строки строчных латинских символов: строка
     * J и строка S. Длина каждой не превосходит 100 символов.
     *
     * Формат вывода
     * Выходной файл должен содержать единственное число — количество камней, являющихся драгоценностями.
     *
     *
     *
     * посчитать сколько раз символы из строки s входят в строку j
     */
    public static int countSymbols(String s, String j) {
        int count = 0;
        String[] splitS = s.split("");
        List<String> strings = new ArrayList<>(Arrays.asList(j.split("")));
            for (int k = 0; k < splitS.length; k++) {
                while (strings.contains(splitS[k])) {
                    strings.remove(splitS[k]);
                    count++;
                }
            }
        return count;
    }

}
