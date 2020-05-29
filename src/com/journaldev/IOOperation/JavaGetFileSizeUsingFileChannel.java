package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaGetFileSizeUsingFileChannel {
    static  final String FILE_NAME="/Users/asher/apache-jmeter-5.1.1.zip";

    public static void main(String[] args) {
        Path filePath = Paths.get(FILE_NAME);
        FileChannel fileChannel;
        try {
            fileChannel = FileChannel.open(filePath);
            long filesize = fileChannel.size();
            System.out.println("bytes:" + filesize);
            fileChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileUtils.sizeof(new File(FILE_NAME));
    }
}
