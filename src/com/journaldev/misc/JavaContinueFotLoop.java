package com.journaldev.misc;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-25
 * @Description: com.journaldev.misc
 * @Version:1.0
 */
public class JavaContinueFotLoop {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int x: ints) {
            if (x % 2 != 0) {
                continue;
            }
            System.out.println("Even number is:" + x);
        }
    }
}
