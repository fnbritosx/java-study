package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;
import javamarathon.javacore.streams.domain.Category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 2.99, Category.FANTASY),
                new Anime("Attack on Tian", 2.99, Category.ACTION),
                new Anime("Naruto", 4.99, Category.ACTION),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Jujutsu Kaizen", 2.99, Category.SUPERNATURAL),
                new Anime("Sword Art Online", 10.99, Category.ACTION)
        ));


        // jeito antigo sem streams
        Map<Category, List<Anime>> newAnimes = new HashMap<>();

        List<Anime> fantasy = new ArrayList<>();
        List<Anime> action = new ArrayList<>();
        List<Anime> supernatural = new ArrayList<>();

        for (Anime anime : animes) {
            switch (anime.getCategory()){
                case FANTASY:
                    fantasy.add(anime);
                            break;
                case ACTION:
                    action.add(anime);
                    break;
                case SUPERNATURAL:
                    supernatural.add(anime);
                    break;
            }
        }

        newAnimes.put(Category.FANTASY, fantasy);
        newAnimes.put(Category.ACTION, action);
        newAnimes.put(Category.SUPERNATURAL, supernatural);

        System.out.println(newAnimes);

        System.out.println("--------------------");

        Map<Category, List<Anime>> collect = animes.stream().collect(Collectors.groupingBy(Anime::getCategory));
        System.out.println(collect);
    }
}
