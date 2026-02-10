package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;
import javamarathon.javacore.streams.domain.Category;
import javamarathon.javacore.streams.domain.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 3.99, Category.FANTASY),
                new Anime("Attack on Tian", 2.99, Category.ACTION),
                new Anime("Naruto", 4.99, Category.ACTION),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Sword Art Online", 10.99, Category.ACTION)
        ));

        Map<Promotion, List<Anime>> collect = animes.stream()
                .collect(Collectors.groupingBy(a -> a.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);

        // Map<Category, Map<Promotion, Anime>>

        Map<Category, Map<Promotion, List<Anime>>> collect1 = animes.stream()
                .collect(Collectors.groupingBy(Anime::getCategory,
                        Collectors.groupingBy(a -> a.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));

        System.out.println(collect1);
    }
}
