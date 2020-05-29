package com.journaldev.Generices1;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (String  s: a
             ) {
            if (min.compareTo(s) > 0) {
                min=s;
            }
            if (max.compareTo(s) < 0) {
                max=s;
            }
        }
        return new Pair<>(min, max);
    }
}
