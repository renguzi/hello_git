package com.journaldev.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class ThrowsDemo {
    public static void main(String[] args) {

        try {
            int z = test();
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("输入错误.");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int ss=test();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static int test() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a / b;
    }
}
