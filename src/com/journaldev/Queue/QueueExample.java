package com.journaldev.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-20
 * @Description: com.journaldev.Queue
 * @Version:1.0
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        queue.add("three");
        queue.add("four");
        System.out.println(queue);
        queue.remove("three");
        System.out.println(queue);
        System.out.println("Queue size:" + queue.size());
        System.out.println("Queue contains two ?" + queue.contains("two"));
        queue.clear();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());


    }
}
