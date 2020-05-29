package com.journaldev.Map;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-19
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class TreeMapNavigationExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i <10 ; i++) {
            map.put(i, i + "");
        }
        System.out.println(map);

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Map.Entry<Integer, String> lowerEntry = map.lowerEntry(5);
        System.out.println(entrySet);
        System.out.println(lowerEntry);
        System.out.println(map.higherEntry(5));
        System.out.println(map.lowerKey(5));
        System.out.println(map.floorEntry(5));
        System.out.println(map.ceilingEntry(5));
        System.out.println(map.floorKey(5));
        map.firstEntry();
        Map.Entry<Integer,String> entry=map.firstEntry();
        System.out.println(entry.getValue());
        Map.Entry<Integer,String> entry1=map.lastEntry();
        System.out.println(entry1.getKey() + "   " + entry1.getValue());
        System.out.println(map.pollFirstEntry());
        System.out.println(map);
        System.out.println(map.subMap(2,true, 6,true));
        System.out.println(map.headMap(5, true));
        System.out.println(map.headMap(5));
    }
}
