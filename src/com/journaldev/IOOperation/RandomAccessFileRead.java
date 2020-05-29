package com.journaldev.IOOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-26
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class RandomAccessFileRead {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/asher/imooc/imooc1.txt", "r");
            byte[] bytes = new byte[5000];
//            for (byte b: bytes
//            ) {
//                System.out.println((String.valueOf(b)));
//
//            }
            randomAccessFile.seek(1);
            System.out.println(randomAccessFile.getFilePointer());
            System.out.println(randomAccessFile.length());
            randomAccessFile.read(bytes);
            randomAccessFile.close();
            System.out.println(new String(bytes));
            System.out.println(bytes.length);
//            for (byte b: bytes
//                 ) {
//                System.out.println((String.valueOf(b)));
//
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String s = "women";
        System.out.println((s.getBytes()).toString());

        appendData("/Users/asher/imooc/imooc1.txt",s);

    }


    private static void appendData(String fileName, String data) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(fileName), "rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(data.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
