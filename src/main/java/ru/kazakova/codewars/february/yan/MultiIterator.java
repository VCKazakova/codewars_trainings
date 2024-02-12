package ru.kazakova.codewars.february.yan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiIterator {

    /**
     * реализовать multiiterator, который содежит в себе 2 итератора
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
