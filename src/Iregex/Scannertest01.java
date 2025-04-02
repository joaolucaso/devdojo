package Iregex;

public class Scannertest01 {
    public static void main(String[] args) {

        String texto ="Levi,Eren,Mikasa";
        String[] nomes = texto.split("  ");
        for (String nome :nomes){

            System.out.println(nome.trim());
        }



    }
}
//Em Java, você pode usar expressões regulares (regex) com a classe Pattern e a
// classe Matcher do pacote java.util.regex. Regex é útil para validar, buscar e manipular strings.