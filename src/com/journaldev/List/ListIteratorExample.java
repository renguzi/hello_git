package com.journaldev.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-13
 * @Description: com.journaldev.List
 * @Version:1.0
 */
public class ListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int integer = iterator.next();
            System.out.print(integer+", ");
        }

        System.out.println("\n"+list);

        iterator=list.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        iterator = list.iterator();
        while (iterator.hasNext()) {
            int i=iterator.next();
            if (i % 1 == 0) {
                list.add(100);
            }
        }
    }
}
