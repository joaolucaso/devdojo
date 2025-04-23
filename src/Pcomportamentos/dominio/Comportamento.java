package Pcomportamentos.dominio;
interface Operacao {
    int executar(int a, int b);
}
public class Comportamento {
    public static void main(String[] args) {
        // Classe anônima define o comportamento
        Operacao soma = new Operacao() {
            public int executar(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Resultado: " + calcular(5, 3, soma));
    }
    public static int calcular(int x, int y, Operacao op) {
        return op.executar(x, y);
    }
}