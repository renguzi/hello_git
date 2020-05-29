package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/docker_practice.pdf");
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/imooc/Word.javaz.cp");
            byte[] bytes = new byte[14];
            int n=fileInputStream.read(bytes);
            System.out.println(n);
            while ((n  ) > 0) {
                fileOutputStream.write(bytes,0,n);
                n = fileInputStream.read(bytes);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
