package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-21
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class StreamCopyCompareBufferCopy {
    public static void main(String[] args) {
        File source = new File("/Users/asher/imooc/Word.javaz.cp");
        File dest=new File("/Users/asher/imooc/Word.javaz");
        long t1 = System.currentTimeMillis();
//        copyFileUsingStream(source, dest);
        copyFileUsingBufferedStream(source, dest);
        long t2 = System.currentTimeMillis();
        System.out.println("t2-t1 = " + (t2 - t1));


    }


    public static void copyFileUsingStream(File source, File dest) {
        try {
            FileInputStream fileInputStream = new FileInputStream(source);
            FileOutputStream fileOutputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int n=0;
            while ((n = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, n);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void copyFileUsingBufferedStream(File source, File dest) {
        try {
            FileInputStream fileInputStream=new FileInputStream(source);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            FileOutputStream fileOutputStream=new FileOutputStream(dest);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] buffer = new byte[1024];
            int n;
            while ((n = bufferedInputStream.read(buffer)) > 0) {
                bufferedOutputStream.write(buffer, 0, n);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
