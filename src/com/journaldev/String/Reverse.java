package com.journaldev.String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class Reverse {
    public static void main(String[] args) {
        String s = "orld";
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < chars.length/2; i++) {
            char temp = chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(chars));
        String reverse = new String(chars);
        System.out.println(reverse);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        StringBuilder reverse1 = stringBuilder.reverse();
        System.out.println(reverse1);

        reverseString(null);
        reverseString("NULL");
    }

    public static void reverseString(String input) {
        if (input == null) {
            System.out.println("input is null");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(input);
        System.out.println(stringBuilder.reverse());
    }
}
