package javamarathon.javacore.concurrency.test;


import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest01 {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            reentrantLock.lock();
            try {
                if (reentrantLock.isHeldByCurrentThread()) {
                    System.out.printf("Thread %s entrou no method. %n", name);
                    System.out.printf("%d threads estão na fila. %n", reentrantLock.getQueueLength());
                    System.out.printf("Thread %s vai esperar 2s. %n", name);
                    Thread.sleep(2000);
                    System.out.printf("Thread %s finalizou a sessão. %n", name);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                reentrantLock.unlock();
            }
        };

        Thread t1 = new Thread(runnable, "A");
        Thread t2 = new Thread(runnable, "B");
        Thread t3 = new Thread(runnable, "C");
        Thread t4 = new Thread(runnable, "D");
        Thread t5 = new Thread(runnable, "E");
        Thread t6 = new Thread(runnable, "F");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
