package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class FileDate {
    public static void main(String[] args) {
        String filePath = "/Users/asher/apache-jmeter-5.1.1.zip";
        File file = new File(filePath);
        long time = file.lastModified();
        try {
            System.out.println(file.getCanonicalPath() + " last modified at " + new Date(time));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
