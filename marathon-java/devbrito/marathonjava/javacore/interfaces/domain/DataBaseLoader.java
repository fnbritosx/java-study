package devbrito.marathonjava.javacore.interfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover{
    @Override
    public void load(){
        System.out.println("Loading database files...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data base files...");
    }

    @Override
    public void chekPermission() {
        System.out.println("Checking permissions from database...");
    }
}
