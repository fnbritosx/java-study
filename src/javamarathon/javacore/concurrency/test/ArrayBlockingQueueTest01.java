package javamarathon.javacore.concurrency.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);

        Runnable runnable = () ->{
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removing value from queue %s%n", Thread.currentThread().getName(), blockingQueue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        blockingQueue.put("Fernando");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), blockingQueue.peek());

        new Thread(runnable).start();

        blockingQueue.put("Brito");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), blockingQueue.peek());

        new Thread(runnable).start();

        blockingQueue.put("Neto");
        System.out.printf("%s added the value %s%n", Thread.currentThread().getName(), blockingQueue.peek());

    }
}
