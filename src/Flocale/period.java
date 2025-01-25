package Flocale;

import java.time.LocalDate;
import java.time.Period;

public class period {
    public static void main(String[] args) {
        LocalDate  now = LocalDate.now();
        LocalDate  nowafater = LocalDate.now().plusYears(2).plusDays(10);
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofMonths(10);
        System.out.println(p1);
    }
}
