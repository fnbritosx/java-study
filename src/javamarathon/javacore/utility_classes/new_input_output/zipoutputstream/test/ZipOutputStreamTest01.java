package javamarathon.javacore.utility_classes.new_input_output.zipoutputstream.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Path path01 = Paths. get("src/javamarathon/javacore/utility_classes/new_input_output/zipoutputstream/test/file/file.txt");
        Path path02 = Paths. get("src/javamarathon/javacore/utility_classes/new_input_output/zipoutputstream/test/file/file.zip");

        if (Files.notExists(path01.getParent())){
            Files.createDirectories(path01.getParent());
        }

        if (Files.notExists(path01)){
            Files.createFile(path01);
        }

        if (Files.notExists(path02.getParent())){
            Files.createDirectories(path02.getParent());
        }

        if (Files.notExists(path02)){
            Files.createFile(path02);
        }



        try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(path02))){
            ZipEntry zipEntry = new ZipEntry(path01.getFileName().toString());
            zos.putNextEntry(zipEntry);
            Files.copy(path01,zos);
        }
    }
}
