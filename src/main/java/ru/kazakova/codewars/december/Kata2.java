package ru.kazakova.codewars.december;

public class Kata2 {

    /**
     * https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java
     * Complete the solution so that it returns true if the first argument(string)
     * passed in ends with the 2nd argument (also a string).
     *
     * Examples:
     *
     * solution('abc', 'bc') // returns true
     * solution('abc', 'd') // returns false
     */

    // если строка заканчивается второй переданной строкой - вернуть true
    public static boolean solution(String str, String ending) {
        // сделать подстроку такой же длины как и конец
        // сравнить строки
        int lengthOfEndString = ending.length();
        int lengthOfString = str.length();
        int lengthOfSub = lengthOfString - lengthOfEndString;
        if (lengthOfSub == 0) {
            return str.equals(ending);
        }
        if (lengthOfSub > 0) {
            String substring = str.substring(lengthOfSub);
            return substring.equals(ending);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
    }

}
