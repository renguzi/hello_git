package com.journaldev.Generices1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-23
 * @Description: com.journaldev.Generices1
 * @Version:1.0
 */
public class GenericsWildcard {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(1);
        double sum = sum(list);
        System.out.println(sum);
        PrintData(list);

    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
//        list.add(null);
        for (Number x : list) {
            sum += x.doubleValue();
        }
        return sum;
    }

    public static void PrintData(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj+"::");
        }
    }
}
