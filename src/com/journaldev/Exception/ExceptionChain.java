package com.journaldev.Exception;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.Exception
 * @Version:1.0
 */
public class ExceptionChain {
    public static void main(String[] args) {

        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne() throws CustomeException {
        throw new CustomeException();
    }

    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("我是新产生的异常1");
        }

    }

    public static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Throwable e) {
             throw new Exception("我是新产生的异常2");
//            e.printStackTrace();
        }
    }
}
