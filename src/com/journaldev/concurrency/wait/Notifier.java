package com.journaldev.concurrency.wait;

public class Notifier implements Runnable{
    private Message message;

    public Notifier(Message msg) {
        this.message = msg;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.setMessage(name+" Notifier work done");
//                message.notify();
                message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
