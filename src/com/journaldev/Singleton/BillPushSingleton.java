package com.journaldev.Singleton;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-06
 * @Description: com.journaldev.Singleton
 * @Version:1.0
 */
public class BillPushSingleton {
    private BillPushSingleton() {
    }

    private static class SingletonHelper{
        private static final BillPushSingleton BILL_PUSH_SINGLETON=new BillPushSingleton();
    }

    public static BillPushSingleton getInstance() {
        return SingletonHelper.BILL_PUSH_SINGLETON;
    }
}
