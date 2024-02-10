package ru.kazakova.codewars.february.yan;

import java.util.ArrayList;
import java.util.List;

public class OneLength {

    public static void main(String[] args) {
        System.out.println(countLength("111119999000333000"));
    }

    /**
     * Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.
     *
     * Желательно получить решение, работающее за линейное время и при этом проходящее по входному массиву только один раз.
     *
     * Формат ввода
     * Первая строка входного файла содержит одно число n, n ≤ 10000. Каждая из следующих n строк
     * содержит ровно одно число — очередной элемент массива.
     *
     * Формат вывода
     * Выходной файл должен содержать единственное число — длину самой длинной последовательности единиц
     * во входном массиве.
     *
     * input
     * 5
     * 1
     * 0
     * 1
     * 0
     * 1
     * output
     * 1
     *
     *
     *
     * найти самую длинную последовательность единиц и вывести длину
     */
    public static int countLength(String s) {
        int length = 0;
        String[] splitS = s.split("");
        List<String> list = new ArrayList<>();
        return length;
    }

}
