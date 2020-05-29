package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class CheckDirectoryOrFile {
    public static void main(String[] args) {
        String filePath = "/Users/asher/apache-jmeter-5.1.1.zip";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.isDirectory()) {
                try {
                    System.out.println(file.getCanonicalPath() + " is a directory.");
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }else
                System.out.println(file.getAbsolutePath() + " is a file");
        }
    }
}
