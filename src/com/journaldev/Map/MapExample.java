package com.journaldev.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-17
 * @Description: com.journaldev.Map
 * @Version:1.0
 */
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> data=new HashMap<>();
        data.put("A", "A");
        data.put("B", "B");
        data.put("C", "C");
        data.put("D", null);
        data.put(null, "Z");
        String value = data.get("C");
        System.out.println("Key=C,Value=" + value);

        value = data.getOrDefault("E", "Default Value");
        System.out.println("Key=E, Value=" + value);

        boolean keyExists = data.containsKey(null);
        boolean valueExists = data.containsValue("Z");
        System.out.println("keyExists=" + keyExists + ", valueExists=" + valueExists);

        Set<Map.Entry<String, String>> entrySet = data.entrySet();
        System.out.println(entrySet);

        System.out.println("data map size=" + data.size());

        Map<String, String> data1=new HashMap<>();
        data1.putAll(data);
        System.out.println("data1 Mapping=" + data1);

        String nullKeyValue = data1.remove(null);
        System.out.println("data null key value=" + nullKeyValue);
        System.out.println("After removing null key" + data1);

        Set<String> stringSet = data.keySet();
        System.out.println("data map keys="+stringSet);

        Collection<String> values = data.values();
        System.out.println("data map values=" + values);

        data.clear();
        System.out.println("data is Empty" + data.isEmpty());


    }
}
