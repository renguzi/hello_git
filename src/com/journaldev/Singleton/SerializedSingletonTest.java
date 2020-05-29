package com.journaldev.Singleton;

import java.io.*;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class SerializedSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingleton=SerializedSingleton.getInstance();
//        SerializedSingleton serializedSingleton1=new SerializedSingleton();
        FileOutputStream fileOutputStream = new FileOutputStream("filename.ser");
        ObjectOutput out=new ObjectOutputStream(fileOutputStream);
        out.writeObject(serializedSingleton);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton serializedSingleton2;
        serializedSingleton2 = (SerializedSingleton) in.readObject();
        in.close();
        System.out.println(serializedSingleton.hashCode());
        System.out.println(serializedSingleton2.hashCode());

    }
}
