package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(
                new Anime("One Piece", 2.99),
                new Anime("Attack on Tian", 2.99),
                new Anime("Naruto", 4.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Sword Art Online", 3.99)
        ));

        anime.stream()
                .filter(l -> l.getPrice() < 3)
                .sorted(Comparator.comparing(Anime::getPrice)
                        .thenComparing(Anime::getTitle))
                .findAny()
                .ifPresent(System.out::println);

        // Forma 1
//        lightNovels.stream()
//                .filter(l -> l.getPrice() < 3)
//                .sorted(Comparator.comparing(LightNovel::getPrice)
//                        .thenComparing(LightNovel::getTitle))
//                .findAny()
//                .ifPresent(System.out::println);

        // Forma que o IntelliJ sugere
        anime.stream()
                .filter(l -> l.getPrice() < 3).min(Comparator.comparing(Anime::getPrice)
                        .thenComparing(Anime::getTitle))
                .ifPresent(System.out::println);

    }
}
