package javamarathon.javacore.utility_classes.new_input_output.basicfileattributes.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.*;

public class BasicFileAttributes01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/javamarathon/javacore/utility_classes/new_input_output/basicfileattributes/test/docs/file.txt");

        Path directory = path.getParent();

        if (Files.notExists(directory)) {
            Files.createDirectories(directory);
        }

        if (Files.notExists(path)) {
            Files.createFile(path);
        }

        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 10, 17, 30);
        Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
        FileTime from = FileTime.from(instant);
        Files.setLastModifiedTime(path, from);

        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Criação: " + basicFileAttributes.creationTime());
        System.out.println("Tamanho: " + basicFileAttributes.size() + " bytes");
        System.out.println("Última modificação: " + basicFileAttributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()));
        System.out.println("É diretório? " + basicFileAttributes.isDirectory());

    }
}
