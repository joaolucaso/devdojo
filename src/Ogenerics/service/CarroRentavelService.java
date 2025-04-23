package Ogenerics.service;

import Ogenerics.dominio.Carro;
import Ogenerics.dominio.Moto;

public class CarroRentavelService {
    public static void main(String[] args) {


    Aluguel<Carro> aluguelCarro = new Aluguel<>();
        aluguelCarro.alugar(new Carro());
        aluguelCarro.devolver();

    Aluguel<Moto> aluguelMoto = new Aluguel<>();
        aluguelMoto.alugar(new Moto());
        aluguelMoto.devolver();
    }
}
