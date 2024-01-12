package ru.kazakova.codewars.algo;

public class Recursion {

    /**
     * рекурсия для получение факториала числа
     * факториал - это 3! = 3*2*1
     * прописываем условие выхода из рекурсии
     * прописываем рекурсию
     * */
    public static long getFactorial(int number) {
        if (1 == number || 0 == number) {
            return 1;
        }
        return number * getFactorial(number - 1);
    }

    /**
     * Рекурсивная функцию для вычисления суммы
     * элементов целочисленного массива.
     */
    public static long sumOfArrayElements(int[] ints) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(5));
    }


}
