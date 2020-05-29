package com.journaldev.List;

import java.util.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-13
 * @Description: com.journaldev.List
 * @Version:1.0
 */
public class ListSortExample {
    public static void main(String[] args) {
        List<Integer> ints=new ArrayList<Integer>();
        Random random = new Random(100);
        for (int i = 0; i <10 ; i++) {
            ints.add(random.nextInt(100));
        }
        System.out.println("Before sort:" + ints);
        Collections.sort(ints);
        System.out.println("After sort" + ints);
        ints.sort(((o2, o1) -> {return (o1-o2);}));
        System.out.println(ints);
    }
}
