package com.journaldev.IOOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class ReadFileLineByLineUsingBufferedReader {
    public static void main(String[] args) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/Users/asher/imooc/imooc1.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
