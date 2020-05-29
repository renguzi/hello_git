package com.journaldev.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-13
 * @Description: com.journaldev.List
 * @Version:1.0
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> vowels=new ArrayList<String>();
        vowels.add("A");
        vowels.add("I");
        vowels.add(1, "E");
        System.out.println(vowels);

        List<String> list = new ArrayList<String>();
        list.add("O");
        list.add("U");
        vowels.addAll(list);
        System.out.println(vowels);

        list.removeAll(list);
        list.clear();
        System.out.println("list size is  " + list.size());

        vowels.set(2, "E");
        System.out.println(vowels);

        vowels.clear();
        vowels.add("E");
        vowels.add("E");
        vowels.add("I");
        vowels.add("O");
        list=vowels.subList(0,2);
        System.out.println("vowels=" + vowels + " list= " + list);
        vowels.set(0, "A");
        System.out.println("vowels=" + vowels + " list= " + list);
        list.add("U");
        System.out.println("vowels=" + vowels + " list= " + list);

    }
}
