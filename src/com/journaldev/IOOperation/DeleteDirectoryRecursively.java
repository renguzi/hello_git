package com.journaldev.IOOperation;

import java.io.File;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class DeleteDirectoryRecursively {
    public static void main(String[] args) {
        String path = "/Users/asher/IdeaProjects/Journaldev/src/com/journaldev/IOOPeration/tmp1";

         DeleteFolderRecursively(new File(path));

    }

    public static void DeleteFolderRecursively(File file) {

        if (!file.exists()) {
            return;
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for ( File f: files
                 ) {
                if (f.isDirectory()) {
                    DeleteFolderRecursively(f);
                }
                else
                f.delete();
                System.out.println(f + " deleted.");
            }
        }
        file.delete();
        System.out.println(file + " deleted.");

    }

}
