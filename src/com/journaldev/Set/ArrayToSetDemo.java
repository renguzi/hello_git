package com.journaldev.Set;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class ArrayToSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        String[] vowels = {"a", "b", "ddd"};

        Collections.addAll(hashSet, vowels);
        System.out.println(hashSet);
    }
}
