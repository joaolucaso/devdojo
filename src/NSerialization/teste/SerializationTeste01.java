package NSerialization.teste;

import NSerialization.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTeste01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1L, "João Lucas", "124321");
        serializar(aluno1);

    }

    private static void serializar(Aluno aluno1) {
        Path path = Paths.get("minhapasta/aluno.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno1);
        } catch (IOException e) {
            e.printStackTrace();
        }

      //  private static void deserializar {
            Path path1 = Paths.get("minhapasta/aluno.ser");
          //  try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path1))) {
            //    Aluno aluno = new (aluno1) ois.readObject();
            //    System.out.println(aluno);
         //   } catch (IOException | ClassNotFoundException e) {
            //    e.printStackTrace();
            }
        }
 //  }
//
