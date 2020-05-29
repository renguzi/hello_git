package com.journaldev.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-08
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class TestTryCatchFinally {
    public static void main(String[] args) {
//        int one=12;
//        int two=2;
//        System.out.println("one除以two的商是：" + (one / two));
        System.out.println("计算两数的商：");
        try {


            Scanner scanner = new Scanner(System.in);
            System.out.print("输入第一个数：");
            int one = scanner.nextInt();
            System.out.print("输入第二个数: ");
            int two = scanner.nextInt();
            System.out.println("它们的商是：" + (one / two));
        } catch (ArithmeticException e) {
            System.exit(1);
            System.out.println("除数不能为0");
        } catch (InputMismatchException e) {
            System.out.println("请输入整数");
        } catch (Exception e) {
            System.out.println("程序出错了");
            e.printStackTrace();
        } finally {
            System.out.println("the end");
        }
        }



}
