package workbook2.lab1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Написать код выводящий число 153.5 в денежном виде для Украи-ны.
 */

public class Main {
    public static void main(String[] args) {
        Locale loc = new Locale("uk", "UA");
        NumberFormat uahFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(uahFormat.format(153.5));
    }
}
