package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ConcurrentModificationWithListSubListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("PHP");
        list.add("SQL");
        list.add("Oracle");

        List<String> sublist = list.subList(0, 2);
        System.out.println(list + " " + sublist);
        list.set(1, "MySQL");
        System.out.println(list + " " + sublist);
        sublist.add("DBA");
        System.out.println(list + " " + sublist);
    }
}
