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
     * на вход передаем массив и число интераций - оно при первом проходе = длине массива
     * каждый раз уменьшаем итерацию на 1 и складываем с предыдущим результатом
     */
    public static long sumOfArrayElements(int[] ints, int iter) {
        if (iter == 0) {
            return 0;
        }
        return ints[iter - 1] + sumOfArrayElements(ints, iter - 1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(5));

        int[] ints = new int[]{1, 2, 3};
        System.out.println(sumOfArrayElements(ints, ints.length));

        int[] ints2 = new int[]{5, 2, 10};
        System.out.println(sumOfArrayElements(ints2, ints.length));

        int[] ints3 = new int[]{9, 12, 20};
        System.out.println(sumOfArrayElements(ints3, ints.length));
    }


}
