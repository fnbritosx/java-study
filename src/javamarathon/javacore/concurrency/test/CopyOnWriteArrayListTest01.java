package javamarathon.javacore.concurrency.test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest01 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }

        Runnable runnableIterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            iterator.forEachRemaining(v -> System.out.print(v + " "));
            System.out.println("\n---");
        };

        Runnable runnableRemove = () -> {
            for (int i = 0; i <= 5; i++) {
                if (list.size() >= 6) {
                    list.subList(0, 6).clear();
                }
                System.out.printf("%s removed %d%n", Thread.currentThread().getName(), i);

            }
        };

        Thread t1 = new Thread(runnableIterator);
        Thread t2 = new Thread(runnableIterator);
        Thread t3 = new Thread(runnableRemove, "Thread remover");

        t3.start();
        t3.join();

        t1.start();
        t1.join();

        t2.start();
        t1.join();
    }
}
