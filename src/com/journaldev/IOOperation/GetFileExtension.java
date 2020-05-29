package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class GetFileExtension {
    public static void main(String[] args) {
        String filePath = "/Users/asher/apache-jmeter-5zip";
        File file = new File(filePath);
        System.out.println(getExtension(file));
    }

    public static String getExtension(File file) {
        String fileName=file.getName();
        if ((fileName.lastIndexOf(".") != -1) && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".")+1);
        }
        return "";
    }
}
