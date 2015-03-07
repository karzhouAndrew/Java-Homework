package Tax;

/**
 * Created by Рома on 13.02.2015.
 */
public class TaxTest {
    public static void main(String[] args) {
        int paymentTax = MonthTax.MonthTax();
        System.out.println("Ваш подоходный налог: " +paymentTax);
    }
}
