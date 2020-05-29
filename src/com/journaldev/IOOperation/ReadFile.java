package com.journaldev.IOOperation;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-23
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class ReadFile {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/asher/imooc/imooc1.txt";
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
//        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (byte b: bytes
             ) {
            System.out.print((char) b);

        }

        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

//
        FileInputStream fileInputStream=new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
        String line1;
        while ((line1 = bufferedReader1.readLine()) != null) {
            System.out.println(line1);
        }
        bufferedReader1.close();

        Scanner scanner = new Scanner(path);
        System.out.println("read text file using scanner.");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }
}
