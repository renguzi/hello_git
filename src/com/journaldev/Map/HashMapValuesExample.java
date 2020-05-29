package com.journaldev.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class HashMapValuesExample {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("1","1");
        map.put("2", "2");
        map.put("3", null);
        map.put("4", null);
        map.put(null, "100");

        Collection<String> values = map.values();
        System.out.println("map values=" + values);

        map.remove(null);
        System.out.println("map values after remove null key=" + values);

        values.remove("2");
        System.out.println(map);

    }
}
