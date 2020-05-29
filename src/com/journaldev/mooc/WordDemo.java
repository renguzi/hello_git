package com.journaldev.mooc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-12
 * @Description: com.journaldev.mooc
 * @Version:1.0
 */
public class WordDemo {
    public static void main(String[] args) {

        Set set = new HashSet<>();
        set.add("Blue");
        set.add("Red");
        set.add("Black");
        set.add("Yellow");
        set.add("White");
        System.out.println("集合中的元素为：");
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        set.add("green");
        System.out.println(set);
        System.out.println(set.size());
        set.add("green");
        System.out.println(set);
        System.out.println(set.size());
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.add(null);
        System.out.println(set.size());
    }
}
