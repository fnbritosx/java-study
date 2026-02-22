package javamarathon.javacore.concurrency.test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        System.out.println("--- Iniciando Processamento de Folha de Pagamento ---");

        CompletableFuture<String> buscaNome = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "Fernando Brito";
        });

        CompletableFuture<Double> buscaSalario = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (Math.random() > 0.8) throw new RuntimeException("Erro ao conectar ao RH.");

            System.out.printf("A Thread %s achou o valor: ", Thread.currentThread().getName());
            return 2000.0;

        }).exceptionally((err)->{
            System.err.println("Erro: " + err.getMessage());
            return 0.0;
        });

        buscaNome.thenAccept((name) -> {
            System.out.printf("Processamento finalizado para: %s%n", name);
        });

       CompletableFuture<String> resultadoFinal = buscaNome.thenCombine(buscaSalario, (nome, salarioNum) ->{
           double bonus = salarioNum * 0.1;
           return String.format("Funcionário: %s | Salário + Bônus: R$ %.2f", nome, (salarioNum + bonus));
       }).thenApply(String::toUpperCase);

       resultadoFinal.thenAccept(System.out::println);

        resultadoFinal.join();
        System.out.println("--- Fim do Programa ---");
    }
}

