package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(
                new Anime("One Piece", 5.99),
                new Anime("Attack on Tian", 2.99),
                new Anime("Naruto", 4.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Sword Art Online", 3.99)
        ));

        // cuidado pois o java fica fazendo o wrapper e unwrapper.
        // para alta performance é recomendado utilizar o DoubleStream (pois o preço é do tipo double).
        // para outros tipos há outros <tipo>Stream para serem utilizados.
        anime.stream()
                .map(Anime::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Nenhum valor foi encontrado."));

        double sumAllPrices = anime.stream()
                .mapToDouble(Anime::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sumAllPrices);
    }
}
