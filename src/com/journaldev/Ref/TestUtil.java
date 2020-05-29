package com.journaldev.Ref;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-05
 * @Description: com.journaldev.Ref
 * @Version:1.0
 */
public class TestUtil {
    public static void main(String[] args) {
        String s = "hello";
        ClassUtil.printClassMessage(s);
        Integer i=10;
        ClassUtil.printClassMessage(i);

        System.out.println("=====================");
        ClassUtil.printFieldMessage("hello");
        System.out.println("--------------------------");
        ClassUtil.printConstructorMessage(new Integer(1));
    }
}
