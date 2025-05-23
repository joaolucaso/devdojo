package Mcolecoes.test;

import Mcolecoes.test.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTeste01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("2222", "Pixel");
        Smartphone s3 = new Smartphone("3333", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("4392","Pixel");
         int indexSmartPhone4= smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartPhone4));
    }
}
