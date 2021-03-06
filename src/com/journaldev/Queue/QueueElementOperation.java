package com.journaldev.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Queue
 * @Version:1.0
 */
public class QueueElementOperation {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("one");
        queue.add("two");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue);
        queue.clear();
        System.out.println(queue.element());
    }
}
