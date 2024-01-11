package ru.kazakova.codewars.algo.sorting;

public class SortingByChoose {

    /**
     * сортировка выбором построена на поиске минимального элемента
     * на каждом шаге происходит поиск минимального элемента в массиве
     * минимальный элемент меняется местами с первым элементом
     * следующие шаги происходят без учета отсортированных элементов
     *
     */

    public static int getMinIndexFromPartOfArray(int [] intArray, int startIndex) {
        int minIndex = startIndex;
        int minValue = intArray[startIndex];
        for (int i = startIndex; i < intArray.length; i++) {
            if (intArray[i] < minValue) {
                minValue = intArray[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{77, 9, 17, 39, 2, 6, 8, 1, 0, 15};
        int[] intArray2 = new int[]{4, 6, 2, 8, 1, 9, 23, 67};
        System.out.println(getMinIndexFromPartOfArray(intArray2, 3));
    }

}
