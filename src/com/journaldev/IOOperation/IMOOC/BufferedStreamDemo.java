package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class BufferedStreamDemo {
    public static void main(String[] args) {
        File file;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/Word.javaz");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/imooc/Word.javaz");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(50);
            bufferedOutputStream.write('a');
            bufferedOutputStream.flush();
            System.out.print(bufferedInputStream.read());
            System.out.println((char) bufferedInputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
