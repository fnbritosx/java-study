package devbrito.marathonjava.javacore.utility_classes.input_output.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("Directory");
        boolean mkdir = directory.mkdir();
        System.out.println("Directory is created? " + mkdir);

        File file = new File(directory, "file.txt");
        boolean newFile = file.createNewFile();
        System.out.println("File is created? " + newFile);

        File directoryRenamed = new File("Directory_Renamed");
        boolean mkdirRenamed = directory.renameTo(directoryRenamed);
        System.out.println("Directory is renamed? " + mkdirRenamed);

        File fileRenamed = new File(directory, "file_renamed.txt");
        boolean newFileRenamed = file.renameTo(fileRenamed);
        System.out.println("File is renamed? " + newFileRenamed);
    }
}
