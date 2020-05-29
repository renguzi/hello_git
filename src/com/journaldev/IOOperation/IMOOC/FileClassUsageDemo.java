package com.journaldev.IOOperation.IMOOC;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-20
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class FileClassUsageDemo {
    public static void main(String[] args) {
//        File file = new File("/Users/asher/imooc/Word.java");
//        File file = new File("/Users/asher", "/imooc/Word.java");
        File file1 = new File("/Users/asher");
        File file = new File(file1, "/imooc/Word.javaz");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        File file2 = new File("/Users/asher/imooc/io/sub");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
