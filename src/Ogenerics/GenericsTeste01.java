package Ogenerics;
class Caixa<T> {
    private T objeto;

    public void guardar(T obj) {
        this.objeto = obj;
    }

    public T pegar() {
        return objeto;
    }
}
public class GenericsTeste01 {
    public static void main(String[] args) {
        Caixa<String> caixa = new Caixa<>();
        caixa.guardar("Texto");
        String texto = caixa.pegar();
    }
}
