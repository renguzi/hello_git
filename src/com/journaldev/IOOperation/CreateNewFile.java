package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-10
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class CreateNewFile {
    public static void main(String[] args) {
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator ="+ fileSeparator);
        String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "asher" + fileSeparator + "file.txt";
        System.out.println("absoluteFilePath =" + absoluteFilePath);
//        absolute file name with path
        File file = new File(absoluteFilePath);
        try {
            if (file.createNewFile()) {
                System.out.println(absoluteFilePath + " File Created");
            } else {
                System.out.println("File " + absoluteFilePath + " already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        file name only
        file = new File("file.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("file.txt File Created in Project root directory");
            } else {
                System.out.println("File file.txt already exists in the project root directory");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//      relative path
        String relativePath = "tmp" + fileSeparator + "file.txt";
        System.out.println(relativePath);
        file = new File(relativePath);
        try {
            if (file.createNewFile()) {
                System.out.println(relativePath + " File Created in project root directory");
            } else {
                System.out.println("File " + relativePath + " already exists in the project root directory");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
