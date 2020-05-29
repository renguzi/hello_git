package com.journaldev.Set;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println("fruits set is empty?" + fruits.isEmpty());

        System.out.println("fruits contains Apple?" + fruits.contains("Apple"));
        System.out.println("fruits contains Manago?" + fruits.contains("Mango"));

        System.out.println("Apple removed from fruits=" + fruits.remove("Apple"));
        System.out.println("mango removed from fruits=" + fruits.remove("Mango"));

        System.out.println("fruits set size=" + fruits.size());
//        addAll example
        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Pear");
        list.add("Apple");
        list.add("Orange");

        System.out.println("list= " + list);
        System.out.println("fruits before addAll=" + fruits);
        fruits.addAll(list);
        System.out.println("fruits after addAll=" + fruits);

//        iterator example
        Iterator<String> iterator=fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println("consuming fruits:" + iterator.next());
        }

        fruits.retainAll(list);

        System.out.println("fruits retainAll list is" + fruits);


    }
}
