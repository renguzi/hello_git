package com.journaldev.generics;

import java.util.Random;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-23
 * @Description: com.journaldev.generics
 * @Version:1.0
 */
public class HelloWorld {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Random random = new Random();
        for (int i = 0; i <ints.length ; i++) {
            ints[i] = random.nextInt(100);
        }
        int max = ints[0];
        for (int j=0; j<ints.length;j++ ) {
            if (max < ints[j]) {
                max = ints[j];
            }
            System.out.println(ints[j]);
        }
        System.out.println("max is "+max);

        int max1=ints[0];
        for (int z: ints
             ) {
            if (max1 < z) {
                max1=z;
                System.out.println("max= " + max1 + "z= " + z);
            }
        }


    }
}
