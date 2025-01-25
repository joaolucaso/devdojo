package HresourceBudle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBudleTeste01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("message", new Locale("pt", "BR"));

        System.out.println(bundle.getString("Ola"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("hi"));
        ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(bundle.getString("Ola"));
        System.out.println(bundle.getString("bom.dia"));
        System.out.println(bundle.getString("hi"));






    }
}
