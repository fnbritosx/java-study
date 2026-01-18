package javamarathon.javacore.interfaces.domain;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void load();

    default void chekPermission(){
        System.out.println("Checking permissions...");
    }
    static void retrieveMaxDataSize(){
        System.out.println("Retrieve");
    }
}
