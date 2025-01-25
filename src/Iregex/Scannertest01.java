package Iregex;

public class Scannertest01 {
    public static void main(String[] args) {

        String texto ="Levi,Eren,Mikasa";
        String[] nomes = texto.split(" ");
        for (String nome :nomes){

            System.out.println(nome.trim());
        }



    }
}
