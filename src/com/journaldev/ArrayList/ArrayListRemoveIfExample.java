package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListRemoveIfExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        Predicate<Integer> filters=new ArrayListRemoveIfExample().new MyPredicate();
        list.removeIf(filters);
        System.out.println(list);
        list.removeIf(x->{return x%3==0;});
        System.out.println(list);
    }

    class MyPredicate implements Predicate<Integer> {
        @Override
        public boolean test(Integer integer) {
            return integer%2==0;
        }
    }

}
