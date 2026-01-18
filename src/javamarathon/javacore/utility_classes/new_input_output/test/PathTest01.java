package javamarathon.javacore.utility_classes.new_input_output.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path01 = Paths.get("C:\\Users\\febne\\OneDrive\\Documentos\\java-study\\Directory\\file.txt");
        Path path02 = Paths.get("C:\\sla\\febne\\OneDrive\\Documentos\\java-study\\Directory","file.txt");
        Path path03 = Paths.get("C:", "Users\\febne\\OneDrive\\Documentos\\java-study\\Directory", "file.txt");
        Path path04 = Paths.get("C:","Users", "febne", "OneDrive", "Documentos", "java-study", "Directory", "file.txt");

        System.out.println(path01.getFileName());
        System.out.println(path02.getFileName());
        System.out.println(path03.getFileName());
        System.out.println(path04.getFileName());
    }
}
