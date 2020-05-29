package com.journaldev.IOOperation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class ReadFileLineByLineUsingRadomAccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("/Users/asher/imooc/imooc1.txt", "r")) {
            String line;
            while ((line = randomAccessFile.readLine()) != null) {
                System.out.println(line);
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
