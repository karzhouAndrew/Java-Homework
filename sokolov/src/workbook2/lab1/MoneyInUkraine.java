package workbook2.lab1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Написать код выводящий число 153.5 в денежном виде для украины
 */
public class MoneyInUkraine {
    public static void main(String[] args) {
        Locale locale = new Locale("uk", "UA");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(numberFormat.format(153.5));
    }
}



