package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaFilePermissions {
    public static void main(String[] args) {
        File file = new File("/Users/asher/d.txt");
        System.out.println("Readable：" + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        file.setReadable(false);
        file.setWritable(false);
        file.setExecutable(false);

        file.setReadable(true, false);
        file.setWritable(true, false);
        file.setExecutable(true, true);

    }
}
