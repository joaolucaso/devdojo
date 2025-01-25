package Flocale;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTIME {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime date= LocalDate.parse("2022-08-06").atStartOfDay();
        LocalDateTime time = LocalDateTime.parse("22:10:00");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);


        LocalDateTime ltd1 =time.toLocalTime().atDate(LocalDate.from(date));
        System.out.println(ltd1);



    }
}
