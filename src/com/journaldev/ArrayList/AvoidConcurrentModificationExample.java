package com.journaldev.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class AvoidConcurrentModificationExample {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println("List value:" + s);
            if (s.equals("3")) {
                list.add("6");
                list.add("7");
                list.remove("4");
            }
        }
        System.out.println("List size=" + list.size());
        System.out.println(list);

        Map<Integer, String> map = new ConcurrentHashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        Iterator<Integer> iterator1 = map.keySet().iterator();
        while (iterator1.hasNext()) {
            int key=iterator1.next();
            System.out.println("Map key is: "+key+"   Map value is:" + map.get(key));
            if (key == 3) {
                map.remove(4);
                map.put(5, "5");
                map.put(6, "6");
            }
        }
        System.out.println(map.size());
        System.out.println(map);

    }
}
