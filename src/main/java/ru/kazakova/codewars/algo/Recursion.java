package ru.kazakova.codewars.algo;

public class Recursion {

    /**
     * рекурсия для получение факториала числа
     * факториал - это 3! = 3*2*1
     * прописываем условие выхода из рекурсии
     * прописываем рекурсию
     * */
    public static long getFactorial(int number) {
        if (1 == number) {
            return number;
        }
        return number * getFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(1));
        System.out.println(getFactorial(5));
    }


}
