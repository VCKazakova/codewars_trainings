package ru.kazakova.codewars.february;

public class TrueFalse {

    public static void main(String[] args) {
        System.out.println(false && false); // false
        System.out.println(true && false); // false
        System.out.println(true || false); // true
        System.out.println(!true); // false

        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(a && (a || b)); // true
        System.out.println((a && b) || (!a && !b)); // false

    }




}
