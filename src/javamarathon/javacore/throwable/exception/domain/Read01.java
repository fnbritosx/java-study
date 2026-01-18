package javamarathon.javacore.throwable.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Read01 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closed ReadFile01");
    }
}
