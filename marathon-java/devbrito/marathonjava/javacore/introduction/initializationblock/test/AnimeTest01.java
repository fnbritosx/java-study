package devbrito.marathonjava.javacore.introduction.initializationblock.test;

import devbrito.marathonjava.javacore.introduction.initializationblock.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        System.out.println(anime.getName());
    }
}
