package com.journaldev.IOOperation;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaReadFileToString {
    public static void main(String[] args) {
        String fileName = "/Users/asher/imooc/imooc1.txt";
//        System.out.println(readUsingBufferedReaderCharArray(fileName));
        System.out.println(readUsingFileInputStream(fileName));

    }


    private static String readUsingBufferedReaderCharArray(String fileName) {
        String content;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            StringBuilder stringBuilder = new StringBuilder();
            char[] buffer = new char[10];
            while (bufferedReader.read(buffer) != -1) {
                stringBuilder.append(new String(buffer));
                buffer = new char[10];
            }
            bufferedReader.close();
            content = stringBuilder.toString();
            return content;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String readUsingFileInputStream(String filename) {
        StringBuilder stringBuilder=new StringBuilder();
        try {
            InputStream inputStream = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            char[] buffer = new char[10];
            while (bufferedReader.read() != -1) {
                stringBuilder.append(buffer);
                buffer = new char[10];
            }
            bufferedReader.close();
//            return stringBuilder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        BufferedReader bufferedReader=new Bu
        return stringBuilder.toString();
    }

    private static String readUsingBufferedReader(String fileName) {
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            String ls = System.getProperty("line.separator");
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stringBuilder.toString();
    }

    private static String readUsingFiles(String fileName) {
//        String s = null;
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String readUsingScanner(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
            String data = scanner.useDelimiter("\\A").next();
            return data;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }

}
