package ru.kazakova.codewars.algo.search;

public class SearchMinElement {

    /**
     * присвоить минимальное значение из 1 элемента
     * итерируемся с 1 элемента
     * если текущий элемент меньше 1, переписать значение
     */

    public static int getMinElementFromArray(int[] intArray) {
        int minElem = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < minElem) {
                minElem = intArray[i];
            }
        }
        return minElem;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{77, 9, 17, 39, 2, 6, 8, 1, 0, 15};
        int[] intArray2 = new int[]{4, 6, 2, 8, 1, 9, 23, 67};
        System.out.println(getMinElementFromArray(intArray2));
    }

}
