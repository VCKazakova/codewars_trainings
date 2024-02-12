package ru.kazakova.codewars.february.yan;

import java.util.Arrays;
import java.util.stream.Stream;

public class MiddleInt {

    /**
     * https://coderun.yandex.ru/problem/median-out-of-three?currentPage=1&pageSize=10&rowNumber=1
     * <p>
     * Рассмотрим три числа aa, bb и cc. Упорядочим их по возрастанию.
     * <p>
     * Какое число будет стоять между двумя другими?
     */

    public static void main(String[] args) {
        System.out.println(getMiddleInt(5, 8, 1));
        System.out.println(getMiddleInt2(5, 8, 1));
        System.out.println(getMiddleInt2(1, 8, 5));
        System.out.println(getMiddleInt2(3, 2, 1));
        System.out.println(getMiddleInt2(4, 2, 1));
    }

    public static int getMiddleInt(int a, int b, int c) {
        Object[] objects = Stream.of(a, b, c)
                .sorted()
                .toArray();

        return (int) objects[1];
    }

    public static int getMiddleInt2(int a, int b, int c) {

        int[] arrInt = new int[]{a, b, c};
        sort(arrInt);

        return arrInt[1];
    }

    private static void sort(int[] arrInt) {
        int minIndex = 0;
        int minElem = arrInt[0];

        // Находим индекс минимального элемента в массиве
        for (int i = 1; i < arrInt.length; i++) {
            if (arrInt[i] < minElem) {
                minElem = arrInt[i];
                minIndex = i;
            }
        }

        // Если минимальный элемент не находится в начале массива, меняем его местами с первым элементом
        if (minIndex != 0) {
            int temp = arrInt[0];
            arrInt[0] = arrInt[minIndex];
            arrInt[minIndex] = temp;
        }

        // Сортируем оставшиеся элементы
        Arrays.sort(arrInt, 1, arrInt.length);
    }

}
