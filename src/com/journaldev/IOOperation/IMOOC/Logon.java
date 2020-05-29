package com.journaldev.IOOperation.IMOOC;

import java.io.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public Logon(String name, String password) {
        this.username = name;
        this.password = password;
    }

    public String toString() {
        return "logon info:\n username: "+username+"\n date: "+date+"\n password："+password;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Logon a = new Logon("hulk", "MylittleBoy");
        System.out.println("logon a = " + a);
        OutputStream out;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        objectOutputStream.writeObject(a);
        objectOutputStream.close();

        TimeUnit.SECONDS.sleep(2);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println("Recovering object at " + new Date());
        a = (Logon) objectInputStream.readObject();
        System.out.println("logon a = " + a);


    }
}
