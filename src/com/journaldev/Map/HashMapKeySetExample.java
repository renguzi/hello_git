package com.journaldev.Map;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class HashMapKeySetExample {
    public static void main(String[] args) {
        Map<String, Integer> map=new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("3", 3);
        System.out.println(map);

        Set<String> set = map.keySet();
        System.out.println(set);
        map.put("d", 4);
        System.out.println(set);

        Collection<Integer> values=map.values();
        System.out.println(values);

        Set<String> newSet = new HashSet<>(map.keySet());
        System.out.println("newSet:"+newSet);
        System.out.println("set:"+set);
        map.put("new", 100);
        System.out.println("after map put new:  newSet:"+newSet);
        System.out.println("after map put new:  set:"+set);



    }
}
