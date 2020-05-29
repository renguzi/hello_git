package com.journaldev.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-19
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();

        map.put(10, "10");
        map.put(1, "1");
        map.put(5, "5");
        System.out.println(map);

        map=new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return ((o1>o2)?-1:(o1==o2)?0:1);
            }
        });

        map.put(10, "10");
        map.put(1, "1");
        map.put(5, "5");
        System.out.println(map);
    }
}
