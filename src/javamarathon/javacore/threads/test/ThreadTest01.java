package javamarathon.javacore.threads.test;

import java.util.Scanner;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("A thread foi interrompida.");
            }
            if (i == 5) {
                System.out.println();
                System.out.println("\u001B[31mO tempo acabou!\u001B[0m");
                System.exit(0);
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("Você tem 5 segundos para digitar o seu nome.");
        System.out.print("Digite o seu nome: ");
        String nameUser = scanner.nextLine();

        System.out.println("Olá " + nameUser);

    }
}
