package com.journaldev.IOOperation;

import java.io.File;
/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaDeleteDirectory {
    public static void main(String[] args) {
        File file = new File("/Users/asher/IdeaProjects/Journaldev/src/com/journaldev/IOOPeration/tmp/");
        if (!(file.isDirectory())) {
            System.out.println(file + "is not a directory,do nothing");
            return;
        }
        File[] files = file.listFiles();
        for (File f: files
             ) {
            f.delete();
            System.out.println(f + "deleted. from " + file);
        }
        System.out.println("Deleting directory. success=" + file.delete());
    }
}
