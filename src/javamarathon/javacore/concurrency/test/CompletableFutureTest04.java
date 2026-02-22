package javamarathon.javacore.concurrency.test;

import javamarathon.javacore.concurrency.domain.Discount;
import javamarathon.javacore.concurrency.domain.Quote;

import java.util.List;
import java.util.concurrent.*;


public class CompletableFutureTest04 {
    public static void main(String[] args) {
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        getPriceAsync(stores);

    }


    public static String getPriceSync(String nameStore) {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int price = ThreadLocalRandom.current().nextInt(1, 50) * 10;

        Discount valueDiscount = Discount.values()[ThreadLocalRandom.current().nextInt(Discount.values().length)];

        return String.format("%s:%d:%s", nameStore, price, valueDiscount);
    }

    public static void getPriceAsync(List<String> nameStore) {
        long start = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newFixedThreadPool(Math.min(nameStore.size(), 100), (runnable) -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        })) {

            List<CompletableFuture<Void>> completableFutures = nameStore.stream()
                    .map(s -> CompletableFuture.supplyAsync(() -> getPriceSync(s), executorService))
                    .map(cf -> cf.thenApply(Quote::newQuote))
                    .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> {

                        int i = ThreadLocalRandom.current().nextInt(200, 2500);

                        try {
                            TimeUnit.MILLISECONDS.sleep(i);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        double precoFinal = quote.getPrice() * (100 - quote.getDiscount().getPercentage()) / 100;

                        return String.format("%s preço original: %.2f. Aplicando código de desconto: %s. Preço final: %.2f"
                                , quote.getStoreName(), quote.getPrice(), quote.getDiscount(), precoFinal);
                    }, executorService)))
                    .map(cf -> cf.thenAccept(store -> System.out.printf("%s finalizou em %d%n", store, (System.currentTimeMillis() - start))))
                    .toList();

            CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[0]));
            voidCompletableFuture.join();

            System.out.println(voidCompletableFuture.isDone());


            long end = System.currentTimeMillis();
            System.out.printf("O programa demorou %ds.%n", (end - start) / 1000);
        }
    }
}

