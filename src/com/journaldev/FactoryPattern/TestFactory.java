package com.journaldev.FactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.FactoryPattern
 * @Version:1.0
 */
public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "100GB", "3GHZ");
        Computer server = ComputerFactory.getComputer("Server", "128GB", "1TB", "3.5GHZ");
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
