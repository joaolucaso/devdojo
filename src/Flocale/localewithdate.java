package Flocale;

import java.text.DateFormat;
import java.util.Calendar;

import java.util.Locale;

public class localewithdate {
    public static void main(String[] args) {
        Locale localeitaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1= DateFormat.getDateInstance(DateFormat.FULL, localeitaly);
        DateFormat df2= DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println("italy "+df1.format(calendar.getTime()));
        System.out.println("suiça "+df2.format(calendar.getTime()));


    }
}
