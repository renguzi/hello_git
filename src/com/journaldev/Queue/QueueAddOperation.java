package com.journaldev.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Queue
 * @Version:1.0
 */
public class QueueAddOperation {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(2);
        queue.add("one");
        queue.add("two");
        System.out.println(queue);
        queue.add("three");
        System.out.println(queue);
    }
}
