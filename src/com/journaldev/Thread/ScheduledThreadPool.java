package com.journaldev.Thread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
    public static void main(String[] args) throws InterruptedException {
        String greeting = "Hello";
        int n = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        int[] ints = greeting.codePoints().toArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        System.out.println("Current Time = " + new Date());
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            WorkerThread workerThread = new WorkerThread("do heavey processing");
//            scheduledExecutorService.schedule(workerThread, 10, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleAtFixedRate(workerThread, 0, 10, TimeUnit.SECONDS);
        }
        Thread.sleep(30000);
        scheduledExecutorService.shutdown();
        while (!scheduledExecutorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
