package com.journaldev.ThreadPool;

public class WorkerThread implements Runnable{
    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start . command" + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " end.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "WorkerThread{" +
                "command='" + command + '\'' +
                '}';
    }
}
