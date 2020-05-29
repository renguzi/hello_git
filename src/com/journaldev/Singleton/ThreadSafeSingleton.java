package com.journaldev.Singleton;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
