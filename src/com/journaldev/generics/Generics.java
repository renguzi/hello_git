package com.journaldev.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");
        list.add(new Integer(5)); //compile correct
        System.out.println(list);

        for (Object object : list) {
            String string = (String) object;      //运行时会报错ClassCastException
            System.out.println(string);
        }

        List<String> list1 = new ArrayList<>();
        list1.add("list1");
//        list1.add(new Integer(5));  //compiler error

        for (String string:list1
        ) {
            String string1=string;  //不再需要类型转换了

        }

    }
}
