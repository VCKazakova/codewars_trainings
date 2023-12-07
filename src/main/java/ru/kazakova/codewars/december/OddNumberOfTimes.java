package ru.kazakova.codewars.december;

import java.util.Arrays;

public class OddNumberOfTimes {

    /**
     * Найти число в массиве, которое повторяется нечетное количество раз
     * Given an array of integers, find the one that appears an odd number of times.
     * There will always be only one integer that appears an odd number of times.
     * <p>
     * Examples
     * [7] should return 7, because it occurs 1 time (which is odd).
     * [0] should return 0, because it occurs 1 time (which is odd).
     * [1,1,2] should return 2, because it occurs 1 time (which is odd).
     * [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
     * [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
     */


    public static int findIt(int[] a) {
        //проверить длину массива, если 1 - вернуть это число
        //отсортировать массив
        //если длина больше посчитать сколько раз повторяются числа
        //пройтись по массиву, и если текущий и слудующий элементы совпадают, посчитать сколько раз

        if (a.length == 1) {
            return a[0];
        }
        int[] sortedArray = Arrays.stream(a)
                .sorted()
                .toArray();

        int count = 1;
        for (int i = 0; i < sortedArray.length; i++) {
            int n1 = sortedArray[i];
            int n2 = sortedArray[i + 1];
            if (n1 == n2) {
                count++;
                continue;
            }
            if (sortedArray[i - 1] != sortedArray[i] && sortedArray[i] != sortedArray[i + 1]) {
                System.out.println(sortedArray[i]);
                return sortedArray[i];
            } else if (count % 2 != 0) {
                System.out.println(sortedArray[i - 1]);
                return sortedArray[i - 1];
            } else {
                count = 1;
            }
        }
        return 0;
    }

    public static int findIt2(int[] a) {
        if (a.length == 1) {
            return a[0];
        }
        // Сортируем массив
        Arrays.sort(a);

        int count = 1;

        // Проходим по отсортированному массиву
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                // Если текущий элемент совпадает со следующим, увеличиваем счетчик
                count++;
            } else {
                // Если текущий элемент не совпадает со следующим, проверяем четность счетчика
                if (count % 2 != 0) {
                    // Если счетчик нечетный, значит, текущее число встречается нечетное количество раз
                    return a[i];
                }
                count = 1; // Сбрасываем счетчик при переходе к новому числу
            }
        }
        // Последний элемент массива
        if (count % 2 != 0) {
            return a[a.length - 1];
        }
        return 0; // Возвращаем 0, если что-то пошло не так
    }


    public static void main(String[] args) {

//        assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
//        assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
//        assertEquals(10, FindOdd.findIt(new int[]{10}));
//        assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
//        assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));

        System.out.println(findIt2(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        System.out.println(findIt2(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
    }
}
