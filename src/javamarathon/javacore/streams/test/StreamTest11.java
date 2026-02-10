package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {

    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 2.99),
                new Anime("Attack on Tian", 2.99),
                new Anime("Naruto", 4.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Sword Art Online", 10.99)
        ));

        // formas de ver a quantidade de elementos da lista

        System.out.println("QUANTIDADE DE ELEMENTOS DA LISTA: ");
        System.out.println(animes.size());

        System.out.println(animes.stream().count());

        System.out.println(animes.stream().collect(Collectors.counting()));
        System.out.println("-----------------");


        // formas de ver o valor máximo da lista

        System.out.println("Valor máximo da lista: ");
        animes.stream()
                .max(Comparator.comparing(Anime::getPrice))
                .ifPresent(System.out::println);

        animes.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Anime::getPrice)))
                .ifPresent(System.out::println);
        System.out.println("-----------------");


        // formar de somar os preços da lista

        System.out.println("Sos valores da lista: ");
        System.out.println(animes.stream()
                .map(Anime::getPrice)
                .reduce(0.0, (acumulador, preco) -> acumulador + preco));

        System.out.println(animes.stream()
                .mapToDouble(Anime::getPrice)
                .sum());

        System.out.println(animes.stream()
                .collect(Collectors.summingDouble(Anime::getPrice)));
        System.out.println("-----------------");

        // forma que mostra tudo isso

        System.out.println("Mostra quantidade, soma, min, média e máximo da lista: ");
        System.out.println(animes.stream()
                .collect(Collectors.summarizingDouble(Anime::getPrice)));
        System.out.println("-----------------");

        // separa por virgula
        System.out.println("Separa tudo por vírgula: ");
        System.out.println(animes.stream()
                .map(Anime::getTitle)
                .collect(Collectors.joining(", ")));

    }
}
