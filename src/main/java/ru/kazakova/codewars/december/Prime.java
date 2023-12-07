package ru.kazakova.codewars.december;

public class Prime {

    /**
     * Define a function that takes an integer argument and returns a logical value true or false
     * depending on if the integer is a prime.
     * <p>
     * Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors
     * other than 1 and itself.
     * <p>
     * Requirements
     * You can assume you will be given an integer input.
     * You can not assume that the integer will be only positive. You may be given negative numbers as well ( or 0 ).
     * NOTE on performance: There are no fancy optimizations required, but still the most trivial solutions might time out.
     * Numbers go up to 2^31 ( or similar, depending on language ). Looping all the way up to n, or n/2, will be too slow.
     * Example
     * is_prime(1)  /* false
     * is_prime(2)  /* true
     * is_prime(-1) /* false
     */


    public static boolean isPrime(int num) {
        // надо определить является ли число простым
        // простое число - больше 1, не имеющее положительных делителей. * кроме 1 и самого себя.
        // если число < 0 или 1 вернем false
        // посчитать количество делителей и если оно = 2 - вернуть true

        if (num < 0 || num == 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num / i == i) {
                count++;
            } else {
                count += 2;
            }
        }
        return count == 2;
    }

    public static int countDivisors(int n) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // Если i - делитель, то n/i тоже делитель
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println("количество делителей: " + isPrime(73));
        System.out.println("количество делителей: " + countDivisors(73));
    }

}
