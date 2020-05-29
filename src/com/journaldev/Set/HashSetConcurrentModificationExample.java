package com.journaldev.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetConcurrentModificationExample {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<String>();
        for (int i = 0; i <5 ; i++) {
            stringSet.add(String.valueOf(i));
        }
        System.out.println(stringSet);
        Iterator<String> iterator=stringSet.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("3")) {
                stringSet.remove("3");
            }
        }
        System.out.println(stringSet);
    }
}
