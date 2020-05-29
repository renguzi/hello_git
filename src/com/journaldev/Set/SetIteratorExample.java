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
public class SetIteratorExample {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("Java");
        stringSet.add("DBA");
        stringSet.add("MongoDB");
        stringSet.add("Linux");
        System.out.println(stringSet);

        Iterator<String> iterator=stringSet.iterator();
        while (iterator.hasNext()) {
            String string=iterator.next();
            System.out.println(string);
        }
        iterator=stringSet.iterator();
        while (iterator.hasNext()) {
            String x=iterator.next();
            if (x == "DBA") {
                stringSet.add("JJJJJJJ");
            }
        }

    }
}
