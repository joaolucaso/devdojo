package Knio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {

    private final PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Teste*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());

        }
        return FileVisitResult.CONTINUE;
    }
}

    public class  PathMatcherTeste02 {
        public static void main(String[] args) throws IOException {
Path root = Paths.get(".");
Files.walkFileTree(root,new FindAllTestJavaOrClass());


    }
}