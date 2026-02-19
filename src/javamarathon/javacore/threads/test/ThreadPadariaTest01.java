package javamarathon.javacore.threads.test;

class Cesta {
    private int paes = 0;
    private final int CAPACIDADE = 5;

    public synchronized void produzir() throws InterruptedException {
        while (paes == CAPACIDADE) {
            System.out.println("Cesta cheia! Padeiro descansando...");
            wait();
        }
        paes++;
        System.out.println("Padeiro colocou 1 pão. Total: " + paes);
        notifyAll();
    }


    public synchronized void consumir() throws InterruptedException {
        while (paes == 0) {
            System.out.println("Cesta vazia! Cliente esperando pão...");
            wait();
        }
        paes--;
        System.out.println("Cliente comprou 1 pão. Total: " + paes);
        notifyAll();
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

