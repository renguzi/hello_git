package com.journaldev.AbstractFactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-17
 * @Description: com.journaldev.AbstractFactoryPattern
 * @Version:1.0
 */
public class Server extends Computer {
    private String cpu;
    private String hdd;
    private String ram;

    public Server(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
