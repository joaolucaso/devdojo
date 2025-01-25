package Flocale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleWithCoins {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeitaly = new Locale("it","IT");
        Locale localeCH = new Locale("it","CH");
        Locale localeJp=Locale.JAPAN;
        Locale localeUs=Locale.US;

        NumberFormat[] nft = new NumberFormat[5];
        nft[0] = NumberFormat.getCurrencyInstance();
        nft[1] =NumberFormat.getCurrencyInstance(localeitaly);
        nft[2] =NumberFormat.getCurrencyInstance(localeCH);
        nft[3] =NumberFormat.getCurrencyInstance(localeJp);
        nft[4] =NumberFormat.getCurrencyInstance(localeUs);


        Double valor =22_34.34;

        for (NumberFormat numberFormat : nft) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));

        }
         String valorString="￥2,234.34";
        try {
            System.out.println(nft[3].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
