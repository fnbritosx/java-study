package javamarathon.javacore.utility_classes.new_input_output.directorystream.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest01 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get(".");


        try(DirectoryStream<Path> paths = Files.newDirectoryStream(dir)){
            for (Path path : paths){
                System.out.println(path);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
