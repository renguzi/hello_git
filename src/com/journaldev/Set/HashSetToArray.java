package com.journaldev.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-16
 * @Description: com.journaldev.Set
 * @Version:1.0
 */
public class HashSetToArray {
    public static void main(String[] args) {
        Set<Integer> integerSet=new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            integerSet.add(i);
        }
        System.out.println("integerSet is" + integerSet);

        Integer[] array = new Integer[integerSet.size()];
        integerSet.remove(0);

        array=  integerSet.toArray(array);
        array[integerSet.size()]=9;
        for (Integer i: array
             ) {
            System.out.print(i.intValue());
        }


        integerSet.remove(0);
        integerSet.remove(1);
        System.out.println(Arrays.toString(array));
        System.out.println("Array is:");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
        System.out.println("Set before is "+ integerSet);

        integerSet=new HashSet<>(Arrays.asList(array));

        System.out.println("Set After is "+integerSet);

    }
}
