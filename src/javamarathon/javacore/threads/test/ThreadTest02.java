package javamarathon.javacore.threads.test;

class Corredor implements Runnable {
    private String nome;

    public Corredor(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nome + " está no passo " + i);

            if (nome.equals("Corredor ALTA Prioridade")) {
                System.out.println("--- " + nome + " tentando dar a vez com yield() ---");
                // Vai tentar ceder a vez
//                Thread.yield();
            }
        }
        System.out.println(">>> " + nome + " FINALIZOU!");
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Corredor("Corredor BAIXA Prioridade"));
        Thread t2 = new Thread(new Corredor("Corredor ALTA Prioridade"));

        // Definindo as prioridades (Sugestões ao SO)
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();

        // o running faz todos os processos e a thread main bloqueia todas as outras threads até que os processos finalizem.
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}