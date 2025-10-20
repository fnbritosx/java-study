package devbrito.marathonjava.javacore.utility_classes.input_output.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("This is art. No joke...\n");
            bufferedWriter.flush(); // No need to call flush(), since try-with-resources calls close(), which does it.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
