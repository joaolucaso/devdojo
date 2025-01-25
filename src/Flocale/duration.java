package Flocale;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class duration  {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime afaterTwoYears= LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeminus6 = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now,afaterTwoYears);
        Duration d2 = Duration.between(timeNow,timeminus6);
        Duration d3 = Duration.ofDays(10);
        System.out.println(d3);






    }
}
