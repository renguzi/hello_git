package com.journaldev.ArrayList;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-22
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        list.add("e");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s=iterator.next();
            System.out.println("s= "+s);
//            if (s.equals("c")) {
//                list.remove(s);
//            }
        }
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");

        Iterator<String> iterator1 = map.keySet().iterator();

        while (iterator1.hasNext()) {
            String key = iterator1.next();
            System.out.println("Map Value:" + map.get(key));
            if (key.equals("3")) {
                map.replace("1", "1a");
            }
        }
        System.out.println(map);

    }
}
