package javamarathon.javacore.builders.test;

import javamarathon.javacore.builders.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Shingeki no kiojin", "Ação", 50, "Good");
        Anime anime1 = new Anime();

        anime.animePrinter();
        anime1.animePrinter();
    }
}
