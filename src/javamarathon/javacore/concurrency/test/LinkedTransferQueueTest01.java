package javamarathon.javacore.concurrency.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        // ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue

        TransferQueue<Object> objects = new LinkedTransferQueue<>();

        System.out.println(objects.add("Fernando"));
        System.out.println(objects.offer("Brito"));
        System.out.println(objects.offer("Neto", 10, TimeUnit.SECONDS));


        objects.put("Bom e novo");
        if (objects.hasWaitingConsumer()) {
            objects.transfer("Me consome hahahaha");
        }

        System.out.println(objects.tryTransfer("Me consome hahahaha 2.0"));
        System.out.println(objects.tryTransfer("Me consome hahahaha 2.0", 5, TimeUnit.SECONDS));

        System.out.println(objects.element());
        System.out.println(objects.peek());

        System.out.println(objects.poll());
        System.out.println(objects.remove());

        System.out.println(objects.take());

        System.out.println(objects);
        System.out.println(objects.remainingCapacity());
    }
}
