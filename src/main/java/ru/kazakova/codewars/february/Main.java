package ru.kazakova.codewars.february;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 2, 4, 6, 2, 4}; // Пример массива с несколькими уникальными элементами
        int unique = findUnique(arr);
        System.out.println("Уникальный элемент: " + unique);
    }

    public static int findUnique(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Считаем количество встречаемости каждого элемента в массиве
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Находим элемент, количество встречаемости которого не кратно 2, 3 или 4
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0 && count % 3 != 0 && count % 4 != 0) {
                return entry.getKey();
            }
        }
        return -1; // В случае, если уникальный элемент не найден
    }


}
