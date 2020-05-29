package com.journaldev.LinkedList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-15
 * @Description: com.journaldev.LinkedList
 * @Version:1.0
 */
public class LinkedListDequeOperationDemo {
    public static void main(String[] args) {
        Deque names = new LinkedList();
        names.add(2);
        names.addFirst(1);
        names.addLast(3);
        names.offerFirst(0);
        names.offerLast(4);

        System.out.println(names);
        System.out.println(names.size());
        names.removeFirst();
        names.remove(4);
        System.out.println(names);
    }
}
