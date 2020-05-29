package com.journaldev.Array;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class Varags {
    public static void main(String[] args) {
        System.out.println(addString("a", "b"));
        System.out.println(addString("hello", "world", "java"));
        System.out.println(addString("1", "2", "3", "4"));
    }

    public static String addString(String s1, String s2, String...s3) {
        return s1.concat(s2).concat(String.valueOf(s3));
    }
}
