package com.journaldev.IOOperation.IMOOC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("/Users/asher/imooc/Word.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            int n = 0;

            while ((n = fileInputStream.read()) != -1) {
                System.out.print((char) n);
//                n=(byte)fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        int a=7200;
        byte aByte= (byte) a;
        System.out.println(a);
        System.out.println(aByte);
        System.out.println((int) aByte);
        int b = aByte;
        System.out.println(b);
    }


}
