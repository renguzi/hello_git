package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class DeleteFileJava {
    public static void main(String[] args) {

        File file=new File("/Users/asher/file.txt");
        if (file.delete()) {
            System.out.println("/Users/asher/file.txt File deleted.");
        } else {
            System.out.println("File /Users/asher/file.txt doesn't exists.");
        }

        file = new File("file.txt");
        if (file.delete()) {
            System.out.println("file.txt File deleted from Project root directory");
        } else {
            System.out.println("file.txt doesn't exist under Project root directory");
        }

        file = new File("tmp/file.txt");
        if (file.delete()) {
            System.out.println("tmp/file.txt File deleted from Project root directory");
        } else {
            System.out.println("tmp/file.txt File doesn't exist in Project root directory");
        }

        file = new File("tmp");
        if (file.delete()) {
            System.out.println("tmp directory deleted from Project root directory");
        } else {
            System.out.println("tmp directory doesn't exist or it is not empty");
        }

        file = new File("/Users/asher/IdeaProjects");
        if (file.delete()) {
            System.out.println("directory deleted");
        } else {
            System.out.println("directory is not empty");
        }
    }
}
