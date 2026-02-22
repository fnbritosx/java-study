package javamarathon.javacore.concurrency.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CompletableFutureTest02 {
    public static void main(String[] args) {

        List<String> historyOfAlek = List.of("LC", "Alek", "Chefona");

        Map<String, String> valuesOfHistory = new HashMap<>();
        valuesOfHistory.put("LC", "Elite");
        valuesOfHistory.put("Alek", "Classe");
        valuesOfHistory.put("Chefona", "Puta do cu cagado");

        System.out.println("--- Iniciando Processamento Paralelo ---");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> futures = historyOfAlek.stream()
                .map(name -> CompletableFuture.supplyAsync(() -> {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String status = valuesOfHistory.get(name);
                    return String.format("Resultado: %s é [%s]", name, status);
                }))
                .toList();

        System.out.println("Thread main livre!");
        System.out.println("Integrantes da historia do Alexander: ");

        List<String> resultados = futures.stream()
                .map(CompletableFuture::join)
                .toList();

        resultados.forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Tempo total de execução: %d segundos%n", (end - start) / 1000);
    }
}