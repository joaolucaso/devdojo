package Flocale;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Locale;
import java.util.Map;

public class ZonedTest01 {
    public static void main(String[] args) {
        Map<String, String> Shortids = ZoneId.SHORT_IDS;
        System.out.println(Shortids);
        ZoneId Tokyotime = ZoneId.of("Asia/Tokyo");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(Tokyotime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(Tokyotime);
        System.out.println("1-" + zonedDateTime);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);


        ZoneOffset offsetmanaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now(offsetmanaus);
        System.out.println(offsetDateTime1);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiEraLocalDate= LocalDate.of(1990,4,14);
         JapaneseDate meijiera = japaneseDate.from(meijiEraLocalDate);
        System.out.println(meijiera);



    }
}
