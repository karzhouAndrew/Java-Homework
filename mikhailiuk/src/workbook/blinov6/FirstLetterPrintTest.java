package workbook.blinov6;

import workbook.blinov8.StringCutter;

/**
 * Created by Natashka on 20.02.2015.
 */
public class FirstLetterPrintTest {
    public static void main(String[] args) {
        String str = "Яна здесь гуляла енота. Юра экскаваторщик, яблоки его ого! А Аню кто что просит делать? Бред все везде мною написанное.";
        FirstLetterPrint firstLetterPrint = new FirstLetterPrint();
        StringCutter stringCutter = new StringCutter();
        firstLetterPrint.firstLetterPrint(stringCutter.cutter(str));
    }
}
