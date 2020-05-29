package com.journaldev.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class HashMapPutIfAbsentExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        System.out.println("before PutIfAbsent:"+map);
        String value = map.putIfAbsent("1", "3");
        System.out.println("After PutIfAbsent:" + map);
        System.out.println("After PutIfAbsent value=" + value);
    }
}
