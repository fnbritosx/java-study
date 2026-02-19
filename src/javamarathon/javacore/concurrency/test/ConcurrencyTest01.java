package javamarathon.javacore.concurrency.test;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private int count;
    AtomicInteger atomicInteger = new AtomicInteger();

    void increment(){
        count++;
        atomicInteger.incrementAndGet();
    }

    public int getCount() {
        return count;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }
}

public class ConcurrencyTest01 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
        System.out.println(counter.getAtomicInteger());
    }
}
