// Написать код, выводящий число 153.5 в денежном виде для Украины.
package workbook2.workbook2Tasks.task1;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale loc = new Locale("ua", "UA");
        NumberFormat numFormat = NumberFormat.getCurrencyInstance(loc);
        System.out.println(numFormat.format(153.5));
    }
}
