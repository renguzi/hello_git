package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaGetFileSize {
    static final String FILE_NAME = "/Users/asher/apache-jmeter-5.1.1.zip";

    public static void main(String[] args) {
        File file = new File(FILE_NAME);
        if (((!file.exists()) || !(file.isFile()))) {
            System.out.println("File is not exits");
            return;
        }
        getFilesize(file);

    }

    public static void getFilesize(File file) {

        System.out.println("bytes: " + file.length());
        System.out.println("kb" + file.length() / 1024);
        System.out.println("mb" + file.length() / 1024 / 104);
    }
}
