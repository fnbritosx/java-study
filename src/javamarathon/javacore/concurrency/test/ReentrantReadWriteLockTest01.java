package javamarathon.javacore.concurrency.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReaderWrite {
    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    MapReaderWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();

        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s obtained the WRITE LOCK%n", Thread.currentThread().getName());
                System.out.printf("%s is writing.%n",Thread.currentThread().getName());
                Thread.sleep(500);
                map.put(key, value);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public LinkedHashMap<String, String> allValues() {
        rwl.readLock().lock();
        try {
            return new LinkedHashMap<>(map);
        } finally {
            rwl.readLock().unlock();
        }
    }
}

public class ReentrantReadWriteLockTest01 {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReaderWrite mapReaderWrite = new MapReaderWrite(rwl);

        Runnable writer = () -> {
            for (int i = 0; i < 20; i++) {
                 mapReaderWrite.put(String.valueOf(i), String.valueOf(i));
            }
        };

        Runnable reader = () -> {
            if(rwl.isWriteLocked()){
                System.out.println("WRITER LOCKED");
            }
            rwl.readLock().lock();
            System.out.println("Finally i got the damn lock");

            try{
                System.out.println(Thread.currentThread().getName() + " " + mapReaderWrite.allValues());
            }finally {
                rwl.readLock().unlock();
            }
        };

        Thread t1 = new Thread(writer, "writer");
        Thread t2 = new Thread(reader, "reader 1");
        Thread t3 = new Thread(reader, "reader 2");
        
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        t3.start();
    }
}
