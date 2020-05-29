package com.journaldev.misc;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-25
 * @Description: com.journaldev.misc
 * @Version:1.0
 */
public class JavaContinueWhileLoop {
    public static void main(String[] args) {
        int[] ints = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i = 0;
        while (i < 10) {
            if (i % 3 != 0) {
                i++;
                continue;
            }
            System.out.println("Processing Entry:" + ints[i]);
            i++;
        }
    }
}
