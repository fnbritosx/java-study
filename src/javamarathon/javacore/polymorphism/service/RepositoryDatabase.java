package javamarathon.javacore.polymorphism.service;

import javamarathon.javacore.polymorphism.repository.Repository;

public class RepositoryDatabase implements Repository {
    @Override
    public void save() {
        System.out.println("Save in the data base...");
    }
}
