package Knio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

//
public class DosFileAttributeTeste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("minhapasta/outrotexto.txt");
        if (Files.notExists(path)) Files.createFile(path);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());

        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());

        //A interface DosFileAttributes em Java faz parte do pacote java.nio.file.attribute e é usada para obter atributos específicos de arquivos no Windows, como:
        //
        //Arquivo oculto (hidden)
        //
        //Somente leitura (read-only)
        //
        //Arquivo de sistema (system)
        //
        //Arquivo arquivado (archive)
        //
        //Ela é útil para manipular arquivos no Windows, pois esses atributos não existem em sistemas Unix/Linux.
    }
}
