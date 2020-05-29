package com.journaldev.IOOperation;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-25
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class InputStreamToFile {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("/Users/asher/imooc/append.txt");
            OutputStream outputStream = new FileOutputStream("/Users/asher/imooc/append_new.txt");
            byte[] buffer = new byte[10];
            int n;
            while ((n = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, n);
            }
            outputStream.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
