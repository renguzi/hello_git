package com.journaldev.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class JavaArrayOfArrayList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("y");
        list2.add("e");

        List<String>[] lists = new List[2];
        lists[0] = list1;
        lists[1] = list2;
        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);

            Iterator<String> iterator = lists[i].iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
