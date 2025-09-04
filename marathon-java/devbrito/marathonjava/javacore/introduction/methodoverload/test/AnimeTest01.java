package devbrito.marathonjava.javacore.introduction.methodoverload.test;

import devbrito.marathonjava.javacore.introduction.methodoverload.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Shingek no kiojin", "Ação", 50);
        anime.animePrinter();
    }
}
