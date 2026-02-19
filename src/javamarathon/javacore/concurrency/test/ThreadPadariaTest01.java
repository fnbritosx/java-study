package javamarathon.javacore.concurrency.test;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class Cesta {
    ReentrantLock reentrantLock = new ReentrantLock();
    Condition condition = reentrantLock.newCondition();

    private int paes = 0;
    private final int CAPACIDADE = 5;


    public void produzir() throws InterruptedException {
        reentrantLock.lock();
        try {
            while (paes == CAPACIDADE) {
                System.out.println("Cesta cheia! Padeiro descansando...");
                condition.await();
            }
            paes++;
            System.out.println("Padeiro colocou 1 pão. Total: " + paes);
            condition.signalAll();
        } finally {
            if (reentrantLock.isHeldByCurrentThread()) {
                reentrantLock.unlock();
            }
        }
    }

    public void consumir() throws InterruptedException {
        reentrantLock.lock();
        try {
            while (paes == 0) {
                System.out.println("Cesta vazia! Cliente esperando pão...");
                condition.await();
            }
            paes--;
            System.out.println("Cliente comprou 1 pão. Total: " + paes);
            condition.signalAll();
        } finally {
            if (reentrantLock.isHeldByCurrentThread()) {
                reentrantLock.unlock();
            }
        }
    }
}

public class ThreadPadariaTest01 {
    public static void main(String[] args) {

        Cesta cesta = new Cesta();

        Thread padeiro = new Thread(() -> {
            try {
                while (true) {
                    cesta.produzir();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread cliente = new Thread(() -> {
            try {
                while (true) {
                    cesta.consumir();
                    Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        padeiro.start();
        cliente.start();
    }
}

