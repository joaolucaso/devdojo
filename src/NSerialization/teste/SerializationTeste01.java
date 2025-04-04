package NSerialization.teste;

import NSerialization.dominio.Aluno;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//Serialização é o processo de converter um objeto em uma sequência de bytes para que ele possa ser salvo em
// um arquivo, transmitido pela rede ou armazenado em um banco de dados. O processo inverso, que reconstrói
// o objeto a partir dos bytes, é chamado de desserialização.
//Em Java, a serialização é feita com a interface Serializable, que permite
// que objetos de uma classe sejam convertidos para um formato que possa ser armazenado ou transmitido.
public class SerializationTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "João Lucas", "124321");
        serializar(aluno);

    }

    private static void serializar(Aluno aluno1) {
        Path path = Paths.get("minhapasta/aluno.ser");
        try (ObjectOutputStream oss = new ObjectOutputStream(Files.newOutputStream(path))) {
            oss.writeObject(aluno1);
        } catch (IOException e) {
            e.printStackTrace();
        }

      //private static void deserializar {
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
