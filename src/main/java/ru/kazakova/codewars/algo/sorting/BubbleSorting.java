package ru.kazakova.codewars.algo.sorting;

import java.util.Arrays;

public class BubbleSorting {

    /**
     * при сортировки пузырьком элементы массива переставляются
     * до тех пор, пока массив не будет отсортирован
     * для этого используется флаг isSorted
     * прохождение по массиву начинается с индекса 1
     */
    public static int[] bubbleSorting(int[] ints) {
        if (ints.length == 1 || ints.length == 0) {
            return ints;
        }
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < ints.length; i++) {
                if (ints[i] < ints[i-1]) {
                    int temp = ints[i];
                    ints[i] = ints[i-1];
                    ints[i -1] = temp;
                    isSorted = false;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSorting(new int[]{8, 3, 0, 12, 9, 5, 7})));
    }

}
