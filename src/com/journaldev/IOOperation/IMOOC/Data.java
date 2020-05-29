package com.journaldev.IOOperation.IMOOC;

import javax.sql.DataSource;
import java.io.Serializable;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
class Data implements Serializable {
    private  int n;

    public Data(int n) {
        this.n = n;
    }

    public String toString() {
        return Integer.toString(n);
    }

}
