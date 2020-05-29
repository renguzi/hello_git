package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ConcurrentListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("list is:" + list);
            String next = iterator.next();
            System.out.println(next);
            if (next.equals("2")) {
                list.remove("5");
            }
            if (next.equals("3")) {
                list.add("3 found");
            }
            if (next.equals("4")) {
                list.set(1, "4");
            }
        }
    }
}
