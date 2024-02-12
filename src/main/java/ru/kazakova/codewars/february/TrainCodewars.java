package ru.kazakova.codewars.february;

public class TrainCodewars {

    /**
     * Write a function that takes in a string of one or more words, and returns the same string,
     * but with all words that have five or more letters reversed (Just like the name of this Kata).
     * Strings passed in will consist of only letters and spaces.
     * Spaces will be included only when more than one word is present.
     * <p>
     * "Hey fellow warriors"  --> "Hey wollef sroirraw"
     * "This is a test        --> "This is a test"
     * "This is another test" --> "This is rehtona test"
     */

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Just gniddik [there is still] one more"));
    }

    public static String spinWords(String sentence) {
        String[] splitString = sentence.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].length() >= 5) {
                StringBuilder stringBuilder = new StringBuilder(splitString[i]).reverse();
                if (splitString[i].contains("[")) {
                    int index = stringBuilder.indexOf("[");
                    stringBuilder.setCharAt(index, ']');
                    stringBuilder.setCharAt(0, '[');
                }
                splitString[i] = stringBuilder.toString();
            }
        }
        return String.join(" ", splitString);
    }

}
