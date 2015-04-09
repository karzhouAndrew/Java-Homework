package workbook2.test1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 сумма в украинской локали
 */
public class TestUA {
    public static void main(String[] args) {
        Locale localeUA = new Locale("uk", "UA");
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(localeUA);
        System.out.println(moneyFormat.format(153.5));
    }
}
