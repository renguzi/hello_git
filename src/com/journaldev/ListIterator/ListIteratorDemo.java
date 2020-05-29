package com.journaldev.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.ListIterator
 * @Version:1.0
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("banana");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
            if (listIterator.next() == "banana") {
                listIterator.remove();
                listIterator.add("AAAAA");
            }
        }
//
//        while (listIterator.hasPrevious()) {
//            System.out.println(listIterator.previous());
//            System.out.println(listIterator.previousIndex());
//            if (listIterator.previous() == "apple") {
//                listIterator.add("APPLE");
//            }
//        }

        for (String s: list
             ) {
            System.out.println(s);

        }
    }
}
