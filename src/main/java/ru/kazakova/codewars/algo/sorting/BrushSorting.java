package ru.kazakova.codewars.algo.sorting;

import java.util.Arrays;

public class BrushSorting {

    /**
     * алгоритм основан на сортировке пузырьком
     * при сортировки расческой элементы массива
     * на заданном друг от друга расстоянии переставляются
     * до тех пор, пока массив не будет отсортирован
     * для этого используется gap, принимающее длину массива,
     * а затем вычисляющиеся по формуле
     * для этого используется флаг isSorted
     * прохождение по массиву начинается с индекса gap
     */
    public static int[] brushSorting(int[] ints) {
        if (ints.length == 1 || ints.length == 0) {
            return ints;
        }
        // вводим значение gap - расстояние на котором расположены элементы
        int gap = ints.length;

        boolean isSorted = false;
        // добавляем условие про промежуток
        while (!isSorted || gap != 1) {
            if (gap > 1) {
                // вычисляем промежуток, если он > 1
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            isSorted = true;
            // проходимся по массиву от индекса равного промежутку
            for (int i = gap; i < ints.length; i++) {
                if (ints[i] < ints[i - gap]) {
                    int temp = ints[i];
                    ints[i] = ints[i - gap];
                    ints[i - gap] = temp;
                    isSorted = false;
                }
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(brushSorting(new int[]{8, 3, 0, 12, 9, 5, 7})));
    }


}
