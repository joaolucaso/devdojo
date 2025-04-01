package Knio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTeste1 {
    public static void main(String[] args) throws IOException {

        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("minhapasta/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("minhapasta/novo_path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        // interface BasicFileAttributes em Java faz parte do pacote java.nio.file.attribute e permite obter
        // informações sobre arquivos e
        // diretórios, como tamanho, data de criação, data de modificação, tipo (arquivo ou diretório), etc.
        //
        //Ela é usada junto com a classe Files para recuperar essas informações de forma eficiente.

    }
}
