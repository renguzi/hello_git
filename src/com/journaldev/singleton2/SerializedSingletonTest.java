package com.journaldev.singleton2;

import java.io.*;

public class SerializedSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton serializedSingletonOne = SerializedSingleton.getInstance();
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        objectOutput.writeObject(serializedSingletonOne);
        objectOutput.close();
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("filename.ser"));

        SerializedSingleton serializedSingletonTwo = (SerializedSingleton) objectInput.readObject();
        objectInput.close();
        System.out.println(serializedSingletonOne.hashCode());
        System.out.println(serializedSingletonTwo.hashCode());
    }
}
