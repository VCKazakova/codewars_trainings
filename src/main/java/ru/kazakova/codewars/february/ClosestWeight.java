package ru.kazakova.codewars.february;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosestWeight {

    /**
     * https://www.codewars.com/kata/5868b2de442e3fb2bb000119/train/java
     * <p>
     * nput
     * a string strng of n positive numbers (n = 0 or n >= 2)
     * Let us call weight of a number the sum of its digits. For example 99 will have "weight" 18, 100 will have "weight" 1.
     * <p>
     * Two numbers are "close" if the difference of their weights is small.
     * <p>
     * Task:
     * For each number in strng calculate its "weight" and then find two numbers of strng that have:
     * <p>
     * the smallest difference of weights ie that are the closest
     * with the smallest weights
     * and with the smallest indices (or ranks, numbered from 0) in strng
     * Output:
     * an array of two arrays, each subarray in the following format:
     * [number-weight, index in strng of the corresponding number, original corresponding number in strng]
     * <p>
     * or a pair of two subarrays (Haskell, Clojure, FSharp) or an array of tuples (Elixir, C++)
     * <p>
     * or a (char*) in C or a string in some other languages mimicking an array of two subarrays or a string
     * <p>
     * or a matrix in R (2 rows, 3 columns, no columns names)
     * <p>
     * The two subarrays are sorted in ascending order by their number weights if these weights are different,
     * by their indexes in the string if they have the same weights.
     */

    /**
     * твой код должен вернуть два числа из строки strng, у которых:
     * <p>
     * Наименьшая разница в весах (то есть они наиболее близки по весу).
     * Наименьший вес.
     * Наименьший индекс (или ранг, начиная с 0) в строке strng.
     * <p>
     * strng = "103 123 4444 99 2000"
     * the weights are 4, 6, 16, 18, 2 (ie 2, 4, 6, 16, 18)
     * <p>
     * closest should return [[2, 4, 2000], [4, 0, 103]] (or ([2, 4, 2000], [4, 0, 103])
     * or [{2, 4, 2000}, {4, 0, 103}] or ... depending on the language)
     */

    public static int[][] closest(String strng) {
        // посчитать вес для каждого числа
        String[] splitNumbers = strng.split(" ");
        List<Integer> weights = new ArrayList<>();
        for (int i = 0; i < splitNumbers.length; i++) {
            System.out.println("number " + splitNumbers[i]);
            int weight = splitNumbers[i].chars()
                    .map(Character::getNumericValue)
                    .sum();
            System.out.println(weight);
            weights.add(weight);
        }
        // найти 2 числа с наименьшей разницей в весах
        Map<Integer, List<Integer>> numbers = getMap(weights);

        if (numbers.isEmpty()) {
            Collections.reverse(weights);
            numbers = getMap(weights);
        }

        Integer min = Collections.min(numbers.keySet());

        System.out.println(numbers.get(min));
        // само число

        return null;
    }

    public static Map<Integer, List<Integer>> getMap(List<Integer> weights) {
        Map<Integer, List<Integer>> numbers = new HashMap<>();
        for (int i = 1; i < weights.size() - 1; i++) {
            int difference = weights.get(i) - weights.get(i + 1);
            if (difference > 0) {
                numbers.put(difference, List.of(weights.get(i), weights.get(i + 1)));
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        closest("10 12 1009 1555");
    }

}
