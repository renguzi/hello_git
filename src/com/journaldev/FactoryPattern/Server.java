package com.journaldev.FactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.FactoryPattern
 * @Version:1.0
 */
public class Server extends Computer {
    private String RAM;
    private String HDD;
    private String CPU;

    public Server(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
