package com.journaldev.String;

import java.util.Locale;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-27
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringSplitExample {
    public static void main(String[] args) {
        String s = "a/b/c/d";
        String[] strings = s.split("a/");
        System.out.println(strings.length);
        for (String s1: strings
             ) {
            System.out.println(s1);
        }
        String[] strings1 = s.split("a/", 43);
        System.out.println(strings1.length);
        for (String s2: strings1
             ) {
            System.out.println(s2);
        }

        String s1 = "Hello World";
        System.out.println(s1.contains("o"));
        System.out.println(s1.contains("Z"));
        System.out.println(s1.replace("o", "5"));
        System.out.println(s1);
        System.out.println(s1.replace("l", "3"));
        System.out.println(s1.replaceFirst("l", "1"));
        System.out.println(s1.replaceAll("l", "1"));
        s1 = s1.replace("o", "5");
        System.out.println(s1);

        String s2 = "journaldev.com";
        System.out.println(String.format("This is %s,", s2));
        System.out.println(String.format(Locale.CHINESE, "%d", 99));
        System.out.println(s2.substring(1, 3));

        String a = "abc";
        String b = a;
        if (a == b) {
            System.out.println("a and b refer to the same string");
        }

        a = "z";
        System.out.println(a);
        System.out.println(b);

        String a1 = "hello";
        String a2 = "hello";
        String a3 = new String("hello");
        String a4 = new String("hello");
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1 == a3.intern());
        System.out.println(a3 == a4);
        System.out.println(a1.getClass() + "@" + a1.hashCode());
        System.out.println(a2.getClass() + "@" + a2.hashCode());
        System.out.println(a3.getClass() + "@" + a3.hashCode());
        System.out.println(a4.getClass() + "@" + a4.hashCode());

        System.out.println("AB".compareTo("a"));
        System.out.println(a1.substring(1, 3));
        System.out.println(a1.substring(a1.length() - 4));

    }
}
