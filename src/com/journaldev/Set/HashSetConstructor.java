package com.journaldev.Set;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetConstructor {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set=new HashSet<>(32);

        set=new HashSet<String>(32,0.85f);
        Set<String> set1=new HashSet<>();
        set1 = new HashSet<>(set);

        set1=new HashSet<>(new ArrayDeque<>());
        set1 = new HashSet<>(new ArrayList<>());
        String[] strings = {"a", "b"};

        set1=new HashSet<>(Arrays.asList(strings));
        System.out.println(set1);


    }
}
