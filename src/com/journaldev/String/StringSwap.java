package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringSwap {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("word");
//        System.out.println((s1.concat(s2)).substring(s1.length()));
//        s1 = s1.concat(s2).substring(s1.length());
        s1 = s1.concat(s2);
        s2 = s1.substring(0, s1.length()-s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
    }
}
