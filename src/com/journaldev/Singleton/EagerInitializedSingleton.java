package com.journaldev.Singleton;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
