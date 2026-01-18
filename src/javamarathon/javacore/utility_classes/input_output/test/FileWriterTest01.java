package javamarathon.javacore.utility_classes.input_output.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        // File
        // FileReader
        // BufferedWriter
        // BufferedReader
        File file = new File("text.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);){
            fileWriter.write("This is art. No joke...\n");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
