package Aexception.dominio.teste;
import Aexception.dominio.loginexception;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (loginexception e) {
            throw new RuntimeException(e);
        }
    }
    private static void logar() throws loginexception {
        Scanner scanner = new Scanner (System.in);

        String userName = "Luizinhocafetao";
        String passWord = "cafeta";

        System.out.println("Usuario:");
        String typeUser =scanner.nextLine();
        System.out.println("senha:");
        String typePassWord=scanner.nextLine();
        if(!userName.equals(typeUser)|| !passWord.equals(typePassWord)){
            throw  new loginexception("Usuario ou Senha Inválido");
        }
        System.out.println("Usuario Logado com sucesso");
    }
}
