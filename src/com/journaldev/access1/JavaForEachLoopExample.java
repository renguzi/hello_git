package com.journaldev.access1;

import java.util.ArrayList;
import java.util.List;

public class JavaForEachLoopExample {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        for (int i :
                ints) {
            System.out.println("java for each loop with array:" + i);
        }

        List<String> fruits=new ArrayList<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("banana");
        for (String s:
                fruits) {
            System.out.println(s);
        }
    }
}
