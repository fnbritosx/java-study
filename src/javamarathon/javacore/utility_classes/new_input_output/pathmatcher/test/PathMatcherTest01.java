package javamarathon.javacore.utility_classes.new_input_output.pathmatcher.test;

import java.io.IOException;
import java.nio.file.*;

public class PathMatcherTest01 {
    public static void main(String[] args) throws IOException {
        Path path01 = Paths.get("src/javamarathon/javacore/utility_classes/new_input_output/pathmatcher/pahtdir/file.txt");

        if (Files.notExists(path01.getParent())) {
            Files.createDirectories(path01.getParent());
        }

        if (Files.notExists(path01)) {
            Files.createFile(path01);
        }

        String pattern01 = "glob:**/*.txt";
        String pattern02 = "glob:**/*.java";

        PathMatcher pathMatcher01 = FileSystems.getDefault().getPathMatcher(pattern01);
        PathMatcher pathMatcher02 = FileSystems.getDefault().getPathMatcher(pattern02);

        System.out.println(pattern01 + ": " + pathMatcher01.matches(path01));
        System.out.println(pattern02 + ": " + pathMatcher02.matches(path01));
    }
}
