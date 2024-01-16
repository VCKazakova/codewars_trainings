package ru.kazakova.codewars.algo.search;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInWide {

        public static void main(String[] args) {
            int[][] graph = {{0, 1, 1, 0, 0},
                    {1, 0, 0, 1, 1},
                    {1, 0, 0, 1, 0},
                    {0, 1, 1, 0, 1},
                    {0, 1, 0, 1, 0}};
            int start = 0;
            bfs(graph, start);
        }

    /**
     * Создаем двумерный массив graph, который представляет собой граф.
     * Задаем начальную вершину start.
     * Создаем очередь queue и массив visited, который хранит информацию о посещенных вершинах.
     * Помечаем начальную вершину как посещенную и добавляем ее в очередь.
     * Пока очередь не пуста, извлекаем вершину из очереди и выводим ее на экран.
     * Проверяем все соседние вершины и добавляем их в очередь, если они еще не были посещены.
     * Повторяем шаги 5-6, пока очередь не станет пустой.
     */
    public static void bfs(int[][] graph, int start) {
            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[graph.length];
            visited[start] = true;
            queue.add(start);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");

                for (int i = 0; i < graph.length; i++) {
                    if (graph[node][i] == 1 && !visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }

}
