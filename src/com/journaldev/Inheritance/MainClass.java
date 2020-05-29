package com.journaldev.Inheritance;

import java.util.logging.Logger;

/**
 * @Author: Asher Huang
 * @Date: 2020-02-26
 * @Description: com.journaldev.Inheritance
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
                String name1 = s_print_method;
            }
        }
        Logger logger = new Logger();
    }
}
