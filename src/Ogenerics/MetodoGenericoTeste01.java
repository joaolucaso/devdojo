package Ogenerics;

import Ogenerics.dominio.Carro;
import Ogenerics.dominio.Moto;

class VeiculoUtil {

    public static <T> void imprimirVeiculo(T veiculo) {
        System.out.println("Veículo: " + veiculo);
    }
public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        VeiculoUtil.imprimirVeiculo(carro);
        VeiculoUtil.imprimirVeiculo(moto);

    }
}
}
