package javamarathon.javacore.polymorphism.test;

import javamarathon.javacore.polymorphism.repository.Repository;
import javamarathon.javacore.polymorphism.service.RepositoryDatabase;
import javamarathon.javacore.polymorphism.service.RepositoryFile;
import javamarathon.javacore.polymorphism.service.RepositoryMemory;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryDatabase();
        Repository repository1 = new RepositoryFile();
        Repository repository2 = new RepositoryMemory();

        repository.save();
        repository1.save();
        repository2.save();

    }
}
