package javamarathon.javacore.concurrency.test;

import javamarathon.javacore.concurrency.domain.Discount;
import javamarathon.javacore.concurrency.domain.Quote;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.*;


public class CompletableFutureTest03 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");

        stores.forEach(s -> System.out.println(getPriceSync(s)));

        long end1 = System.currentTimeMillis();
        System.out.printf("O programa demorou %ds.%n", (end1 - start1) / 1000);


        System.out.println("---------------");

        getNewPriceSync(stores);


        System.out.println("---------------");


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


    public static void getNewPriceSync(List<String> nameStore) {

        long start = System.currentTimeMillis();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        nameStore.stream()
                .map(CompletableFutureTest03::getPriceSync)
                .map(Quote::newQuote)
                .map(s -> {

                    double precoFinal = s.getPrice() * (100 - s.getDiscount().getPercentage()) / 100;

                    return String.format("%s preço original: %.2f. Aplicando código de desconto: %s. Preço final: %.2f"
                            , s.getStoreName(), s.getPrice(), s.getDiscount(), precoFinal);
                })
                .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("O programa demorou %ds.%n", (end - start) / 1000);
    }


    public static void getPriceAsync(List<String> nameStore) {
        long start = System.currentTimeMillis();

        try (ExecutorService executorService = Executors.newFixedThreadPool(Math.min(nameStore.size(), 100), (runnable) -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        })) {

            List<CompletableFuture<String>> completableFutures = nameStore.stream()
                    .map(s -> CompletableFuture.supplyAsync(() -> getPriceSync(s), executorService))
                    .map(cf -> cf.thenApply(Quote::newQuote))
                    .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> {

                        try {
                            TimeUnit.SECONDS.sleep(2);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        double precoFinal = quote.getPrice() * (100 - quote.getDiscount().getPercentage()) / 100;

                        return String.format("%s preço original: %.2f. Aplicando código de desconto: %s. Preço final: %.2f"
                                , quote.getStoreName(), quote.getPrice(), quote.getDiscount(), precoFinal);
                    }, executorService)))
                    .toList();

            completableFutures.stream()
                    .map(CompletableFuture::join)
                    .forEach(System.out::println);


            long end = System.currentTimeMillis();
            System.out.printf("O programa demorou %ds.%n", (end - start) / 1000);
        }
    }
}

