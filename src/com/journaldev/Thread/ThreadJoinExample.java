package com.journaldev.Thread;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Myrunnable(), "t1");
        Thread t2 = new Thread(new Myrunnable(), "t2");
        Thread t3 = new Thread(new Myrunnable(), "t3");
        t1.start();
        try {
            t1.join(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads are dead,exiting main thread");
    }
}

class Myrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started:::" + Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::" + Thread.currentThread().getName());
    }
}
