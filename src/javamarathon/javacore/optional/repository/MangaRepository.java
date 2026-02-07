package javamarathon.javacore.optional.repository;

import javamarathon.javacore.optional.domain.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    static List<Manga> mangas = List.of(new Manga(1, "One Piece", 1200), new Manga(2, "Attack on Titan", 200));

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        for (Manga manga : mangas) {
          if (predicate.test(manga)){
              return Optional.of(manga);
          }
        }
        return Optional.empty();
    }

    public static Optional<Manga> findById (Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByName (String title){
        return findBy(m -> m.getName().contains(title));
    }
}
