package devbrito.marathonjava.javacore.polymorphism.service;

import devbrito.marathonjava.javacore.polymorphism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Save in memory...");
    }
}
