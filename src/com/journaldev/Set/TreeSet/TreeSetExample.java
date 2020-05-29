package com.journaldev.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set.TreeSet
 * @Version:1.0
 */
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> integerSet=new TreeSet<>();
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(12);
        System.out.println(integerSet);


    }


}
