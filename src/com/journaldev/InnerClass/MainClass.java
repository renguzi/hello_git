package com.journaldev.InnerClass;

import java.util.logging.Logger;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-10
 * @Description: com.journaldev.InnerClass
 * @Version:1.0
 */
public class MainClass {
    private String s_main_class;

    public void print() {
        String s_print_method = "";
        class Logger {
            String name = s_main_class;
            String name1 = s_print_method;

            public void foo() {
                String s = s_main_class;
                s_main_class = "test";
                System.out.println(s_main_class);
                String name1 = s_print_method;
//                s_print_method = "new";
            }
        }
        Logger logger = new Logger();
        logger.foo();
        System.out.println(logger.name);
    }

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.print();

    }
}
