package com.journaldev.IOOperation;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-19
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/asher/d.txt";
//        readUsingFileReader(fileName);
//        readUsingBufferedReader(fileName, StandardCharsets.UTF_8);
//        readUsingBufferedReaderJava7(fileName, StandardCharsets.UTF_8);
//        readUsingScanner(fileName);
        readUsingFiles(fileName);
    }

    private static void readUsingFileReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fileReader=new FileReader(file);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
          String line;
            System.out.println("Reading text file using FileReader");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, cs);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws IOException {
        Path path = Paths.get(fileName);
        BufferedReader bufferedReader = Files.newBufferedReader(path,cs);
        String line;
        System.out.println("Read text file using BufferedReader Java 7 improvement");
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }

    private static void readUsingScanner(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using scanner");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    private static void readUsingFiles(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        System.out.println("Read text file using Files class.");
        List<String> strings = Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(new String(bytes));
        System.out.println(strings);
    }
}
