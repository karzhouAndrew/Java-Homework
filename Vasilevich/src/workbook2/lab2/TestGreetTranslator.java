package workbook2.lab2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * Created by vasilevich on 26.03.2015.
 */
public class TestGreetTranslator {
    public static void main(String[] args) {
        System.out.println("Enter greet language:");
        System.out.println("\"0\" - English (default)");
        System.out.println("\"1\" - Belarus");
        System.out.println("\"2\" - Russian");
        Scanner scanner = new Scanner(System.in);

        String lang = scanner.next();
        TranslatorList greetTranslator = TranslatorList.ENGLISH;
        String bundleFile = "workbook2.lab2.GreetingBundle";

        if (lang.compareTo("1") == 0) {
            greetTranslator = TranslatorList.BELARUS;
        } else {
            if (lang.compareTo("2") == 0) {
                greetTranslator = TranslatorList.RUSSIAN;
            }
        }
        Locale locale = greetTranslator.getLocale();
        ResourceBundle rb = ResourceBundle.getBundle(bundleFile, locale);

        System.out.println(rb.getString("Hello"));
    }
}
