package Knio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".java"));{
            System.out.println(file.getFileName());
        }
        return  FileVisitResult.CONTINUE;
    }

}


public class SimpleFileVisitorTeste01 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root,new ListAllFiles());
    }
}
// SimpleFileVisitor<T> é uma classe abstrata do pacote java.nio.file usada para percorrer arquivos e diretórios de
// forma simplificada.
// Ele facilita a navegação em sistemas de arquivos sem precisar gerenciar manualmente a recursão.