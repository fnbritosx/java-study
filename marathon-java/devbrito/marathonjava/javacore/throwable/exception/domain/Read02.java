package devbrito.marathonjava.javacore.throwable.exception.domain;

import java.io.Closeable;
import java.io.IOException;

public class Read02 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closed ReadFile02");
    }
}
