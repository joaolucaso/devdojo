package Knio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class pathsTeste1 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Acer\\IdeaProjects\\exciciosJava\\devdojo\\src\\file.txt");
        System.out.println(p1.getFileName());



    }
}
