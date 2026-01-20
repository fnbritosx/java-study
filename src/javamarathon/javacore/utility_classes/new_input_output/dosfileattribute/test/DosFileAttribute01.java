package javamarathon.javacore.utility_classes.new_input_output.dosfileattribute.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttribute01 {
    public static void main(String[] args) throws IOException {
        Path path01 = Paths.get("src/javamarathon/javacore/utility_classes/new_input_output/dosfileattribute/test/docs/test01.txt");
        Path path02 = Paths.get("src/javamarathon/javacore/utility_classes/new_input_output/dosfileattribute/test/docs/test02.txt");

        if (Files.notExists(path01.getParent())) {
            Files.createDirectories(path01.getParent());
        }

        if (Files.notExists(path01)) {
            Files.createFile(path01);
        }


        if (Files.notExists(path02)) {
            Files.createFile(path02);
        }

        // Forma 1: Usando setAttribute (String)
        Files.setAttribute(path01, "dos:hidden", true);
        Files.setAttribute(path01, "dos:readonly", true);
        Files.setAttribute(path01, "dos:archive", true);


        DosFileAttributes file01 = Files.readAttributes(path01, DosFileAttributes.class);
        System.out.println("É oculto? " + file01.isHidden());
        System.out.println("Somente leitura? " + file01.isReadOnly());
        System.out.println("É arquivo para backup? " + file01.isArchive());

        // Forma 2: Usando View (Recomendado para múltiplas alterações)
        DosFileAttributeView file02 = Files.getFileAttributeView(path02, DosFileAttributeView.class);
        file02.setArchive(true);
        file02.setHidden(true);
        file02.setReadOnly(true);

        System.out.println("É arquivo para backup? " + file02.readAttributes().isArchive());
        System.out.println("É oculto? " + file02.readAttributes().isHidden());
        System.out.println("É somente leitura? " + file02.readAttributes().isReadOnly());
    }
}
