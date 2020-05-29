package com.journaldev.IOOperation;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-25
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaAppendToFile {
    public static void main(String[] args) {
        String filePath = "/Users/asher/imooc/append.txt";
        String appendText = "This string will be appended to the file,Byte=0x0A 0xFF";
        appendUsingFileWriter(filePath, appendText);
        appendUsingBufferedWriter(filePath, appendText, 10);
        appendUsingPrintWriter(filePath, appendText);
        appendUsingFileOutputStream(filePath,appendText);

    }

    private static void appendUsingPrintWriter(String filePath, String text) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void appendUsingFileOutputStream(String fileName, String data) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File(fileName), true);
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

    private static void appendUsingBufferedWriter(String filePath, String text, int noOfLines) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter= null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < noOfLines; i++) {
                bufferedWriter.newLine();
                bufferedWriter.write(text);
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

    private static void appendUsingFileWriter(String filePath, String text) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter=new FileWriter(file);
            fileWriter.write(text);
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
