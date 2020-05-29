package com.journaldev.FactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.FactoryPattern
 * @Version:1.0
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        }
        if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
