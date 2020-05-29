package com.journaldev.InnerClass1;

import java.util.logging.Logger;

public class MainClass {
    private String s_main_class;

    public void print() {
        String s_print_method = "";
        class Logger{
            String name = s_main_class;
            String name1 = s_print_method;

            public void foo() {
                String name1 = s_print_method;
//                s_print_method=":";
            }
        }
        Logger logger = new Logger();
    }
}
