package Knio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest1 {
    public static void main(String[] args) {
        Path dir = Paths.get("devdojo/minhapasta");
        Path arquivo = Paths.get("dev/textomeu.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("devdojo/minhapasta");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("textomeu.txt");

        System.out.println("1" + absoluto.resolve(relativo));
        System.out.println("2" + absoluto.resolve(file));
        System.out.println("3" + relativo.resolve(absoluto));
        System.out.println("4" + relativo.resolve(absoluto));


    }
}
