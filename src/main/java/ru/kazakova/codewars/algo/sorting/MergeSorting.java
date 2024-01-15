package ru.kazakova.codewars.algo.sorting;

import java.util.Arrays;

public class MergeSorting {

    /**
     * алгоритм работает по принципу разделяй и властвуй
     * далее неотсортированны массив делится на две части и сортируются отдельные половинки
     * затем отсортированные подмассивы объединяются
     */

    public static void merge(int arr[], int l, int m, int r) {
        // Находим размеры двух подмассивов, которые нужно объединить
        int n1 = m - l + 1;
        int n2 = r - m;

        // Создаем временные массивы
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Копируем данные во временные массивы
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Объединяем временные массивы
        int i = 0, j = 0;

        // Изначальный индекс подмассива
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы из L[] и R[] если таковые остались
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // Находим среднюю точку
            int m = (l + r) / 2;

            // Сортируем первую и вторую половины
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Объединяем отсортированные половины
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[] {6, 3, 9, 1, 4, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
