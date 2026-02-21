package javamarathon.javacore.concurrency.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {

            Future<String> submit = executorService.submit(() -> {
                double result = 5.4D;
                System.out.println("Calculando o valor do dolar em relação ao real.");

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                return String.format("O valor final é %.2f.%n", result);
            });

            try {
                String s = submit.get();

                System.out.println(s);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Program finished. ");

        }

    }
}
