package com.journaldev.Queue;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Queue
 * @Version:1.0
 */
public class ArrayToQueue {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "Three"};
        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, strings);
        System.out.println(queue);
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(strings));
        System.out.println(queue1);
    }
}
