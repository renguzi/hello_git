package com.journaldev.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-02
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        String[] strings = new String[stringList.size()];
        strings = stringList.toArray(strings);
        System.out.println(Arrays.toString(strings));

        strings = stringList.toArray(new String[0]);

        Integer[] ints = new Integer[stringList.size()];
        ints = stringList.toArray(ints);
        System.out.println(Arrays.toString(ints));
    }

}
