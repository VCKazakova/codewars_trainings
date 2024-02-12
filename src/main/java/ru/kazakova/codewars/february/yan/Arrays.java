package ru.kazakova.codewars.february.yan;

public class Arrays {

    /**
     * дан массив целых чисел, в котором кажлое число встречается 2 раза,
     * и лишь одно один раз - найти это число
     */

    public static void main(String[] args) {
        System.out.println(findInt(new int[]{
                1, 14, 7, 5, 1, 7, 5
        }));
        System.out.println(findInt(new int[]{
                4, 4, 6, 8, 9, 9, 8
        }));

        System.out.println(findUnique(new int[]{
                4, 4, 6, 8, 9, 9, 8
        }));
    }

    public static int findInt(int[] intArray) {
        int[] ints = java.util.Arrays.stream(intArray)
                .sorted()
                .toArray();
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] != ints[i + 1]) {
                return ints[i];
            }
            i++;
        }
        return ints[ints.length - 1];
    }

    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }

}
