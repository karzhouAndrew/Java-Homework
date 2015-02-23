package workbook.lab27;

/**
 * Created by Asus on 23.02.2015.
 */
public class Atm {
    int twenty;
    int fifty;
    int hundred;

    public Atm() {
        int twenty;
        int fifty;
        int hundred;
    }

    int getMoney(int twenty, int fifty, int hundred) {
        System.out.println("Денежная сумма добавленная в банкомат: " + (twenty * 20 + fifty * 50 + hundred * 100));
        return twenty * 20 + fifty * 50 + hundred * 100;
    }
}
