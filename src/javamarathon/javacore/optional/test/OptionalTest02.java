package javamarathon.javacore.optional.test;

import javamarathon.javacore.optional.repository.MangaRepository;

public class OptionalTest02 {
    public static void main(String[] args) {

        MangaRepository.findByName("sla")
                .ifPresentOrElse(m -> {
                            m.setName(m.getName() + "2.0");
                            System.out.println(m);
                        },
                        () -> System.out.println("O Objeto não existe!"));

        MangaRepository.findById(2)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("O Objeto não existe!"));
    }
}
