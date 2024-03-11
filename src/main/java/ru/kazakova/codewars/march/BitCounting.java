package ru.kazakova.codewars.march;

public class BitCounting {

    /**
     * https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
     * Write a function that takes an integer as input, and returns the number of bits that are equal to one in
     * the binary representation of that number. You can guarantee that input is non-negative.
     * <p>
     * Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
     */

    public static int countBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        String[] splitBinaryStr = binaryString.split("");
        int sum = 0;
        for (String s : splitBinaryStr) {
            sum = Integer.parseInt(s) + sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(countBits(4));
        System.out.println(countBits(7));
        System.out.println(countBits(9));
        System.out.println(countBits(10));
    }

}
