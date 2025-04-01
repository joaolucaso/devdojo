package Knio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("devdojo");
try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
for (Path path: stream);


}catch (IOException e){
    e.printStackTrace();
}










    }
}
