package ru.kazakova.codewars.december;

public class SumOfDivided {

    /**
     * https://www.codewars.com/kata/54d496788776e49e6b00052f/train/java
     *
     * Given an array of positive or negative integers
     *
     *  I= [i1,..,in]
     *
     * you have to produce a sorted array P of the form
     *
     * [ [p, sum of all ij of I for which p is a prime factor (p positive) of ij] ...]
     *
     * P will be sorted by increasing order of the prime numbers.
     * The final result has to be given as a string in Java, C#, C, C++ and as an array of arrays in other languages.
     *
     * Example:
     * I = {12, 15}; // result = "(2 12)(3 27)(5 15)"
     * [2, 3, 5] is the list of all prime factors of the elements of I, hence the result.
     *
     * Notes:
     *
     * It can happen that a sum is 0 if some numbers are negative!
     * Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears in the result,
     * the sum of the numbers for which 5 is a factor is 0 so we have [5, 0] in the result amongst others.
     *
     * In Fortran - as in any other language - the returned string is not permitted to contain any
     * redundant trailing whitespace: you can use dynamically allocated character strings.
     *
     */

    /**
     *У вас есть массив положительных или отрицательных целых чисел, обозначенных как I = [i1,..,in].
     * Вам необходимо создать отсортированный массив P следующего вида:
     * [ [p, сумма всех ij из I, для которых p является простым множителем (p положительно) числа ij] ...]
     * Массив P должен быть отсортирован в порядке возрастания простых чисел.
     * Итоговый результат должен быть представлен в виде строки в Java, C#, C, C++ и в виде массива массивов
     * в других языках программирования.
     * Пример:
     * I = {12, 15}; // результат = "(2 12)(3 27)(5 15)"
     * [2, 3, 5] - это список всех простых множителей элементов массива I, отсюда и результат.
     * Примечания:
     * Может возникнуть ситуация, когда сумма равна 0, если некоторые числа отрицательные.
     * Пример: I = [15, 30, -45]. 5 делит 15, 30 и (-45), поэтому 5 появляется в результате.
     * Сумма чисел, для которых 5 является множителем, равна 0, поэтому в результате у нас [5, 0].
     * В Fortran (и в любом другом языке) возвращаемая строка не должна содержать лишних пробелов в конце:
     * вы можете использовать динамически выделяемые строки символов.
     */
    public static String sumOfDivided(int[] l) {
        // получить список простых множителей для всех чисел массива
        // Пройдите по всем уникальным простым множителям и вычислите сумму всех элементов массива I, для которых данный простой множитель является множителем.
        // Добавьте тройку [простой множитель, сумма, результат] в массив P.
        // отсортируйте массив
        // конвертируйте в строку
        return null;
    }

    public static void main(String[] args) {

    }

}
