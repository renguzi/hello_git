package com.journaldev.IOOperation.IMOOC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) {
        File file;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/Word.java");
            byte[] bytes = new byte[100];
            int read = fileInputStream.read(bytes, 0, 55);
            System.out.println(read);
            System.out.print(new String(bytes));
            System.out.println(bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
