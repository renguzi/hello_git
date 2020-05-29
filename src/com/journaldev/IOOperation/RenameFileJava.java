package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class RenameFileJava {
    public static void main(String[] args) {
        File file = new File("/Users/asher/file.txt");
        File newFile = new File("/Users/asher/file.txt1");
        if (file.renameTo(newFile)) {
            System.out.println("rename to succeed.");
        } else {
            System.out.println("rename failed.");
        }



    }
}
