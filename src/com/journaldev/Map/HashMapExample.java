package com.journaldev.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-18
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", null);
        map.put(null, "100");
        String value = map.get("3");
        System.out.println("Key=3,Value=" + value);

        value = map.getOrDefault("5", "DefaultValue");
        System.out.println("Key=5,Value=" + value);

        boolean keyExists = map.containsKey(null);
        boolean valueExists = map.containsValue("100");

        System.out.println("keyExists=" + keyExists + "valueExists=" + valueExists);

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        System.out.println("map sie=" + map.size());

        HashMap<String, String> map1=new HashMap<>();
        map1.putAll(map);

        System.out.println("map1 mapping=" + map1);

        String nullKeyValue = map1.remove(null);
        System.out.println("nullKeyValue=" + nullKeyValue);
        System.out.println("after remove null key values from map1:" + map1);

        Set<String> stringSet= map.keySet();
        System.out.println("map keys=" + stringSet);

        Collection<String> values = map.values();
        System.out.println("map values=" + values);

        map.clear();
        System.out.println("map is empty" + map.isEmpty());
    }
}
