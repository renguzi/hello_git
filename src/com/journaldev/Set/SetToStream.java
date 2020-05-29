package com.journaldev.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class SetToStream {
    public static void main(String[] args) {
        Set<String> stringSet= new HashSet<String>();
        stringSet.add("a");
        stringSet.add("e");
        stringSet.add("i");
        stringSet.stream().forEach(System.out::println);
    }
}
