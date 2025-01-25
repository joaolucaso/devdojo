package Dcalendar;

import java.util.Calendar;
import java.util.Date;

public class teste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek()==Calendar.SUNDAY){
            System.out.println("domingo primeiro dia da week");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        Date date = c.getTime();
        System.out.println(date);

    }
}
