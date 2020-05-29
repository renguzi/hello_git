package com.journaldev.IOOperation.IMOOC;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class Blip3 implements Externalizable {
    private int i;
    private String s;

    public Blip3() {
        System.out.println("Blip3 Constructor.");
    }

    public Blip3(String x, int a) {
        System.out.println("Blip3(String x,int a)");
        s = x;
        i = a;
    }

    public String toString() {
        return s+i;
    }



    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip3.writeExternal");
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        s = (String) in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Constructing objects.");
        Blip3 blip3 = new Blip3("A string", 47);
        File file;
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Blip3.out"));
        System.out.println("Saving objects.");
        objectOutputStream.writeObject(blip3);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Blip3.out"));
        System.out.println("Recovering blip3:");
        blip3 = (Blip3) objectInputStream.readObject();
        System.out.println(blip3);
    }
}
