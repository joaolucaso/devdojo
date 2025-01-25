package Iregex;

import java.util.Scanner;

public class Scannertest02 {
    public static void main(String[] args) {

        String texto = "Levi,Eren,Mikasa";
        String[] nomes = texto.split(" ");
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNextInt()) {

if (scanner.hasNextInt()){
    int i = scanner.nextInt();
    System.out.println("int:"+i);
    
} else if (scanner.hasNextBoolean()) {
    boolean b = scanner.hasNextBoolean();
    System.out.println("bolean"+b);
}else {
    System.out.println(scanner.next());
}
        }
    }
}
