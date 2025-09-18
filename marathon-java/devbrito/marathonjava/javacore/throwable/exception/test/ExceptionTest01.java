package devbrito.marathonjava.javacore.throwable.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        createNewFile();
    }
    private static void createNewFile(){
        File file = new File("file/text.txt");
        try {
            boolean isCreate = file.createNewFile();
            System.out.println("File create " + isCreate);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
