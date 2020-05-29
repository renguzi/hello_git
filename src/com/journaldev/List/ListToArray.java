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
public class ListToArray {
    public static void main(String[] args) {
        List<String> stringList=new ArrayList<String>();
        stringList.add("a");
        stringList.add("e");
        stringList.add("i");
        stringList.add("o");
        stringList.add("u");
        String[] strArray= new String[stringList.size()];
                strArray= stringList.toArray(strArray);
        System.out.println(stringList.toArray().toString());
//        System.out.println(Arrays.toString(strArray));
    }
}
