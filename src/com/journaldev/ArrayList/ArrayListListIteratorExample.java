package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListListIteratorExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            int x=(int)listIterator.previous();
            System.out.println(x + ", ");
            if (x == 4) {
                listIterator.remove();
                listIterator.add(44444);
//                list.add(999);
            }
        }
        System.out.println(list);
    }
}
