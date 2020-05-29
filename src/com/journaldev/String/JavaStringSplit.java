package com.journaldev.String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-28
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class JavaStringSplit {
    public static void main(String[] args) {
        String line = "I am a java developer";
        String[] words = line.split(" ");
        String[] twoWords = line.split("", 2);
        System.out.println("String split with delimiter:" + Arrays.toString(words));
        System.out.println(words.length);
        System.out.println("String split into two:" + Arrays.toString(twoWords));
        String wordsWithNumbers = "I|am|a|java|developer";
        String[] numbers = wordsWithNumbers.split("|");
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
    }
}
