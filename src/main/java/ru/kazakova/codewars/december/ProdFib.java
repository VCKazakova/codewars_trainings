package ru.kazakova.codewars.december;

public class ProdFib {

    /**
     * https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/java
     *
     * The Fibonacci numbers are the numbers in the following integer sequence (Fn):
     *
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
     *
     * such as
     *
     * F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
     *
     * Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying
     *
     * F(n) * F(n+1) = prod.
     *
     * Your function productFib takes an integer (prod) and returns an array:
     *
     * [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
     * depending on the language if F(n) * F(n+1) = prod.
     *
     * If you don't find two consecutive F(n) verifying F(n) * F(n+1) = prodyou will return
     *
     * [F(n), F(n+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
     * F(n) being the smallest one such as F(n) * F(n+1) > prod.
     *
     * Some Examples of Return:
     * (depend on the language)
     *
     * productFib(714) # should return (21, 34, true),
     *                 # since F(8) = 21, F(9) = 34 and 714 = 21 * 34
     *
     * productFib(800) # should return (34, 55, false),
     *                 # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
     * -----
     * productFib(714) # should return [21, 34, true],
     * productFib(800) # should return [34, 55, false],
     * -----
     * productFib(714) # should return {21, 34, 1},
     * productFib(800) # should return {34, 55, 0},
     * -----
     * productFib(714) # should return {21, 34, true},
     * productFib(800) # should return {34, 55, false},
     * Note:
     * You can see examples for your language in "Sample Tests".
     */

    /**
     * Это задание предполагает создание функции, которая принимает число prod в качестве
     * аргумента и возвращает массив (или другую структуру данных) из двух
     * последовательных чисел Фибоначчи, а также булево значение,
     * которое указывает, является ли произведение этих двух чисел равным prod.
     */

    // на входе число, у которого нужно найти множители для этого числа
    // если множетили этого числа - последовательные числа фибоначи, вернуть их и 1
    // если нет, то вернуть их и 0
    public static long[] productFib(long prod) {
        // your code
        return null;
    }

    // найти наибольшие множители
    public static void findLargestFactors(long number) {
        long factor1 = 1;
        long factor2 = 1;

        for (long i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                factor1 = i;
                number /= i;
            }
        }

        if (number > 1 && number > factor1) {
            factor2 = number;
        }

        if (factor1 != 1 && factor2 != 1) {
            System.out.println(factor1 + " и " + factor2);
        } else {
            System.out.println("Для заданного числа не удалось найти два самых больших множителя.");
        }
    }

    // на вход порядковый номер числа фибоначи
    // возвращает число фибоначи по счету
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(10));
        findLargestFactors(800);
    }

}
