package Mcolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArraysConversaoTeste01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] integersArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integersArray));
        System.out.println("------------");
        Integer[] numerosArray = new Integer[3];
        numerosArray[1] = 1;
        numerosArray[0] = 2;
        numerosArray[2] = 3;
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        System.out.println("------------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);


    }
}
