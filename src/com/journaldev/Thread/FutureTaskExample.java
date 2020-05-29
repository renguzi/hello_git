package com.journaldev.Thread;

import java.util.concurrent.*;

public class FutureTaskExample {
    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable(1000);
        MyCallable callable2 = new MyCallable(2000);
        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);
        while (true) {
            try{
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    executorService.shutdown();
                    return;
                }
                if (!futureTask1.isDone()) {
                    System.out.println("FutureTask1 output=" + futureTask1.get());
                }
                System.out.println("Waiting for FutureTask2 to complete");
                String s = futureTask2.get(200L, TimeUnit.MILLISECONDS);
                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }

        }
    }

    static class MyCallable implements Callable<String> {
        private long WaitTime;

        public MyCallable(int waitTime) {
            this.WaitTime = waitTime;
        }

        @Override
        public String call() throws Exception {
            Thread.sleep(WaitTime);
            return Thread.currentThread().getName();
        }
    }
}

