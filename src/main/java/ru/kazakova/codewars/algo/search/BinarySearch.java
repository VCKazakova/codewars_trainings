package ru.kazakova.codewars.algo.search;

import java.util.Arrays;

public class BinarySearch {

    /**
     * алгоритм бинарного поиска работает только на отсортированном массиве
     * сначала искомый элемент сравнивается с средним элементом массива
     * если искомый элемент больше среднего, ищем его в правой части массива
     * если меньше - в левой
     */
    public static int doBinarySearch(int[] ints, int startIndex, int endIndex, int searchElement) {
        if (endIndex >= startIndex) {
            int middleindex = startIndex + (endIndex - startIndex) / 2;
            if (ints[middleindex] == searchElement) {
                return middleindex;
            }
            if (ints[middleindex] > searchElement) {
                return doBinarySearch(ints, startIndex, middleindex - 1, searchElement);
            } else {
                return doBinarySearch(ints, middleindex + 1, endIndex, searchElement);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{19, 3, 0, 1, 4, 2, 10, 50};
        int[] ints1 = Arrays.stream(ints)
                .sorted()
                .toArray();
        System.out.println(doBinarySearch(ints1, 0, ints1.length - 1, 50));
    }

}
