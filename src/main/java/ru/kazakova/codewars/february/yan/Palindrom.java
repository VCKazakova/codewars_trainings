package ru.kazakova.codewars.february.yan;

public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPalindrom("kazak"));
        System.out.println(isPalindrom(" "));
        System.out.println(isPalindrom("kazak, kazak"));
        System.out.println(isPalindrom2("Kazak, kazaK"));
    }

    public static boolean isPalindrom(String str) {
        if (!str.isBlank()) {
            StringBuilder stringBuilder = new StringBuilder(str).reverse();
            return str.equals(stringBuilder.toString());
        }
        return false;
    }

    public static boolean isPalindrom2(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
