package javamarathon.javacore.lambdas.test;

import javamarathon.javacore.lambdas.domain.Anime;
import javamarathon.javacore.lambdas.service.AnimeService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeService> animeServiceSupplier = AnimeService::new;
        AnimeService animeService = animeServiceSupplier.get();

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserker", 50), new Anime("One Piece", 1200), new Anime("Atack on Titan", 400)));
        animes.sort(animeService::compareByNameNonStatic);

        System.out.println(animes);

        // BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;

        System.out.println(animeBiFunction.apply("Sword Art Online", 200));
    }
}
