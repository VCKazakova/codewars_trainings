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

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        Iterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        MultiIteratorInner multiIteratorInner = new MultiIteratorInner(list.iterator(), list2.listIterator());
        multiIteratorInner.iterateBoth();
    }

    static class MultiIteratorInner {

        Iterator<?> iterator;
        Iterator<?> iterator2;

        MultiIteratorInner(Iterator<?> iterator, Iterator<?> iterator2) {
            this.iterator = iterator;
            this.iterator2 = iterator2;
        }

        /**
         * если хотим вывести попорядку - используем while
         */
        public void iterateBoth() {
            while (iterator.hasNext() || iterator2.hasNext()) {
                if (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                if (iterator2.hasNext()) {
                    System.out.println(iterator2.next());
                }
            }
        }

    }

}
