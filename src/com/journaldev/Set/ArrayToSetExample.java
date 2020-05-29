package com.journaldev.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class ArrayToSetExample {
    public static void main(String[] args) {
        String[] vowels = {"a", "b", "c", "d", "e"};
        Set<String> stringSet=new HashSet<String>(Arrays.asList(vowels));
        System.out.println(stringSet);
        stringSet.add("f");
        System.out.println(stringSet);
        stringSet.remove("g");
        System.out.println(stringSet.size());
        stringSet.clear();
        System.out.println(stringSet);
        System.out.println(stringSet.size());
    }
}
