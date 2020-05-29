package com.journaldev.FactoryPattern;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-09
 * @Description: com.journaldev.FactoryPattern
 * @Version:1.0
 */
public abstract class Computer {
    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public String toString() {
        return "RAM=" + this.getRAM() + " HDD=" + this.getHDD() + " CPU=" + this.getCPU();
    }
}
