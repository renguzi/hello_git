package com.journaldev.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-04
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class CustomExceptionExample {
    public static void main(String[] args) throws MyException {
        try {
            processFile("file.txt");
        } catch (MyException e) {
            processErrorCodes(e);
         }
    }


    public static void processErrorCodes(MyException e) throws MyException {
        switch (e.getErrorCode()) {
            case "BAD_FILE_TYPE":
                System.out.println("Bad file Type,notify user");
                throw e;
            case "FILE_NOT_FOUND_EXCEPTION":
                System.out.println("File not found,notify user");
                throw e;
            case "FILE_CLOSE_EXCEPTION":
                System.out.println("File close failed,jut log it.");
                throw e;
            default:
                System.out.println("Unknown exception." + e.getMessage());
                e.printStackTrace();
        }
    }

    public static void processFile(String file) throws MyException {
        InputStream fis = null;
        try {
            fis=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new MyException(e.getMessage(), "FILE_NOT_FOUND_EXCEPTION");
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new MyException(e.getMessage(), "FILE_CLOSE_EXCEPTION");
              }
        }
    }
}
