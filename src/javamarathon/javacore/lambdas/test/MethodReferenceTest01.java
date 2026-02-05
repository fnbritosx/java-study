package javamarathon.javacore.lambdas.test;

import javamarathon.javacore.lambdas.domain.Anime;

import java.util.*;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserker", 50), new Anime("One Piece", 1200), new Anime("Atack on Titan", 400)));

        // Collections.sort(animes, (a1, a2) ->Integer.compare(a1.getEpisodes(), a2.getEpisodes()));

        System.out.println(animes);

    }
}
