package javamarathon.javacore.streams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String> list = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(list);

    }
}
