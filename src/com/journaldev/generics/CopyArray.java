package com.journaldev.generics;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-23
 * @Description: com.journaldev.generics
 * @Version:1.0
 */
public class CopyArray {
    public static void main(String[] args) {
        int min=5;
        int max=10;
        Random random = new Random();
        int[] array1 = new int[random.nextInt(max - min + 1) + min];
        int[] array2 = new int[random.nextInt(max - min + 1) + min];
        for (int i = 0; i <array1.length ; i++) {
            array1[i]=random.nextInt()*10;
        }
        for (int i = 0; i <array2.length ; i++) {
            array2[i] = random.nextInt() * 10;
        }
        int[] array3 = new int[array1.length + array2.length];
        System.arraycopy(array1,0,array3,0,array1.length);
        System.arraycopy(array2,0,array3,array1.length,array2.length);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}
