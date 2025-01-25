package Flocale;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class simpleDateFormat {
    public static void main(String[] args) {

        String patter="yyyy.MM.dd G 'at' HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patter);

        System.out.println( simpleDateFormat.format(new Date()));


    }
}
