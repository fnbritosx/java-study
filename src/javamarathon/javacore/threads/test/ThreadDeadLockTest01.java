package javamarathon.javacore.threads.test;

public class ThreadDeadLockTest01 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + ": Segurando lock 1...");
                System.out.println(Thread.currentThread().getName() + ": Esperando pelo lock 2...");

                // Pequeno sleep para garantir que a outra thread pegue o lock 2
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + ": Conseguiu o lock 2!");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) { // Inverteu a ordem!
                System.out.println(Thread.currentThread().getName() + ": Segurando lock 2...");
                System.out.println(Thread.currentThread().getName() + ": Esperando pelo lock 1...");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + ": Conseguiu o lock 1!");
                }
            }
        };

        new Thread(r1, "Thread-Fernando").start();
        new Thread(r2, "Thread-Isabela").start();
    }
}

