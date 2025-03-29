package Knio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class pathsTeste02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("pasta");
        if (Files.notExists(pastaPath)) {
            Path pastaDiretorio = Files.createDirectory(pastaPath);


        }
        Path SubPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path SubPastaDiretory = Files.createDirectories(SubPastaPath);
        Path filePath = Paths.get(SubPastaPath.toString(), "file.txt");

        if (Files.notExists(pastaPath)) {
            Path pastaDiretorio = Files.createDirectory(filePath);


        }
Path source = filePath;
        Path target =Paths.get(filePath.getParent().toString(),"file.renamed.txt");
Files.copy(source, target , StandardCopyOption.REPLACE_EXISTING);
    }
}
