package javamarathon.javacore.utility_classes.new_input_output.resolve.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path path01 = Paths.get("/C/febne/dev");
        Path path02 = Paths.get("../../arquivo.txt");
        Path path03 = Paths.get("fnbrito");

        Path dir01 = path01.resolve(path02);
        Path dir02 = path01.resolve(path03);
        Path dir03 = path02.resolve(path01);
        Path dir04 = path02.resolve(path03);
        Path dir05 = path03.resolve(path01);
        Path dir06 = path03.resolve(path02);

        System.out.println(dir01);
        System.out.println(dir02);
        System.out.println(dir03);
        System.out.println(dir04);
        System.out.println(dir05);
        System.out.println(dir06);

    }
}
