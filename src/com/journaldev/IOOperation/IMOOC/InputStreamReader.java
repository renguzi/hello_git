package com.journaldev.IOOperation.IMOOC;

import sun.nio.cs.ext.GBK;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class InputStreamReader {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/asher/imooc/imooc.txt");
            java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/asher/imooc/imooc1.txt");
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);

            int n=0;
//            while ((n = inputStreamReader.read()) != -1) {
//                System.out.print((char)n);
//            }
            char[] chars = new char[10];
            while ((n = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars, 0, n);
//                System.out.print(new String(chars,0,n));
            }
            fileOutputStream.close();

            outputStreamWriter.close();
//            fileOutputStream.close();

            fileInputStream.close();
            inputStreamReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
