package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-13
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> letters=new ArrayList<String>();
        letters.add("A");
        letters.add("C");
        letters.add("D");
        letters.add(1, "B");
        System.out.println(letters);

        ArrayList<String> list = new ArrayList<>();
        list.add("E");
        list.add("H");
        letters.addAll(list);
        System.out.println(letters);

        list.clear();
        list.add("F");
        list.add("G");
        letters.addAll(5, list);
        System.out.println(letters);

        System.out.println(letters.contains("E"));
        System.out.println(letters.contains("Z"));

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.ensureCapacity(100);
        System.out.println(stringArrayList.size());

        String s = letters.get(4);
        System.out.println("The 5th letter of the List is " + s);

        System.out.println(stringArrayList.isEmpty());
        System.out.println(letters.isEmpty());

        System.out.println("1st D in Arraylist is :" + letters.indexOf("G"));
        System.out.println("Last D is " + letters.lastIndexOf("G"));

        String[] strArray = new String[letters.size()];
        strArray = letters.toArray(strArray);
        System.out.println(strArray.toString());
        System.out.println(Arrays.toString(strArray));

        System.out.println(letters);
        System.out.println(list);
        letters.retainAll(list);
        System.out.println(letters);
    }
}
