package com.journaldev.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-14
 * @Description: com.journaldev.ArrayList
 * @Version:1.0
 */
public class ArrayListReplaceAllExample {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }

        UnaryOperator<Integer> unaryOperator = new ArrayListReplaceAllExample().new MyUnaryOperator();
        list.replaceAll(unaryOperator);
        System.out.println(list);

        list.replaceAll(x->{return x*5;});
        System.out.println(list);
    }

    class MyUnaryOperator implements UnaryOperator<Integer> {
        @Override
        public Integer apply(Integer integer) {
            return 10*integer;
        }
    }
}
