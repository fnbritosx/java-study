package javamarathon.javacore.concurrency.test;

import java.util.concurrent.*;

public class CallableTest01 {
    public static void main(String[] args) {
        Callable<String> callable = () -> {
            TimeUnit.SECONDS.sleep(2);
            int i = ThreadLocalRandom.current().nextInt(1, 50);

            return String.format("The value is %d", i);
        };

        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            Future<String> submit = executorService.submit(callable);

            try {
                String s = submit.get();

                System.out.println(s);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }

        }

        System.out.println("Program finished. ");
    }
}
