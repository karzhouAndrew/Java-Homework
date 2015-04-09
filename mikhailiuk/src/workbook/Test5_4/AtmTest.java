package workbook.Test5_4;

/**
 * Created by Natashka on 22.02.2015.
 */
public class AtmTest {
    public static void main(String[] args) {
        Atm atm = new Atm(0, 2, 1);
        atm.withdraw(atm, 90);
        atm.addBanknotes(5, 5, 5);
    }
}
