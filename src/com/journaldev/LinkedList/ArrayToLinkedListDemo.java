package com.journaldev.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.LinkedList
 * @Version:1.0
 */
public class ArrayToLinkedListDemo {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Java";
        strings[1] = "DBA";
        strings[2] = "Linux";
        List linkedList = Arrays.asList(strings);
        System.out.println(linkedList);
        LinkedList<String> stringLinkedList=new LinkedList<>();
        for (String s: strings
             ) {
            stringLinkedList.add(s);
        }
        System.out.println(stringLinkedList);

        String[] strings1=new String[stringLinkedList.size()];
        strings1 = stringLinkedList.toArray(strings1);
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }
    }
}
