package com.journaldev.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class ThrowDemo {
    public static void main(String[] args) {
        testAge();
    }

    public static void testAge() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入年龄：");
            int age = scanner.nextInt();
            if (age < 18 || age > 80) {
            } else {
                System.out.println("欢迎光临");
            }
            throw new Exception("18以下，80以上，必须由亲友陪同");
        } catch (InputMismatchException e) {
            System.out.println("输入错误");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
