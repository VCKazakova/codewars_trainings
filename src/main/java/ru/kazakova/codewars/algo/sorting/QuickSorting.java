package ru.kazakova.codewars.algo.sorting;

public class QuickSorting {

    /**
     * данный вид сортировки основан на выборе опорного элемента
     * делении массива по опорному элементу
     * создание подмассива меньше опорного элемента
     * создание подмассива больше опорного элемента
     * операция рекурсивна
     */
    public static int[] getSortingArray(int[] ints, int low, int high) {
        if (ints.length < 2) {
            return ints;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{17, 29, 0, 39, 10};
    }

}
