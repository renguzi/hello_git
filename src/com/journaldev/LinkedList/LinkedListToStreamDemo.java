package com.journaldev.LinkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.LinkedList
 * @Version:1.0
 */
public class LinkedListToStreamDemo {
    public static void main(String[] args) {
        List<Integer> integerList=new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(null);
        integerList.add(5);
        integerList.stream().forEach(System.out::println);
    }
}
