package com.journaldev.access;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-24
 * @Description: com.journaldev.access
 * @Version:1.0
 */
public class JavaForEachLoopExample {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 3, 4, 5};
        for (int i: ints
             ) {
            System.out.println("Array element is:" + i);
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("penguen");
        stringList.add("Orange");
        for (String s: stringList
             ) {
            System.out.println("stringlist is:" + s);

        }
    }
}
