package workbook2.lab1;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by vasilevich on 26.03.2015.
 */
public class ConvertToUA {
    private Locale loc;

    public ConvertToUA() {
        loc = new Locale("uk", "UA");
    }

    public void convertMoney(double money) {
        NumberFormat uahFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(uahFormat.format(money));
    }
}
