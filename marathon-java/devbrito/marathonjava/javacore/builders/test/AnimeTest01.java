package devbrito.marathonjava.javacore.builders.test;

import devbrito.marathonjava.javacore.builders.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Shingeki no kiojin", "Ação", 50, "Good");
        Anime anime1 = new Anime();

        anime.animePrinter();
        anime1.animePrinter();
    }
}
