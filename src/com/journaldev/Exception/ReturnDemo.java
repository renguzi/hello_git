package com.journaldev.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class ReturnDemo {
    public static void main(String[] args) {
//        int a=5;
//        int b=10;
//
//        int a = new Scanner(System.in).nextInt();
//        int b = new Scanner(System.in).nextInt();
        int z = calBigger();
        System.out.println(z);
    }

    public static int calBigger() {
        Scanner scanner = new Scanner(System.in);
        try {
            int a=scanner.nextInt();
            int b = scanner.nextInt();
            return a / b;
        } catch (InputMismatchException e) {
            System.out.println("输入错误.");
            e.printStackTrace();
            return 0;
        } finally {
            System.out.println("执行结束");
//            return -100;
        }
    }
}
