package Knio;

import java.nio.file.*;

public class PathMatcherTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("minhapasta/subpasta/file.txt");
        Path path2 = Paths.get("minhapasta/subpasta/brj.bkp");
        Path path3 = Paths.get("minhapasta/subpasta/file.java");
masthes(path1,"glob:*.bkp");
masthes(path1,"glob:**/*.bkp");
masthes(path3,"glob:**/*.bkp");
masthes(path1,"glob:**/*.???");
masthes(path2,"glob:**/*.???");
masthes(path3,"glob:**/*.???");
masthes(path3,"glob:**/*.????");
    }

    private static void masthes(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + "; " + matcher.matches(path));
    }
}
