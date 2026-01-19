package javamarathon.javacore.utility_classes.new_input_output.path.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("src/javamarathon/javacore/utility_classes/new_input_output/test/subpasta/subsubpasta");
        if (Files.notExists(path1)){
            Files.createDirectories(path1);
        }

        Path path2 = path1.resolve("text.txt");
        if (Files.notExists(path2)){
            Files.createFile(path2);
        }

        Path path2Renamed = Paths.get(path1.toString(), "text_renamed.txt");

        Path source = path2;
        Path target = path2Renamed;

        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
}
