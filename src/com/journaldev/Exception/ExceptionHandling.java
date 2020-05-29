package com.journaldev.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-04
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        try {
            testException(-5);
            testException(-10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("releasing resources.");
        }
        testException(15);

    }

    public static void testException(int i) throws IOException,FileNotFoundException {
        if (i < 0) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Negative Integer:" + i);
            throw fileNotFoundException;
        } else if (i > 10) {
            throw new IOException("only supported for index 0 to 10");
        }
    }
}
