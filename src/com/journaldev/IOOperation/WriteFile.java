package com.journaldev.IOOperation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class WriteFile {
    public static void main(String[] args) {
        String data = "I will write this String to File in Java";

        WriteUsingOutputStream(data);
        WriteUsingFiles(data);
        WriteUsingBufferedWriter(data,1000);
        WriteUsingFileWriter(data);

    }

    public static void WriteUsingOutputStream(String data) {
        OutputStream outputStream = null;
        File file;
        try {
            outputStream = new FileOutputStream(new File("/Users/asher/imooc/os.txt"));
            outputStream.write(data.getBytes(), 0, data.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void WriteUsingFiles(String data) {
        try {
            Files.write(Paths.get("/Users/asher/imooc/os2.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("/Users/asher/imooc/os3.txt");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        String dataWithNewLine = data + System.getProperty("line.separator");
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = noOfLines; i > 0; i--) {
                bufferedWriter.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void WriteUsingFileWriter(String data) {
        File file = new File("/Users/asher/imooc/os4.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
