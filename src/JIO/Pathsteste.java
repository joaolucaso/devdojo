package JIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathsteste {
    public static void main(String[] args) {


        Path P1 = Paths.get("C:\\Users\\Acer\\IdeaProjects\\exciciosJava\\execption custom\\pastinhanova\\arquivorenomeado.txt");
        System.out.println(P1.getFileName());
    }
}
