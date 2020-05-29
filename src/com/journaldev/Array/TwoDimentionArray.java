package com.journaldev.Array;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-01
 * @Description: com.journaldev.Array
 * @Version:1.0
 */
public class TwoDimentionArray {
    public static void main(String[] args) {
        int[][] intarr = new int[2][];
        intarr[0] = new int[3];
        intarr[1] = new int[2];
        for (int i = 0; i < intarr.length; i++) {
            for (int j = 0; j < intarr[i].length; j++) {
                intarr[i][j] = j;
                System.out.print(intarr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
