package Mcolecoes.test;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NaigableMapteste01 {
    public static void main(String[] args) {
        // Criando o TreeMap (que implementa NavigableMap)
        NavigableMap<Integer, String> mapa = new TreeMap<>();

        // Adicionando elementos
        mapa.put(10, "Banana");
        mapa.put(20, "Maçã");
        mapa.put(30, "Laranja");
        mapa.put(40, "Abacaxi");

        // Mostrando o mapa
        System.out.println("Mapa completo: " + mapa);

        // Métodos de NavigableMap:
        System.out.println("Menor chave maior que 20 (higherKey): " + mapa.higherKey(20));
        System.out.println("Maior chave menor que 30 (lowerKey): " + mapa.lowerKey(30));
        System.out.println("Chave igual ou maior mais próxima de 25 (ceilingKey): " + mapa.ceilingKey(25));
        System.out.println("Chave igual ou menor mais próxima de 25 (floorKey): " + mapa.floorKey(25));

        // Mapa em ordem reversa
        NavigableMap<Integer, String> mapaReverso = mapa.descendingMap();
        System.out.println("Mapa em ordem reversa: " + mapaReverso);


    }
}
