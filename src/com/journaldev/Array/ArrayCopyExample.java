package com.journaldev.Array;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-03
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] source1 = {1, 2, 3};
        int[] destination=null;
        int[] temp ;
        temp=new int[5];
        System.arraycopy(source, 0, temp, 0, 5);
        destination = temp;

        System.out.println(Arrays.toString(destination));

        destination = CopyArrayUsingSystem(source);
        System.out.println(Arrays.toString(destination));

        destination = CopyArrayUsingSystem(source1);
        System.out.println(Arrays.toString(destination));
    }

    public static int[] CopyArrayUsingSystem(int[] source) {
        if (source.length < 5) {
            int[] temp = new int[source.length];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        } else {
            int[] temp = new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        }
    }



}
