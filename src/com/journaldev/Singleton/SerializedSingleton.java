package com.journaldev.Singleton;

import java.io.Serializable;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {

    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }


}
