package com.journaldev.String;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-28
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringToCharJava {
    public static void main(String[] args) {
        String str = "journaldev";
        char[] chars = str.toCharArray();
        System.out.println(chars.length);
        for (char c: chars
             ) {
            System.out.println(c);
        }
        char c = str.charAt(2);
        System.out.println(c);


        char[] chars1 = new char[7];
//        chars1=str.toCharArray();
        System.out.println("char1 length:"+chars1.length);
//        System.out.println(chars1.toString());
        str.getChars(1, 7, chars1, 0);
        System.out.println(chars1.toString());
        for (char c1: chars1
             ) {
            System.out.println(c1);

        }
        System.out.println(chars1.toString());
    }
}
