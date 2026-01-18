package javamarathon.javacore.utility_classes.new_input_output.test.relativize;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Relative path + absolute path = error.
        // Both paths need to be the same type.
        //Java doesn't know where to go if you don't tell it to.
        Path path01 = Paths.get("/C/febne/dev");
        Path path02 = Paths.get("/arquivo.txt");
        Path path03 = Paths.get("fnbrito");
        Path path04 = Paths.get("sla");

        Path dir01 = path01.relativize(path02);
        Path dir02 = path03.relativize(path04);
//        Path dir03 = path01.relativize(path03);


        System.out.println(dir01);
        System.out.println(dir02);
//        System.out.println(dir03);

    }
}
