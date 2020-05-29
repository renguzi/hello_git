package com.journaldev.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

    public static double sum(List<? extends Number> list){
        double sum=0;
        for (Number n: list){
            sum +=n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(100);
        ints.add(9);
        double sum=sum(ints);
        System.out.println("Sum of ints=" + sum);
    }
}
