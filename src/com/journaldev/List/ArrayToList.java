package com.journaldev.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-13
 * @Description: com.journaldev.List
 * @Version:1.0
 */
public class ArrayToList {
    public static void main(String[] args) {
        String[] strArray = {"a", "e", "i", "o", "u"};
        List<String> stringList = Arrays.asList(strArray);
        System.out.println(stringList);
//        stringList.remove("o");
//        System.out.println(stringList);

        List<String> strList=new ArrayList<>();
        for (String s: strArray
             ) {
            strList.add(s);
        }

        System.out.println(strList);
        strList.remove("o");
        System.out.println(strList);
    }
}
