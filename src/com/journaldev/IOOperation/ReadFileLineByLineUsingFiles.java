package com.journaldev.IOOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class ReadFileLineByLineUsingFiles {
    public static void main(String[] args) {
        try {
            List<String> stringList = Files.readAllLines(Paths.get("/Users/asher/imooc/imooc1.txt"));
            for (String lines: stringList
                 ) {
                System.out.println(lines);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
