package ru.kazakova.codewars.february;

public class ExpandedForm {

    /**
     * Write Number in Expanded Form
     * You will be given a number and you will need to return it as a string in Expanded Form. For example:
     * <p>
     * Kata.expandedForm(12); # Should return "10 + 2"
     * Kata.expandedForm(42); # Should return "40 + 2"
     * Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
     * NOTE: All numbers will be whole numbers greater than 0.
     */

    public static void main(String[] args) {
        System.out.println(getExpandedForm(12));
        System.out.println(getExpandedForm(70304));
    }

    public static String getExpandedForm(int num) {
        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if (digit != 0) {
                if (result.length() > 0) {
                    result.append(" + ");
                }
                result.append(digit * (int) Math.pow(10, number.length() - i - 1));
            }
        }
        return result.toString();
    }

}
