package com.journaldev.Set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class SetCommonOperation {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("E");
        stringSet.add("I");
        System.out.println(stringSet);

        Set<String> stringSet1=new HashSet<>();
        stringSet1.add("O");
        stringSet1.add("U");
        stringSet.addAll(stringSet1);
        System.out.println(stringSet);

        stringSet1.clear();
        System.out.println(stringSet.size());

        stringSet.clear();
        stringSet.add("E");
        stringSet.add("E");
        stringSet.add("I");
        System.out.println(stringSet.contains("O"));
        System.out.println(stringSet);
    }
}
