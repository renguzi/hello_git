package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class FileExists {
    public static void main(String[] args) {
        String filePath = "/Users/asher/apache-jmeter-5.1.1.zip";
        String fileNoPath = "/Users/asher/apache-jmeter-5.1.1.zipc";
        File file = new File(filePath);
        File file1 = new File(fileNoPath);
        try {
            System.out.println(file.getCanonicalPath() + " exists ? " + file.exists());
            System.out.println(file1.getCanonicalPath() + "  exists? " + file1.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
