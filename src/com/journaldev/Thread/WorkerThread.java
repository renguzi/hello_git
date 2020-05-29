package com.journaldev.Thread;

import java.util.Date;

public class WorkerThread implements Runnable{
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public String toString() {
        return "WorkerThread{" +
                "command='" + command + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Time=" + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End. Time=" + new Date());
    }

    private void processCommand() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
