package Gformatacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimefomartterTeste01 {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3= date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        DateTimeFormatter FormatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fomartoBR = LocalDate.now().format(FormatterBR);
        System.out.println(fomartoBR);






    }
}
