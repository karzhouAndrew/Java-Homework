package workbook.lab27;

/**
 * Created by Asus on 23.02.2015.
 */
public class WorkAtm {
    public static void main(String[] args) {
        Atm work = new Atm();
        TestAtm money = new TestAtm();
        int twenty = 1000;
        int fifty = 1000;
        int hundred = 1000;
        int sum = 70;

        work.getMoney(twenty, fifty, hundred);
        money.twenty = twenty;
        money.fifty = fifty;
        money.hundred = hundred;
        money.takeMoney(sum);

    }
}
