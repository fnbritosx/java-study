package javamarathon.javacore.optional.test;

import javamarathon.javacore.optional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = List.of(new Manga(1, "One Piece", 1200), new Manga(2, "Attack on Titan", 200));

        Optional<Manga> optional = findByName(mangas, "One");
         optional.ifPresentOrElse(m -> System.out.println(m.getName()), () -> System.out.println("O objeto não existe!!"));
    }

    private static Optional<Manga> findByName(List<Manga> list, String title) {
        for (Manga manga : list) {
            if (manga.getName().equals(title)) {
                return Optional.of(manga);
            }
        }
        return Optional.empty();
    }
}
