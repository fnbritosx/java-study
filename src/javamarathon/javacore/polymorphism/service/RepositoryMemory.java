package javamarathon.javacore.polymorphism.service;

import javamarathon.javacore.polymorphism.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void save() {
        System.out.println("Save in memory...");
    }
}
