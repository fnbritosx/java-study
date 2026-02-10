package javamarathon.javacore.streams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> futuraEmpresa = new ArrayList<>();

        List<String> encarregados = List.of("Carla", "Rafael", "Junior");
        List<String> desenvolvedores = List.of("Fernando", "Joan", "Willian");
        List<String> financeiro = List.of("Cleison", "Aline", "Betin");

        futuraEmpresa.add(encarregados);
        futuraEmpresa.add(desenvolvedores);
        futuraEmpresa.add(financeiro);

        // forma antes do java 8.
//        for (List<String> pessoas : futuraEmpresa) {
//            for (String pessoa : pessoas) {
//                System.out.println(pessoa);
//            }
//        }

        futuraEmpresa.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
