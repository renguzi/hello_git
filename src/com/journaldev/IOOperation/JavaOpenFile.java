package com.journaldev.IOOperation;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-24
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaOpenFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/asher/imooc/imooc1.txt");

        if (!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if (file.exists()) {
            desktop.open(file);
        }
    }
}
