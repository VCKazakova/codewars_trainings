package ru.kazakova.codewars.december;

import java.util.Arrays;

public class NumberZooPatrol {

    /**
     * https://www.codewars.com/kata/5276c18121e20900c0000235/solutions/java
     * You're working in a number zoo, and it seems that one of the numbers has gone missing!
     * <p>
     * Zoo workers have no idea what number is missing, and are too incompetent to figure it out,
     * so they're hiring you to do it for them.
     * <p>
     * In case the zoo loses another number, they want your program to work regardless of how many numbers there are
     * in total.
     * <p>
     * Task:
     * Write a function that takes a shuffled list of unique numbers from 1 to n with one element
     * missing (which can be any number including n). Return this missing number.
     * <p>
     * Note: huge lists will be tested.
     * <p>
     * [1, 3, 4]  =>  2
     * [1, 2, 3]  =>  4
     * [4, 2, 3]  =>  1
     */

    // проверить последовательность чисел всего массива
    // если текущее со следующим имеют разницу больше единицы - вернуть текущее + 1
    // если таких случаев нет проверяем первый элемент - если он не единица - вернем единицу
    // что делать, если передан пустой массив?
    // как улучшить перфоманс?
    public static int findMissingNumber(int[] numbers) {
        // поиск перебором (долго)
        int[] sortedNumbers = Arrays.stream(numbers)
                .sorted()
                .toArray();

        if (sortedNumbers[0] != 1) {
            return 1;
        }

        for (int i = 0; i < sortedNumbers.length; i++) {
            int current = sortedNumbers[i];
            int next = sortedNumbers[i + 1];
            if (next - current > 1) {
                return current + 1;
            }
        }
        return sortedNumbers[sortedNumbers.length - 1] + 1;
    }

    public static int findMissingNumberPerfomance(int[] numbers) {
        // определение числа элементов массива вместе с пропущенным (длина массива + 1)
        int n = numbers.length + 1;

        // вычисляет ожидаемую сумму элементов от 1 до n по формуле для суммы арифметической прогрессии
        long expectedSum = (long)n * (n + 1) / 2;

        // Вычисляем сумму массива
        long actualSum = Arrays.stream(numbers).asLongStream().sum();

        // Разница между ожидаемой и фактической суммой даст нам недостающее число
        return (int)(expectedSum - actualSum);
    }


    public static void main (String[]args){
            System.out.println(findMissingNumber(new int[]{1, 2, 3, 5}));
            System.out.println(findMissingNumber(new int[]{13, 11, 10, 3, 2, 1, 4, 5, 6, 9, 7, 8}));
        }

    }
