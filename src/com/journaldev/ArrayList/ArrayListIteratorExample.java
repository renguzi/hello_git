package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListIteratorExample {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            integerList.add(i);
        }

        Iterator<Integer> integerIterator=integerList.iterator();
        while (integerIterator.hasNext()) {
            int next = (int) integerIterator.next();
            System.out.print(next+" ");
        }
        System.out.println("\n"+integerList);

        integerIterator=integerList.iterator();
        while (integerIterator.hasNext()) {
            int next = (int)integerIterator.next();
            if (next % 2 == 0) {
                integerIterator.remove();
            }
        }
        System.out.println(integerIterator);
        System.out.println(integerList);

        integerIterator=integerList.iterator();
        while (integerIterator.hasNext()) {
            int next = (int)integerIterator.next();
            if (next == 5) {
                integerList.add(4444);
            }
        }
        System.out.println(integerList);
    }
}
