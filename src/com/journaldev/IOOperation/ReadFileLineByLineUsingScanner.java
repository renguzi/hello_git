package com.journaldev.IOOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class ReadFileLineByLineUsingScanner {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("/Users/asher/imooc/imooc1.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
