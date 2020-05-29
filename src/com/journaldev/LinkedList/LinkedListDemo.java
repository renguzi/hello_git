package com.journaldev.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.LinkedList
 * @Version:1.0
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        List list=new LinkedList();
        list.add("James");
        list.add("Java");
        list.add(1001);
        System.out.println(list);
        System.out.println(list.size());
    }
}
