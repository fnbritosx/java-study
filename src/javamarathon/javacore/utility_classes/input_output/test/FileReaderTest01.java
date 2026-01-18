package javamarathon.javacore.utility_classes.input_output.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            while ((i=fileReader.read()) != -1){
                System.out.print((char) i);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
