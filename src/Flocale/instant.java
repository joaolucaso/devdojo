package Flocale;

import java.time.Instant;
import java.time.LocalDateTime;

public class instant {
    public static void main(String[] args) {
Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());




    }
}
