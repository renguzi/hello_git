package com.journaldev.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-28
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class StringToByteArray {
    public static void main(String[] args) {
        String s = "PANKAJ";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        try {
            bytes = s.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1 = {'P', 'A', 'N', 'K', 'A', 'J'};
        byte[] bytes2 = {80, 65, 78};
        String s1 = new String(bytes1);
        String s2 = new String(bytes2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
