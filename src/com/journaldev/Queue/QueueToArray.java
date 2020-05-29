package com.journaldev.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-21
 * @Description: com.journaldev.Queue
 * @Version:1.0
 */
public class QueueToArray {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("a");
        queue.add("b");
        String[] strings = new String[queue.size()];
        strings = queue.toArray(strings);
        for (String s: strings
             ) {
            System.out.println(s);
        }
    }
}
