package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListSortingExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Comparator<Integer> comparator=new ArrayListSortingExample().new MyComparator();

        list.sort(comparator);
        System.out.println(list);

        list.sort((o1, o2) -> {return o2-o1;});
        System.out.println(list);
    }

    class MyComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1-o2;
        }
    }
}
