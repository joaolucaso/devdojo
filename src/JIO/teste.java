package JIO;

import java.io.File;
import java.io.IOException;

public class teste {
    public static void main(String[] args) throws IOException {
File FileDiretorio = new File("pasta");
boolean IsDiretorioCriado = FileDiretorio.mkdir();
        System.out.println(IsDiretorioCriado);
        File ArquivoDoDiretorio = new File(FileDiretorio,"arqurereivo.txt");
        boolean FileIsCreated =ArquivoDoDiretorio.createNewFile();
        System.out.println(FileIsCreated);

        File FileIsRenamed = new File(FileDiretorio,"arquivorenomeado.txt");
        boolean IsRenamed =ArquivoDoDiretorio.renameTo(FileIsRenamed);
        System.out.println(IsRenamed);

        File DiretorioRenamed = new File("pastinhanova");
        boolean isDiretorioRenamed =FileDiretorio.renameTo(DiretorioRenamed);
        System.out.println(isDiretorioRenamed);

    }
}
