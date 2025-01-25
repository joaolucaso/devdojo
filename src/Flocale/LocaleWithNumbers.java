package Flocale;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleWithNumbers {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeitaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeJp=Locale.JAPAN;
        Locale localeUs=Locale.US;

        NumberFormat [] nft = new NumberFormat[5];
        nft[0] = NumberFormat.getInstance();
        nft[1] =NumberFormat.getInstance(localeitaly);
        nft[2] =NumberFormat.getInstance(localeCH);
        nft[3] =NumberFormat.getInstance(localeJp);
        nft[4] =NumberFormat.getInstance(localeUs);


        Double valor =123_21.234242;

        for (NumberFormat numberFormat : nft) {
            System.out.println(numberFormat.format(valor));

        }


    }
}
