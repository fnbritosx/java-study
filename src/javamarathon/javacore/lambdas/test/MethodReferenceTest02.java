package javamarathon.javacore.lambdas.test;

import javamarathon.javacore.lambdas.domain.Anime;
import javamarathon.javacore.lambdas.service.AnimeService;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserker", 50), new Anime("One Piece", 1200), new Anime("Atack on Titan", 400)));

        AnimeService animeService = new AnimeService();

        animes.sort(animeService::compareByNameNonStatic);

        System.out.println(animes);
    }
}