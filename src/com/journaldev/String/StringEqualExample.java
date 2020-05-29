package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-27
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringEqualExample {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "def";
        String s4 = "ABC";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println(s1.equals(s4));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareToIgnoreCase(s4));
    }
}
