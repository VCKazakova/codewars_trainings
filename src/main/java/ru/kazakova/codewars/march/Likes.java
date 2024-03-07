package ru.kazakova.codewars.march;

public class Likes {

    /**
     * https://www.codewars.com/kata/5266876b8f4bf2da9b000362
     * You probably know the "like" system from Facebook and other pages.
     * People can "like" blog posts, pictures or other items.
     * We want to create the text that should be displayed next to such an item.
     * <p>
     * Implement the function which takes an array containing the names of people that like an item.
     * It must return the display text as shown in the examples:
     * <p>
     * []                                -->  "no one likes this"
     * ["Peter"]                         -->  "Peter likes this"
     * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
     * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
     * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     */

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return names[0] + " likes this";
        } else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + "," + " " + names[1] + " and " + names[2] + " like this";
        } else {
            int length = names.length;
            int valueOfOthers = length - 2;
            return names[0] + "," + " " + names[1] + " and " + valueOfOthers + " " + "others like this";
        }
    }

    public static void main(String[] args) {
//        assertEquals("no one likes this", Solution.whoLikesIt());
//        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
//        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
//        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
//        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Jacob", "Alex"));
        System.out.println(whoLikesIt("Max", "John", "Mark"));
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

}
