package JIO;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class pathteste02 {
    public static void main(String[] args) throws IOException {
        //criar pasta cok path
        Path pastaPath = Paths.get("pastas");
        if (Files.notExists(pastaPath)){
            Path pastaDirectory = Files.createDirectory(pastaPath);

        }
//criar subpastas
        Path subpastaspath =Paths.get("pastaPath,/subpasta/subsubpasta");
       Path SubPastaDiretory = Files.createDirectories(subpastaspath);
       Path Filepath = Paths.get(subpastaspath.toString(),"textomovo.txt");
if (Files.notExists(Filepath)){
Path filepathcreated = Files.createFile(Filepath);


}
Path source =Filepath;
        Path target = Paths.get(Filepath.getParent().toString(),"filerenomeado.txt");
       Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);



    }
}
