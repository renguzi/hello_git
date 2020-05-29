package com.journaldev.String;

import java.util.GregorianCalendar;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class TestString {
    public static void main(String[] args) {
        System.gc();
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();
//        StringBuffer sb = new StringBuffer();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append(":").append(i);
        }
        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("time:" + (start - end));
        System.out.println("memory:" + (endMemory - startMemory));
    }
}
