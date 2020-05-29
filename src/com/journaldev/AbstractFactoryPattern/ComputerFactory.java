package com.journaldev.AbstractFactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.AbstractFactoryPattern
 * @Version:1.0
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
