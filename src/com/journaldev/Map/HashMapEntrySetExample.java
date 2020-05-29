package com.journaldev.Map;

import java.util.*;
import java.util.Map.Entry;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class HashMapEntrySetExample {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");

        Set<Map.Entry<String, String>> entrySet=map.entrySet();
        Iterator<Map.Entry<String, String>> iterator=entrySet.iterator();
        Entry<String, String> next=null;

        System.out.println("map before processing " + map);
        System.out.println("entrySet before processing " + entrySet);

        while (iterator.hasNext()) {
            next = iterator.next();
            System.out.println("Processing on:" + next.getValue());
            if (next.getKey()==null) iterator.remove();
        }
        System.out.println("map after processing" + map);
        System.out.println("entrySet after processing" + entrySet);

        Entry<String, String> simpleEntry = new AbstractMap.SimpleEntry<>("1", "1");
        entrySet.remove(simpleEntry);
        System.out.println("map after removing entry=" + map);
        System.out.println("entrySet after removing entry=" + entrySet);
    }
}
