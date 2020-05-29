package com.journaldev.IOOperation;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-18
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class FileNameFilterExample {
    public static void main(String[] args) {
        String dir = "/Users/asher";
        String extension = ".txt2";
        findFiles(dir, extension);

    }

    public static void findFiles(String dir, String extension) {
        File file = new File(dir);
        if (!file.exists()) {
            System.out.println(dir + " Directory doesn't exists");
        }
        File[] listFiles = file.listFiles(new MyFileNameFilter(extension));
        if (listFiles.length == 0) {
            System.out.println(dir + "doesn't contain any file with extension " + extension);
        } else {
            for ( File f: listFiles
                 ) {
                System.out.println("File: " + dir + File.separator + f.getName());
            }
        }
    }

    public static class MyFileNameFilter implements FilenameFilter {

        private String extension;

        public MyFileNameFilter(String extension) {
            this.extension = extension;
        }

        @Override
        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith(extension);
        }
    }
}
