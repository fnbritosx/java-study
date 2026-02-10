package javamarathon.javacore.streams.test;

import javamarathon.javacore.streams.domain.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 2.99),
                new Anime("Attack on Tian", 4.99),
                new Anime("Naruto", 4.99),
                new Anime("Jujutsu Kaizen", 2.99),
                new Anime("Sword Art Online", 3.99)
        ));

        animes.sort(Comparator.comparing(Anime::getTitle));
        System.out.println(animes);

        List<Anime> resultTemp = orderBy(animes, l -> l.getPrice() <= 4);

        List<String> resultFinal = new ArrayList<>();

        for (Anime anime : resultTemp) {
            resultFinal.add(anime.getTitle());
        }

        System.out.println(resultFinal);
    }

    private static <T> List<T> orderBy(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
