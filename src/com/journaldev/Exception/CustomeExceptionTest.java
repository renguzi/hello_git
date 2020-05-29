package com.journaldev.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class CustomeExceptionTest {
    public static void main(String[] args) {
        try {
            checkAge();
        } catch (CustomeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("格式输入不对");
            e.printStackTrace();
        }
    }


    public static void checkAge() throws CustomeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 8 || age > 80) {
            throw new CustomeException();
        } else {
            System.out.println("欢迎");
        }

    }

}
