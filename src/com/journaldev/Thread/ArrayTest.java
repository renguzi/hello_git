package com.journaldev.Thread;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        for (int i: ints
             ) {
            System.out.println(i);
        }
        int[] newints = ints;
        newints[2] = 303;
        System.out.println(Arrays.toString(ints));

        ints = Arrays.copyOf(newints, newints.length * 2);
        System.out.println("ints length is:"+ints.length);
        newints[0] = 1010;
        for (int j :
                ints) {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(newints));
    }
}
