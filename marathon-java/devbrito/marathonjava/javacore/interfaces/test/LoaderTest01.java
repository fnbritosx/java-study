package devbrito.marathonjava.javacore.interfaces.test;

import devbrito.marathonjava.javacore.interfaces.domain.DataBaseLoader;
import devbrito.marathonjava.javacore.interfaces.domain.FileLoader;

public class LoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.chekPermission();
        fileLoader.chekPermission();
    }
}
