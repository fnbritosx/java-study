package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;

import java.util.ArrayList;
import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(
                new Anime("One Piece", 2.99),
                new Anime("Attack on Tian", 4.99),
                new Anime("Naruto", 4.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Sword Art Online", 3.99)
        ));

        long listFiltered = anime.stream()
                .distinct()
                .filter(lightNovel -> lightNovel.getPrice() <= 4)
                .count();

        anime.forEach(System.out::println);

        System.out.println("--------------");

        System.out.println(listFiltered);


    }
}
