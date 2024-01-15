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

    /**
     * вариант кода без рекурсии
     */
    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        // Пока левая граница меньше или равна правой границе
        while (left <= right) {
            // Находим средний индекс
            int mid = left + (right - left) / 2;
            // Если средний элемент равен искомому элементу, возвращаем его индекс
            if (arr[mid] == x)
                return mid;
            // Если средний элемент меньше искомого, ищем в правой половине массива
            if (arr[mid] < x)
                left = mid + 1;
                // Если средний элемент больше искомого, ищем в левой половине массива
            else
                right = mid - 1;
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{19, 3, 0, 1, 4, 2, 10, 50};
        int[] ints1 = Arrays.stream(ints)
                .sorted()
                .toArray();
        System.out.println(doBinarySearch(ints1, 0, ints1.length - 1, 50));
        System.out.println(binarySearch(ints1, 50));
    }

}
