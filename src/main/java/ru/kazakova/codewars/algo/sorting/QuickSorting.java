package ru.kazakova.codewars.algo.sorting;

import java.util.Arrays;

public class QuickSorting {

    /**
     * данный вид сортировки основан на выборе опорного элемента
     * делении массива по опорному элементу
     * создание подмассива меньше опорного элемента
     * создание подмассива больше опорного элемента
     * операция рекурсивна
     */
    public static int[] getSortingArray(int[] ints, int low, int high) {
        if (low < high) {
            // определяем индекс опорного элемента
            int pivotIndex = partition(ints, low, high);
            // для сортировки левой части массива (меньшие элементы)
            getSortingArray(ints, low, pivotIndex - 1);
            // для сортировки правой части массива (большие элементы)
            getSortingArray(ints, pivotIndex + 1, high);
        }
        return ints;
    }

    static int partition(int[] arr, int low, int high) {
        // опорный элемент равен последнему элементу массива
        int pivot = arr[high];
        // переменная будет использоваться для отслеживания текущей позиции меньших элементов
        int i = (low - 1);
        // Цикл для прохода по подмассиву от low до high - 1
        for (int j = low; j < high; j++) {
            // если текущий элемент меньше опорного, то происходит обмен местами с элементом,
            // находящимся на позиции i + 1, и i увеличивается
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // После цикла, i + 1 указывает на место, где должен быть размещен опорный элемент,
        // поэтому происходит обмен местами опорного элемента и элемента на позиции i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        // возвращает индекс, где находится опорный элемент после выполнения всех операций.
        return i + 1;
    }

    public static void main(String[] args) {
        int[] ints = new int[]{17, 29, 0, 39, 10};
        System.out.println(Arrays.toString(getSortingArray(ints, 0, ints.length - 1)));
    }

}
