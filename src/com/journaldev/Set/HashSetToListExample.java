package com.journaldev.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetToListExample {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("hash");
        stringSet.add("set");
        System.out.println(stringSet);

        List<String> stringList = new ArrayList<>(stringSet);
        System.out.println(stringList);
        stringList.add("set");
        stringList.add("Java");
        stringSet.add("set");
        stringSet.add("Java");
        System.out.println("stringSet= " + stringSet);
        System.out.println("stringList=" + stringList);

        stringSet=new HashSet<>(stringList);
        System.out.println(stringSet);
        System.out.println(stringList);

    }
}
