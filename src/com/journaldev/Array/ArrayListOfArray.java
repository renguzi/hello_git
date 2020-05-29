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
public class ArrayListOfArray {
    public static void main(String[] args) {
        String[] s1 = {"a", "b"};
        String[] s2 = {"hello", "world"};
        List<String[]> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
//        list.i
        Iterator<String[]> iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            for (String s: iterator.next()
                 ) {
                System.out.println(s);
            }
        }

        for (String[] strings:list
             ) {
            System.out.println(Arrays.toString(strings));

        }
    }
}
