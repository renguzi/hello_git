package com.journaldev.misc;

import java.util.Arrays;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-25
 * @Description: com.journaldev.misc
 * @Version:1.0
 */
public class JavaContinueLabel {
    public static void main(String[] args) {
        int[][] ints = {{1, -2, 3}, {0, 3}, {1, 2, 5}, {94, 9, 2}};
//        process:
        for (int i = 0; i < ints.length; i++) {
            boolean allPositive=true;
            for (int j = 0; j <ints[i].length ; j++) {
                if (ints[i][j] < 0) {
                    allPositive=false;
//                    continue process;
                    continue;
                }
            }
            if (allPositive) {
                System.out.println("Positive elements:" + Arrays.toString(ints[i]));
            }
//            allPositive=true;
        }
    }
}
