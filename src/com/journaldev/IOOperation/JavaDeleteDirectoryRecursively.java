package com.journaldev.IOOperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaDeleteDirectoryRecursively {
    public static void main(String[] args) throws IOException {
        Path directory = Paths.get("/Users/asher/IdeaProjects/Journaldev/src/com/journaldev/IOOPeration/tmp/");
        Files.walkFileTree(directory, new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                System.out.println(file + " deleted");
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                System.out.println(dir + " deleted");
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
