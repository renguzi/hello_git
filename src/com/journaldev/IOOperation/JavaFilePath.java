package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaFilePath {
    public static void main(String[] args) throws IOException {
        File file = new File(new String("/Users/asher/apache-jmeter-5.1.1.zip"));
        printPaths(file);

        file = new File("test.xsd");
        printPaths(file);

        file = new File("/Users/asher/../apache-jmeter-5.1.1.zip");
        printPaths(file);

        file = new File("file:///Users/asher/apache-jmeter-5.1.1.zip");
        printPaths(file);

    }

    public static void printPaths(File file) throws IOException {
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());
        System.out.println("Path: " + file.getPath());
    }
}
