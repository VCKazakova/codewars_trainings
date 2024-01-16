package ru.kazakova.codewars.algo;

public class DejkstraAlgo {

    public static void main(String[] args) {
        int[][] graph = {{0, 1, 1, 0, 0},
                {1, 0, 0, 1, 1},
                {1, 0, 0, 1, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0}};
        int start = 0;
        dijkstra(graph, start);
    }

    /**
     * Создаем двумерный массив graph, который представляет собой граф.
     * Задаем начальную вершину start.
     * Создаем массив distances, который хранит длины пути до всех вершин, и массив visited,
     * который хранит информацию о посещенных вершинах.
     * Задаем начальную вершине начальную длину пути.
     * Пока есть непосещенные вершины:
     * Выбираем вершину с минимальной длиной пути.
     * Обновляем длины пути до соседей выбранной вершины.
     * Выводим длины пути до всех вершин.
     */
    public static void dijkstra(int[][] graph, int start) {
        int[] distances = new int[graph.length];
        boolean[] visited = new boolean[graph.length];
        distances[start] = 0;

        for (int i = 0; i < graph.length; i++) {
            int minDistance = Integer.MAX_VALUE;
            int currentNode = -1;

            for (int j = 0; j < graph.length; j++) {
                if (!visited[j] && distances[j] < minDistance) {
                    minDistance = distances[j];
                    currentNode = j;
                }
            }

            visited[currentNode] = true;

            for (int j = 0; j < graph.length; j++) {
                if (graph[currentNode][j] != 0 && !visited[j]) {
                    int newDistance = distances[currentNode] + graph[currentNode][j];
                    if (newDistance < distances[j]) {
                        distances[j] = newDistance;
                    }
                }
            }
        }

        printDistances(distances);
    }

    public static void printDistances(int[] distances) {
        for (int distance : distances) {
            System.out.print(distance + " ");
        }
        System.out.println();
    }


}
