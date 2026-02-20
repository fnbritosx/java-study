package javamarathon.javacore.concurrency.test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;

public class ScheduledExecutorServiceTest01 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        Runnable runnable = () -> {
            System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        try (ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2)) {

            // scheduleAtFixedRate - você realiza a tarefa de tempos em tempos pelo period estipulado.
            // Caso atrase, fará a tarefa sem descanso. Se terminar antes do period estipulado, você pode descansar até bater o period necessário para começar.

            // scheduleWithFixedDelay - você realiza a tarefa de tempos em tempos pelo period estipulado.
            // Mesmo se atrasar, terá o descanso definido. Exemplo: 3 min - realizar tarefa, se você demorar 4 min, você descansará os 3 min e começará novamente após o descanso.
            ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(runnable, 1, 3, TimeUnit.SECONDS);

            executorService.schedule(() -> {
                System.out.println("Finalizando o programa.");
                scheduledFuture.cancel(false);
                countDownLatch.countDown();
            }, 10, TimeUnit.SECONDS);

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}