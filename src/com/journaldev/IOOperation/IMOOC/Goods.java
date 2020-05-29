package com.journaldev.IOOperation.IMOOC;

import java.io.Serializable;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class Goods implements Serializable {
    private String goodId;
    private String goodName;
    private double goodPrice;

    public Goods(String goodId, String goodName, double goodPrice) {
        this.goodId = goodId;
        this.goodName = goodName;
        this.goodPrice = goodPrice;
    }

    public String getGoodId() {
        return goodId;
    }

    public void setGoodId(String goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(double goodPrice) {
        this.goodPrice = goodPrice;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodId='" + goodId + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodPrice=" + goodPrice +
                '}';
    }
}
