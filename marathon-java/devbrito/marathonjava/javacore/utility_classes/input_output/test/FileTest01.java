package devbrito.marathonjava.javacore.utility_classes.input_output.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        try {
            boolean isCreatedNewFile = file.createNewFile();
            System.out.println("Created: " + isCreatedNewFile);
            System.out.println("Patch: " + file.getPath());
            System.out.println("Patch absolute: " + file.getAbsolutePath());
            System.out.println("Is directory: " + file.isDirectory());
            System.out.println("Is file: " + file.isFile());
            System.out.println("Is hidden: " + file.isHidden());

            System.out.println("Last modified: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if (exists) {
                boolean delete = file.delete();
                System.out.println("Delete: " + delete);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
