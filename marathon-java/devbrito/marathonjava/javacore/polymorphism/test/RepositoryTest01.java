package devbrito.marathonjava.javacore.polymorphism.test;

import devbrito.marathonjava.javacore.polymorphism.repository.Repository;
import devbrito.marathonjava.javacore.polymorphism.service.RepositoryDatabase;
import devbrito.marathonjava.javacore.polymorphism.service.RepositoryFile;
import devbrito.marathonjava.javacore.polymorphism.service.RepositoryMemory;

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
