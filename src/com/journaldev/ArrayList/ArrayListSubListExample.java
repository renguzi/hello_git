package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListSubListExample {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("Pankaj");
        list.add("David");
        list.add("Lisa");
        list.add("Meghna");
        List<String> first2Names = list.subList(0, 2);
        System.out.println(list + "," + first2Names);
        list.set(1, "Kumar");
        System.out.println(list + "," + first2Names);
        first2Names.add("Megan");
        System.out.println(list + "," + first2Names);
        list.add("Deepak");
        System.out.println(list + "," + first2Names);

    }
}
