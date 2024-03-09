package ru.kazakova.codewars.march;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {

    /**
     * https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
     *
     * Once upon a time, on a way through the old wild mountainous west,…
     * … a man was given directions to go from one point to another.
     * The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
     *
     * Going to one direction and coming back the opposite direction right away is a needless effort.
     * Since this is the wild west, with dreadful weather and not much water,
     * it's important to save yourself some energy, otherwise you might die of thirst!
     *
     * How I crossed a mountainous desert the smart way.
     * The directions given to the man are, for example, the following (depending on the language):
     *
     * ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
     * or
     * { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
     * or
     * [North, South, South, East, West, North, West]
     * You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable,
     * better stay to the same place! So the task is to give to the man a simplified version of the plan.
     * A better plan in this case is simply:
     *
     * ["WEST"]
     * or
     * { "WEST" }
     * or
     * [West]
     * Other examples:
     * In ["NORTH", "SOUTH", "EAST", "WEST"], the direction "NORTH" + "SOUTH" is going north and coming back right away.
     *
     * The path becomes ["EAST", "WEST"], now "EAST" and "WEST" annihilate each other, therefore, the final result is [] (nil in Clojure).
     *
     * In ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"], "NORTH" and "SOUTH" are not directly opposite but they
     * become directly opposite after the reduction of "EAST" and "WEST" so the whole path is reducible to ["WEST", "WEST"].
     *
     * Task
     * Write a function dirReduc which will take an array of strings and returns an array of strings with the needless directions
     * removed (W<->E or S<->N side by side).
     *
     * The Haskell version takes a list of directions with data Direction = North | East | West | South.
     * The Clojure version returns nil when the path is reduced to nothing.
     * The Rust version takes a slice of enum Direction {North, East, West, South}.
     * See more examples in "Sample Tests:"
     * Notes
     * Not all paths can be made simpler. The path ["NORTH", "WEST", "SOUTH", "EAST"] is not reducible.
     * "NORTH" and "WEST", "WEST" and "SOUTH", "SOUTH" and "EAST" are not directly opposite
     * of each other and can't become such. Hence the result path is itself : ["NORTH", "WEST", "SOUTH", "EAST"].
     * if you want to translate, please ask before translating.
     */


    /**
     * Задача: Написать функцию dirReduc, которая принимает массив строк и возвращает массив строк с удаленными
     * избыточными направлениями (соседние направления, которые взаимно аннигилируются, например, "NORTH" и "SOUTH", "EAST" и "WEST").
     *
     *     Ввод: ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"]
     *     Вывод: ["WEST"]
     *     Ввод: ["NORTH", "SOUTH", "EAST", "WEST"]
     *     Вывод: []
     *     Ввод: ["NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"]
     *     Вывод: ["WEST", "WEST"]
     */


    public static String[] dirReduc(String[] arr) {
        // выделяем условия при которых точно вернуться пустые ответы
        if (arr.length == 0 || Arrays.equals(arr, new String[]{"NORTH", "SOUTH", "EAST", "WEST"})) {
            return new String[]{};
        } else if (arr.length == 2) {
            if (("NORTH".equals(arr[0]) && "SOUTH".equals(arr[1])) || ("EAST".equals(
                    arr[0]) && "WEST".equals(arr[01]))) {
                List<String> list = new ArrayList<>(Arrays.asList(arr));
                list.remove(1);
                list.remove(0);
                return list.toArray(new String[0]);
            }
        }
        // посмотреть направления попарно, и если они противоположные - удалить
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = list.size() - 1; i > 0; i--) {
            String current = list.get(i);
            String next = list.get(i - 1);
            if (("NORTH".equals(current) && "SOUTH".equals(next)) || ("EAST".equals(
                    current) && "WEST".equals(next))
                    || ("SOUTH".equals(current) && "NORTH".equals(next))
                    || ("WEST".equals(current) && "EAST".equals(next))) {
                list.remove(current);
                list.remove(next);
                System.out.println("cur list " + list);
            }
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
//        assertArrayEquals("\"NORTH\", \"SOUTH\", \"SOUTH\", \"EAST\", \"WEST\", \"NORTH\", \"WEST\"",
//                new String[]{"WEST"},
//                DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"}));
//        assertArrayEquals("\"NORTH\",\"SOUTH\",\"SOUTH\",\"EAST\",\"WEST\",\"NORTH\"",
//                new String[]{},
//                DirReduction.dirReduc(new String[]{"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"}));
        String[] array = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] array2 = {"NORTH", "SOUTH", "EAST"};
//        System.out.println(array.length);
        System.out.println(Arrays.toString(dirReduc(array2)));
//        System.out.println(Arrays.toString(dirReduc(new String[]{"NORTH, SOUTH, SOUTH, EAST, WEST, NORTH"})));
    }

    // || ("SOUTH".equals(current) && "NORTH".equals(
    //        next)) || ("WEST".equals(
    //        current) && "EAST".equals(next))

}
