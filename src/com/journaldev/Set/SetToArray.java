package com.journaldev.Set;

import java.util.HashSet;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class SetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("java");
        hashSet.add("1DBA");
        hashSet.add("3");
        hashSet.add("d");
        hashSet.add("5");
        System.out.println(hashSet);

        String[] strings=hashSet.toArray(new String[hashSet.size()]);
        String[] strings1 = hashSet.toArray(new String[hashSet.size()]);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}
