package com.journaldev.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-02
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3", "4"};
        List<String> stringList = new ArrayList<>();
        stringList = Arrays.asList(strings);
        System.out.println("original array:" + Arrays.toString(strings));
        System.out.println("original list:" + stringList.toString());
        strings[0] = "555";
        System.out.println("New array:" + Arrays.toString(strings));
        System.out.println("New list:" + stringList.toString());

        List<String> stringList1=new ArrayList<>();
        Collections.addAll(stringList1, strings);
        System.out.println("original array:" + Arrays.toString(strings));
        System.out.println("original list:" + stringList1.toString());
        strings[0] = "6666";
        stringList1.add("999");
        System.out.println("New array:" + Arrays.toString(strings));
        System.out.println("New list:" + stringList1.toString());




    }
}
