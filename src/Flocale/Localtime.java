package Flocale;

import java.time.LocalTime;

public class Localtime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12,33,10);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getMinute());
        System.out.println(time.getNano());
        System.out.println(time.getSecond());
    }
}
