package javamarathon.javacore.streams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        Path path = Paths.get("src/javamarathon/javacore/streams/test/arquivo.txt");

        try {
            if ((Files.notExists(path))) {
                Files.createFile(path);
            }
            try (Stream<String> lines = Files.lines(path)) {
                lines
                        .filter(l -> l.toLowerCase().contains("java"))
                        .forEach(System.out::println);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-----------------------");

        IntStream.of(1, 2, 3, 4, 5)
                .filter(nums -> nums % 2 == 0)
                .forEach(ln -> System.out.print(ln + " "));
        System.out.println();

        // so ate 49
        IntStream.range(0, 50)
                .filter(num -> num % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // vai ate 50
        IntStream.rangeClosed(0, 50)
                .filter(num -> num % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("-----------------------");

        int[] nums = {1, 2, 3, 4, 5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);
    }
}
