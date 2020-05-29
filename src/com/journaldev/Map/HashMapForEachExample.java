package com.journaldev.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */

class MyBiConsumer implements BiConsumer<String, String> {
    @Override
    public void accept(String s, String s2) {
        System.out.println("Key=" + s);
        System.out.println("Processing on value=" + s2);
    }
}
public class HashMapForEachExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", null);
        map.put(null, "100");
        BiConsumer<String,String> action=new MyBiConsumer();
        map.forEach(action);
        map.forEach((k,v)->{System.out.println("key=" + k + ",value=" + v);});

    }
}
