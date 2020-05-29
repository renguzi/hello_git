package com.journaldev.Array;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class StringToArray {
    public static void main(String[] args) {
        String names = "My name is Huang Wei";
        String[] words = names.split(" ");
        for (String s: words
             ) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(words));

        Pattern pattern=Pattern.compile(" ");
        words = pattern.split(names);
        System.out.println(Arrays.toString(words));
    }
}
