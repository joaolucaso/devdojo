package Aexception.dominio;

public class loginexception extends Exception{
    public loginexception() {
        super("login inválido");
    }

    public loginexception(String message) {
        super(message);
    }
}
