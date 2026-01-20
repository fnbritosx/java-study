package javamarathon.javacore.utility_classes.new_input_output.pathmatcher.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test}*.{java,class}");

        if (pathMatcher.matches(file)){
            System.out.println(file.getFileName());
        }

        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");

        Files.walkFileTree(path, new listAllFiles());
    }
}
