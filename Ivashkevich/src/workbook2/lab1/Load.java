package workbook2.lab1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Написать код выводящий число 153.5 в денежном виде для Украи-ны.
 */
public class Load {
    public static void main(String[] args) {
        Locale L = new Locale("uk","UA");
        NumberFormat rub= NumberFormat.getCurrencyInstance(L);
        System.out.println(rub.format(153.4));
    }
}
