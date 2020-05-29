package com.journaldev.Array;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class JavaArraySort {
    public static void main(String[] args) {
        String[] strings = {"H", "E", "L", "D"};
        int[] ints = {100, 3, 8, 4, 44};
        Arrays.sort(strings);
        Arrays.sort(ints);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(ints));

    }
}
