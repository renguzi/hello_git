package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) {
        File file;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/imooc/Word.javaz");
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/Word.javaz");
            fileOutputStream.write(50);
            fileOutputStream.write('a');
            System.out.println( fileInputStream.read());
            System.out.println((char) fileInputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
