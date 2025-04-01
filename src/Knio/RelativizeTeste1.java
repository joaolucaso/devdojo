package Knio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste1 {
    public static void main(String[] args) {
        Path dir = Paths.get("devdojo/minhapasta");
        Path clazz = Paths.get("devdojo/minhapasta/devdojotop/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("devdojo/minhapasta");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("devdojo/minhapasta/devdojotop/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.382019");

        System.out.println("1" + absolute1.relativize(absolute3));
        System.out.println("2" + absolute3.relativize(absolute1));
        System.out.println("3" + absolute1.relativize(absolute2));
        System.out.println("4" + relativo1.relativize(relativo2));
        System.out.println("5"+absolute1.relativize(relativo1));

    }
}
