package com.journaldev.IOOperation.IMOOC;

import java.io.*;
import java.util.Random;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-22
 * @Description: com.journaldev.IOOperation.IMOOC
 * @Version:1.0
 */
public class Worm implements Serializable {
    private static Random random = new Random(47);
    private Data[] d = {
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10)),
            new Data(random.nextInt(10))
    };
    private Worm next;
    private char c;

    public Worm(int i, char x) {
        System.out.println("Worm constructor: " + i);
        c = x;
        if (--i > 0) {
            next = new Worm(i, (char) (x + 1));
        }
    }

    public Worm() {
        System.out.println("Default constructor");
    }

    public String toString() {
        StringBuilder result = new StringBuilder(":");
        result.append(c);
        result.append("(");
        for (Data data: d
             ) {
            result.append(data);
        }
        result.append(")");
        if (next != null)
            result.append(next);
            return result.toString();
    }

    public static void main(String[] args) throws ClassNotFoundException,IOException {
        Worm w = new Worm(6, 'a');
        System.out.println("w= " + w);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("worm.out"));
        objectOutputStream.writeObject("Worm storage\n");
        objectOutputStream.writeObject(w);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("worm.out"));
        String s = (String) objectInputStream.readObject();
        Worm w2 = (Worm) objectInputStream.readObject();
        System.out.println(s + "w2 = " + w2);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream1=new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream1.writeObject("Worm storage\n");
        objectOutputStream1.writeObject(w);
        objectOutputStream1.flush();
        ObjectInputStream objectInputStream1=new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));

        s = (String) objectInputStream1.readObject();
        Worm w3 = (Worm) objectInputStream1.readObject();
        System.out.println(s + "w3 = " + w3);
    }

}
