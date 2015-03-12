package workbook.blinov4;

/**
 * Created by Natashka on 20.02.2015.
 */
public class SetLengthPrintTest {
    public static void main(String[] args) {
        String str = "Яна здесь что гуляла енота? Юра экскаваторщик, ого! А кто что яна просит делать? Бред все мною все написанное.";
        int length = 3;
        SetLengthPrint setLengthPrint = new SetLengthPrint();
        setLengthPrint.setLengthPrint(str, length);
    }
}
