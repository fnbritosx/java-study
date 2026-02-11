package javamarathon.javacore.threads.test;

import javamarathon.javacore.threads.domain.Account;

public class ThreadAccountTest01 {
    public static void main(String[] args) {
        final Account account = new Account();
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Fora do syncronized.");
                synchronized (account) {
                    System.out.println(Thread.currentThread().getName() + " Dentro do syncronized.");
                    account.withdrawal(10);
                }
            }
        };

        Thread t1 = new Thread(runnable, "Fernando");
        Thread t2 = new Thread(runnable, "Isabela");


        t1.start();
        t2.start();
    }
}
