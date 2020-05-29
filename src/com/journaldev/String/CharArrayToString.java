package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-28
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class CharArrayToString {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l'};
        String s = new String(chars);
        System.out.println(s);
    }
}
