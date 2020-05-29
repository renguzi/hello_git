package com.journaldev.String;

import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-29
 * @Description: com.journaldev.String
 * @Version:1.0
 */
public class FirstContainsSecond {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first:");
        String first = scanner.nextLine();
        System.out.println("Input second:");
        String second = scanner.nextLine();
        if (first.contains(second)) {
            System.out.println("First contains second");
        }else System.out.println("First doesnot contain second");

    }
}
