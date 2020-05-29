package com.journaldev.IOOperation;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-19
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaCopyFile {
    public static void main(String[] args) {
        String fileSource = "/Users/asher/d.txt";
        String fileDest = "/Users/asher/d.txt.cp";
        copyFileUsingStream(new File(fileSource), new File(fileDest));
//        copyFileUsingChannel(new File(fileSource), new File(fileDest));
//        copyFileUsingJava7Files(new File(fileSource), new File(fileDest));
    }

    public static void copyFileUsingStream(File source, File dest) {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffer = new byte[14];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
//                System.out.println("length= " + length);
//                System.out.println("length= " + inputStream.read(buffer));

                outputStream.write(buffer);
//                outputStream.write(buffer, 0, length);
//                outputStream.write(buffer, 0, inputStream.read(buffer));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileUsingChannel(File source, File dest) {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                sourceChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                destChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFileUsingJava7Files(File source, File dest) {
        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
