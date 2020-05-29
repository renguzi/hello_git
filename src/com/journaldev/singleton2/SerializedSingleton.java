package com.journaldev.singleton2;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID=-760001234L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper{
        private static final SerializedSingleton SERIALIZED_SINGLETON = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.SERIALIZED_SINGLETON;
    }

}
