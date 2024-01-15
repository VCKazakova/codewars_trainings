package ru.kazakova.codewars.algo.search;

public class LinearSearch {


    /**
     * линейный поиск осуществляется последовательным проходом по массиву
     * и возвращением индекса найденного элемента
     */
    public static int searchElementByLinearSearch(int[] ints, int searchElement) {
        if (ints.length == 0) {
            return -1;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{8, 3, 2, 9, 1, 3, 6, 10};
        System.out.println(searchElementByLinearSearch(ints, 1));
        int[] ints2 = new int[]{};
        System.out.println(searchElementByLinearSearch(ints2, 4));
    }

}
