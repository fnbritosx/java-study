package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;
import javamarathon.javacore.streams.domain.Category;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 3.99, Category.FANTASY),
                new Anime("Attack on Tian", 2.99, Category.ACTION),
                new Anime("Naruto", 4.99, Category.ACTION),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Sword Art Online", 10.99, Category.ACTION)
        ));

        Map<Category, Long> collect = animes.stream()
                .collect(Collectors.groupingBy(Anime::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<Anime>> collect1 = animes.stream()
                .collect(Collectors.groupingBy(Anime::getCategory,
                        Collectors.maxBy(Comparator.comparing(Anime::getPrice))));
        System.out.println(collect1);

        Map<Category, Anime> collect2 = animes.stream()
                .collect(Collectors.groupingBy(Anime::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Anime::getPrice)),
                                Optional::get)));
        System.out.println(collect2);

        Map<Category, Anime> collect3 = animes.stream()
                .collect(Collectors.toMap(Anime::getCategory,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Anime::getPrice))));
        System.out.println(collect3);
    }
}
