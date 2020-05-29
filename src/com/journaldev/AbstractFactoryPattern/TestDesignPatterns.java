package com.journaldev.AbstractFactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.AbstractFactoryPattern
 * @Version:1.0
 */
public class TestDesignPatterns {
    public static void main(String[] args) {
       testAbstractFactory();
    }

    public static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "1.5GHZ", "100GB"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "3.5GHZ", "1TB"));
        System.out.println(pc);
        System.out.println(server);
    }
}
